package polytech.covidalert.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.gson.GsonProperties;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import polytech.covidalert.models.User;
import polytech.covidalert.models.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> list() {
        System.out.println("enter here");
        return userRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public User get(@PathVariable Long id) {
        return userRepository.getOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody final User user) {
        return userRepository.saveAndFlush(user);
    }
}
