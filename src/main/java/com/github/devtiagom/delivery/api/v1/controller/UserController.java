package com.github.devtiagom.delivery.api.v1.controller;

import com.github.devtiagom.delivery.domain.model.UserEntity;
import com.github.devtiagom.delivery.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserEntity> index() {
        return this.userService.getAllUsers();
    }
}
