package com.saving.images.services;

import com.saving.images.entities.User;
import com.saving.images.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(String name, String email, String path) {
        User user = new User();
        user .setName(name);
        user.setEmail(email);
        user.setPhoto(path);

        return userRepository.save(user);
    }
}