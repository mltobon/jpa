package co.edu.cue.jpa.repositories;

import co.edu.cue.jpa.domain.entities.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room,Integer> {
}
