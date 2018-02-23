package com.inomera.teamcreator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Random;

@SpringBootApplication
public class TeamcreatorApplication {

    public static void main(String[] args) {
	final ConfigurableApplicationContext applicationContext = SpringApplication.run(TeamcreatorApplication.class, args);
	final TeamCreator teamCreator = applicationContext.getBean(TeamCreator.class);
	final List<Team> teams = teamCreator.createRandomTeams();
	teams.forEach(System.out::println);
	applicationContext.close();
    }

    @Bean
    @ConfigurationProperties(prefix = "player")
    public PlayerGroupsConfigurationProperties playerGroupsConfigurationProperties() {
	return new PlayerGroupsConfigurationProperties();
    }

    @Bean
    public Random random() {
	return new Random();
    }
}
