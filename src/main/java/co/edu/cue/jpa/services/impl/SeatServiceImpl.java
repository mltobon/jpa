package co.edu.cue.jpa.services.impl;

import co.edu.cue.jpa.domain.entities.Room;
import co.edu.cue.jpa.domain.entities.Seat;
import co.edu.cue.jpa.repositories.SeatRepository;
import co.edu.cue.jpa.services.SeatService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatServiceImpl implements SeatService {
    private final SeatRepository repository;

    public SeatServiceImpl(SeatRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Seat> getSeatListByRoom(Room room) {
        return repository.findAllByRoom(room);
    }

    @Override
    public Seat getSeatById(int id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Seat> getAllSeats() {
        return (List<Seat>)repository.findAll();
    }
}
