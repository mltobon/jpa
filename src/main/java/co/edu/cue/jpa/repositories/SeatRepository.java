package co.edu.cue.jpa.repositories;

import co.edu.cue.jpa.domain.entities.Room;
import co.edu.cue.jpa.domain.entities.Seat;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SeatRepository extends CrudRepository<Seat,Integer> {

    List<Seat> findAllByRoom(Room room);
}
