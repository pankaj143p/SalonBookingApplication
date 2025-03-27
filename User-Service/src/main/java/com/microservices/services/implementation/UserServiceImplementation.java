package com.microservices.services.implementation;
import com.microservices.model.User;
import com.microservices.repository.UserRepository;
import com.microservices.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImplementation implements UserService {

    private final UserRepository userRep;

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public User updateUser(Long id, User user) {
        return null;
    }
}
