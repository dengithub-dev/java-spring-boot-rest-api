package den.javaspringbootrestapi.service;
import den.javaspringbootrestapi.model.*;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<Users> findAll();
    Optional<Users> findById(Long id);
    void delete(long id);
}
