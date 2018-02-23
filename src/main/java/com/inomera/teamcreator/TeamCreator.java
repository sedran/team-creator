package com.inomera.teamcreator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Serdar Kuzucu
 */
@Component
public class TeamCreator {

    @Autowired
    private PlayerGroupsConfigurationProperties playerGroupsConfigurationProperties;

    @Autowired
    private Random random;

    public List<Team> createRandomTeams() {
	final List<Team> teams = new ArrayList<>(2);
	teams.add(new Team());
	teams.add(new Team());

	playerGroupsConfigurationProperties.getGroups().forEach(group -> {
	    final int teamIndex1 = random.nextInt(2);
	    final int playerIndex1 = random.nextInt(2);
	    final int teamIndex2 = teamIndex1 == 0 ? 1 : 0;
	    final int playerIndex2 = playerIndex1 == 0 ? 1 : 0;

	    teams.get(teamIndex1).getPlayers().add(group.getPlayer(playerIndex1));
	    teams.get(teamIndex2).getPlayers().add(group.getPlayer(playerIndex2));
	});

	return teams;
    }
}
