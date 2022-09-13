package den.javaspringbootrestapi.controller;
import den.javaspringbootrestapi.model.*;
import den.javaspringbootrestapi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepo;

    @GetMapping("api/")
    public List<Users> getUsers(){

        return userRepo.findAll();
    }

    @GetMapping("api/{id}")
    public Optional<Users> getUser(@PathVariable Long id){

        return userRepo.findById(id);
    }
}
