package com.gmail.chernii.oleksii.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Space on 12.04.2019.
 */
@AllArgsConstructor
@Setter
@Getter
public class Room implements Copyable {
    private int number;
    private int level;

    @Override
    public Object copy() {
        Room room = new Room(number, level);
        return room;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", level=" + level +
                '}';
    }
}
