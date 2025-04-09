package com.example.forsql.Controller;
import com.example.forsql.Entity.Room;
import com.example.forsql.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public String updateroom(@PathVariable String id , @RequestBody Room room)
    {
        roomService.updateRoom(id,room);
        return "Room Details Modified Successfully";
    }

    @DeleteMapping("/deleteroom/{id}")
    public String deleteroom(@PathVariable String id)
    {
        roomService.deleteRoom(id);
        return "Room Deleted Successfully";
    }


}
