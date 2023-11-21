package co.edu.cue.jpa.services;

import co.edu.cue.jpa.domain.entities.TicketReservation;

public interface TicketService {
    TicketReservation doReservation(TicketReservation reservation);
}
