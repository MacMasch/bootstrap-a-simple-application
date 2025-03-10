package ch.martinschuler.bootstrapsimpleapplication.backend;

import ch.martinschuler.bootstrapsimpleapplication.backend.model.User;
import ch.martinschuler.bootstrapsimpleapplication.backend.repo.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

/**
 * @see <a href="https://www.baeldung.com/spring-boot-angular-web">Building a Web Application with Spring Boot and Angular</a>
 */
@SpringBootApplication
public class BackendApplication {

    public static void main(final String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    // @Bean
    CommandLineRunner init(final UserRepository userRepository) {
        return args -> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
                final User user = new User(name, name.toLowerCase() + "@domain.com");
                userRepository.save(user);
            });
            userRepository.findAll().forEach(System.out::println);
        };
    }
}
