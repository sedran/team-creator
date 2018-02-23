package com.inomera.teamcreator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Serdar Kuzucu
 */
public class PlayerGroupsConfigurationProperties {
    private List<PlayerPair> groups = new ArrayList<>();

    public List<PlayerPair> getGroups() {
	return groups;
    }

    public void setGroups(List<PlayerPair> groups) {
	this.groups = groups;
    }

    public static class PlayerPair {
	private String player1;
	private String player2;

	public String getPlayer1() {
	    return player1;
	}

	public void setPlayer1(String player1) {
	    this.player1 = player1;
	}

	public String getPlayer2() {
	    return player2;
	}

	public void setPlayer2(String player2) {
	    this.player2 = player2;
	}

	public String getPlayer(int index) {
	    return index == 0 ? player1 : player2;
	}
    }
}
