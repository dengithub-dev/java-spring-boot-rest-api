package den.javaspringbootrestapi.service;

import den.javaspringbootrestapi.model.Users;
import den.javaspringbootrestapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repo;

    @Override
    public Optional< Users > findUser(Long id) {

        return repo.findById(id);

    }

    @Override
    public List<Users> findAll() {
        return repo.findAll();
    }

    @Override
    public  void delete(long id) {
        repo.deleteById(id);
    }
}
