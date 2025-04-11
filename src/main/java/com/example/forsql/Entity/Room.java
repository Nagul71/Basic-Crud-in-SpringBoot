package com.example.forsql.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Room {

    @Id
    private int room_id;
    private String room_type;
    private boolean available;
    private String room_view;

    public Room() {

    }

    public String getRoom_view() {
        return room_view;
    }

    public void setRoom_view(String room_view) {
        this.room_view = room_view;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
