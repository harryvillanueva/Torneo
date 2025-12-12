package com.ccc.torneo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TorneoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TorneoApplication.class, args);
    }
    @Bean
    CommandLineRunner init(com.daw.competitionGames.shared.storagefiles.domain.interfaces.StorageService storageService) {
        return (args) -> {
            storageService.init();
        };
    }

}
