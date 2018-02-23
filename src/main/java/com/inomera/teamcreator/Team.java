package com.inomera.teamcreator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Serdar Kuzucu
 */
public class Team {
    private List<String> players = new ArrayList<>();

    public List<String> getPlayers() {
	return players;
    }

    @Override
    public String toString() {
	final StringBuilder sb = new StringBuilder("Team [");
	sb.append("players=");
	sb.append(players);
	sb.append("]");
	return sb.toString();
    }
}
