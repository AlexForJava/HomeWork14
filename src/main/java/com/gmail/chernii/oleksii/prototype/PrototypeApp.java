package com.gmail.chernii.oleksii.prototype;

/**
 * Created by Space on 12.04.2019.
 */
public class PrototypeApp {
    public static void main(String[] args) {
        Room room = new Room(15, 4);
        Room roomCopy = (Room) room.copy();

        System.out.println(room);
        System.out.println(roomCopy);

    }
}
