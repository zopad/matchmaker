package org.zopad.matchmaker.bean;

import lombok.Value;

@Value
public enum GameMode {
    ALL_PICK,
    SINGLE_DRAFT,
    CAPTAINS_MODE,
    ALL_RANDOM_DEATHMATCH
}
