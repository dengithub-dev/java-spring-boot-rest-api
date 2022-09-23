package den.javaspringbootrestapi.controller;
import den.javaspringbootrestapi.model.*;
import den.javaspringbootrestapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<Users> getUsers(){

        return userService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Users> getUser(@PathVariable Long id){

        return userService.findId(id);
    }

    @PostMapping
    public Users saveUser (@RequestBody Users users){
        return userService.saveUser(users);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.delete(id);
    }

    // Update operation
    @PutMapping("/{id}")
    public Users updateUser(@RequestBody Users users, @PathVariable Long id) {
        return userService.updateUser(users, id);
    }

}
