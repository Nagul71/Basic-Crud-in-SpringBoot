package com.example.forsql.Service;
import com.example.forsql.Entity.Room;
import com.example.forsql.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class RoomService {


    @Autowired
    private RoomRepository roomRepository;

    public Room addRoom(Room room) {
        return roomRepository.save(room);
    }

    public List<Room> getrooms() {
        return roomRepository.findAll();
    }

    public Room updateRoom(int id, Room room) {
        Room existingRoom = roomRepository.findById(id).orElseThrow(() -> new RuntimeException("Room not found with id: " + id));
        // Update the fields
        existingRoom.setRoom_type(room.getRoom_type());
        existingRoom.setAvailable(room.isAvailable());
        return roomRepository.save(existingRoom);
    }

    public void deleteRoom(int id) {
        roomRepository.deleteById(id);
    }


    public List<Room> getRoomByViewAndRoomType(String room_type, String room_view) {
        return roomRepository.getRoomByViewAndRoomType(room_type,room_view);
    }
}
