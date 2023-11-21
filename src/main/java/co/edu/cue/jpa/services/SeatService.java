package co.edu.cue.jpa.services;

import co.edu.cue.jpa.domain.entities.Room;
import co.edu.cue.jpa.domain.entities.Seat;

import java.util.List;

public interface SeatService {

    List<Seat> getSeatListByRoom(Room room);
    Seat getSeatById(int id);

    List<Seat> getAllSeats();
}
