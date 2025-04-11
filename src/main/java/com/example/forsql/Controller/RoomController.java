package com.example.forsql.Controller;
import com.example.forsql.Entity.Room;
import com.example.forsql.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class RoomController {


    @Autowired
    private RoomService roomService;

    @PostMapping("/addroom")
    public String addroom(@RequestBody Room room)
    {
        roomService.addRoom(room);
        return "Room added Successfully";

    }

    @GetMapping("/getrooms")
    public List<Room> getrooms()
    {
        return roomService.getrooms();
    }

    @PutMapping("/updateroom/{id}")
    public String updateroom(@PathVariable int id , @RequestBody Room room)
    {
        roomService.updateRoom(id,room);
        return "Room Details Modified Successfully";
    }

    @DeleteMapping("/deleteroom/{id}")
    public String deleteroom(@PathVariable int id)
    {
        roomService.deleteRoom(id);
        return "Room Deleted Successfully";
    }

    @GetMapping("/byviewandtype")
    public List<Room> getRoomByViewAndRoomType(@Param("room_type") String room_type, @Param("room_view") String room_view)
    {
        return roomService.getRoomByViewAndRoomType(room_type,room_view);
    }


}
