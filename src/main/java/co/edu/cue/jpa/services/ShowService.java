package co.edu.cue.jpa.services;

import co.edu.cue.jpa.domain.entities.Show;

import java.util.List;

public interface ShowService {
    Show getShowById(int id);

    List<Show> getAllShows();
}
