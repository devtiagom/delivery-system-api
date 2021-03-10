package com.github.devtiagom.delivery.util.database.service;

import com.github.devtiagom.delivery.domain.model.UserEntity;
import com.github.devtiagom.delivery.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class DBTestService {

    private final UserRepository userRepository;

    public void seedData() {
        Set<UserEntity> users = new HashSet<>();

        UserEntity user = UserEntity.builder()
                .id(UUID.randomUUID())
                .name("Fulana de Tal")
                .email("fulana.tal@gmail.com")
                .cpf("11111111111")
                .password("1234")
                .build();

        users.add(user);

        user = new UserEntity().builder()
                .id(UUID.randomUUID())
                .name("Cicrano de Tal")
                .email("cicrano.tal@gmail.com")
                .cpf("22222222222")
                .password("1234")
                .build();

        users.add(user);

        user = new UserEntity().builder()
                .id(UUID.randomUUID())
                .name("Badanha Jr")
                .email("badanha.jr@gmail.com")
                .cpf("33333333333")
                .password("123456")
                .build();

        users.add(user);

        this.userRepository.saveAll(users);
    }
}
