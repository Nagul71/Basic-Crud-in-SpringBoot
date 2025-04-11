package com.example.forsql.Repository;
import com.example.forsql.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room,Integer> {



    @Query(nativeQuery = true,value=
            "Select * from room where room_type = :room_type and room_view = :room_view"
    )
    List<Room> getRoomByViewAndRoomType(@Param("room_type") String room_type , @Param("room_view") String room_view);

}
