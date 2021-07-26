package org.zopad.matchmaker.bean;

import lombok.Value;

import java.util.List;

@Value
public class Party {
    private List<Player> members;
}
