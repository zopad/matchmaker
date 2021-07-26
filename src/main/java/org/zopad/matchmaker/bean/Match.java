package org.zopad.matchmaker.bean;

import lombok.Value;

import java.util.List;

@Value
public class Match {

    // A started match with default 10 players that's returned when the Matchmaker makes a match.
    List<Player> players;
}
