package ch.martinschuler.bootstrapsimpleapplication.backend.controller;

import ch.martinschuler.bootstrapsimpleapplication.backend.model.User;
import ch.martinschuler.bootstrapsimpleapplication.backend.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// This step isn't always necessary, but since we're deploying our Angular frontend to http://localhost:4200, and our Boot backend to http://localhost:8080, the browser would otherwise deny requests from one to the other.
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}