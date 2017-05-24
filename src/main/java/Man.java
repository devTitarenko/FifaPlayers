import com.eisgroup.fifa_players.dao.PlayerDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Man {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        PlayerDao playerDao = context.getBean(PlayerDao.class);
        playerDao.list().forEach(System.out::println);
    }
}