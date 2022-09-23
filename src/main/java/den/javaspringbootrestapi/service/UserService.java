package den.javaspringbootrestapi.service;
import den.javaspringbootrestapi.model.*;

import java.util.List;
import java.util.Optional;

public interface UserService {
    //Save Users
    Users saveUser(Users users);
    //Read all Users
    List<Users> findAll();
    //Read single User
    Optional<Users> findId(Long id);
    //Delete User
    void delete(long id);
    //Update User
    Users updateUser(Users users, Long id);
}
