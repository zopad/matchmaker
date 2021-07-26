package org.zopad.matchmaker.bean;

import lombok.Value;

import java.util.List;

@Value
public class Player {

    private int player_id;
    private int player_rating;
    private List<Integer> ignoredPlayers;
    private List<GameMode> gameModes;
    private List<MM_Region> preferredRegions;

}
