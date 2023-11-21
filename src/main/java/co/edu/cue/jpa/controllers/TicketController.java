package co.edu.cue.jpa.controllers;

import co.edu.cue.jpa.domain.entities.Person;
import co.edu.cue.jpa.domain.entities.Seat;
import co.edu.cue.jpa.domain.entities.Show;
import co.edu.cue.jpa.domain.entities.TicketReservation;
import co.edu.cue.jpa.services.SeatService;
import co.edu.cue.jpa.services.ShowService;
import co.edu.cue.jpa.services.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping
@AllArgsConstructor
public class TicketController {

    private final TicketService ticketService;
    private final ShowService showService;
    private final SeatService seatService;

    @GetMapping("/create-ticket")
    public ModelAndView createTicket() {
        ModelAndView modelAndView = new ModelAndView("ticketForm");
        modelAndView.addObject("shows",showService.getAllShows());
        modelAndView.addObject("seats", seatService.getAllSeats());
        return modelAndView;
    }

    @PostMapping("/new-ticket")
    public String createNewSchedule(@RequestParam("show") int showId,
                                    @RequestParam("seat") int seatId) {
        // Obtener los objetos Show y Seat utilizando los IDs
        Show show = showService.getShowById(showId);
        Seat seat = seatService.getSeatById(seatId);

        TicketReservation ticketReservation =  new TicketReservation();
        // Configurar los objetos en la reserva del ticket
        ticketReservation.setShow(show);
        ticketReservation.setSeat(seat);

        // Guardar la reserva del boleto en la base de datos
        ticketService.doReservation(ticketReservation);
        return "redirect:/create?success"; // Redireccionar al formulario con un mensaje de éxito
    }
}
