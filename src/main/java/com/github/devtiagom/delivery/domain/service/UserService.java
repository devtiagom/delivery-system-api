package com.github.devtiagom.delivery.domain.service;

import com.github.devtiagom.delivery.domain.model.UserEntity;
import com.github.devtiagom.delivery.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public List<UserEntity> getAllUsers() {
        return this.userRepository.findAll();
    }
}
