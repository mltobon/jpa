package co.edu.cue.jpa.services.impl;

import co.edu.cue.jpa.domain.entities.Show;
import co.edu.cue.jpa.repositories.ShowRepository;
import co.edu.cue.jpa.services.ShowService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowServiceImpl implements ShowService {
    private final ShowRepository repository;

    public ShowServiceImpl(ShowRepository repository) {
        this.repository = repository;
    }

    @Override
    public Show getShowById(int id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Show> getAllShows() {
        return (List<Show>)repository.findAll();
    }
}
