package com.github.devtiagom.delivery.configuration;

import com.github.devtiagom.delivery.util.database.service.DBTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@RequiredArgsConstructor
@Configuration
@Profile("test")
public class DBTestConfig {

    private final DBTestService dbService;

    @Bean
    public boolean databaseSeeder() {
        this.dbService.seedData();
        return Boolean.TRUE;
    }
}
