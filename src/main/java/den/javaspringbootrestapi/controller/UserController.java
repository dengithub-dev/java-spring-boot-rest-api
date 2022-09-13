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
    public Optional<Users> getUser(@PathVariable String id){

        return userService.findById(Long.valueOf(id));
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable long id){
        userService.delete(id);
    }
}
