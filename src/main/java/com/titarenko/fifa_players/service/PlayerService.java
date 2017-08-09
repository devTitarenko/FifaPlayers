package com.titarenko.fifa_players.service;

import com.titarenko.fifa_players.model.Player;
import com.titarenko.fifa_players.model.Position;
import com.titarenko.fifa_players.model.Skill;
import com.titarenko.fifa_players.repository.PlayerRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

@org.springframework.stereotype.Service
@ManagedBean
@SessionScoped
@Getter
@Setter
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    private Iterable<Player> list;

    private Player player;

    @PostConstruct
    private void init() {
        list = playerRepository.findAll();
//        sortedList(list);
    }

    public void startCreateEdit(Player player) {
        if (player == null) {
            player = new Player();
            player.setPosition(Position.CAM);
            player.setSkill(Skill.ONE);
        }
        setPlayer(player);
    }

    public void sortedList(List<Player> playerList) {
        if (playerList != null && playerList.size() > 1)
            sortedList(playerList, new Comparator<Player>() {
                @Override
                public int compare(Player player1, Player player2) {
                    if (player1 != null && player2 != null) {
                        int stats = player2.getStats() - player1.getStats();
                        int price = player2.getCosts() - player1.getCosts();
                        return stats != 0 ? stats : price;
                    } else if (player1 != null) {
                        return -1;
                    } else if (player2 != null) {
                        return 1;
                    } else return 0;
                }
            });
    }

    public void sortedList(List<Player> playerList, Comparator comparator) {
        if (playerList != null && playerList.size() > 1 && comparator != null)
            playerList.sort(comparator);
    }

    public void savePlayer() {
        playerRepository.save(player);
        init();
    }

    public void editPlayer(Player player) throws IOException {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().getSessionMap().put("player", player);

        HttpServletResponse response = (HttpServletResponse) context.getExternalContext().getResponse();
        response.sendRedirect("save_update_player.xhtml");
    }

    public void deletePlayer(Player player) {
        playerRepository.delete(player);
        init();
    }
}