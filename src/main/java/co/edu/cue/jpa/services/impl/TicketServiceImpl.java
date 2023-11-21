package co.edu.cue.jpa.services.impl;

import co.edu.cue.jpa.domain.entities.Seat;
import co.edu.cue.jpa.domain.entities.Show;
import co.edu.cue.jpa.domain.entities.TicketReservation;
import co.edu.cue.jpa.repositories.TicketRepository;
import co.edu.cue.jpa.services.SeatService;
import co.edu.cue.jpa.services.ShowService;
import co.edu.cue.jpa.services.TicketService;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
    private final TicketRepository repository;

    public TicketServiceImpl(TicketRepository repository) {
        this.repository = repository;
    }

    @Override
    public TicketReservation doReservation(TicketReservation ticketReservation) {
        return repository.save(ticketReservation);
    }

}
