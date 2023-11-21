package co.edu.cue.jpa.repositories;

import co.edu.cue.jpa.domain.entities.TicketReservation;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<TicketReservation, Integer> {
}
