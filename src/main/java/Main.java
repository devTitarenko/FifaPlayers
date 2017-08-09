import com.titarenko.fifa_players.repository.PlayerRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        PlayerRepository repository = context.getBean(PlayerRepository.class);
        repository.findAll().forEach(System.out::println);
    }
}