package com.skima.Service;

import com.skima.Repository.UserRepository;
import com.skima.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers()
    {
        return this.userRepository.findAll();
    }

    public User createUser(User user)
    {
        return this.userRepository.save(user);
    }

    public Optional<User> singleUser(Integer id){
        return this.userRepository.findById(id);
    }

}
