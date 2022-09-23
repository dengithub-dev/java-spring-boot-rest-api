package den.javaspringbootrestapi.service;

import den.javaspringbootrestapi.model.Users;
import den.javaspringbootrestapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repo;

    // Save operation
    @Override
    public Users saveUser(Users users)
    {
        return repo.save(users);
    }

    @Override
    public Optional< Users > findId(Long id) {

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

    // Update User
    @Override
    public  Users updateUser(Users users, Long id)
    {
        Users userDb = repo.findById(id).get();

        if (Objects.nonNull(users.getName()) && !"".equalsIgnoreCase(users.getName())) {
            userDb.setName( users.getName());
        }
        if (Objects.nonNull(users.getAddress()) && !"".equalsIgnoreCase(users.getAddress())) {
            userDb.setAddress( users.getAddress());
        }
        if (Objects.nonNull(users.getEmail()) && !"".equalsIgnoreCase(users.getEmail())) {
            userDb.setEmail( users.getEmail());
        }
        if (Objects.nonNull(users.getPassword()) && !"".equalsIgnoreCase(users.getPassword())) {
            userDb.setPassword( users.getPassword());
        }

        return repo.save(userDb);
    }
}
