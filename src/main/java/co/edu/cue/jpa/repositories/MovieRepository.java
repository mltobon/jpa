package co.edu.cue.jpa.repositories;

import co.edu.cue.jpa.domain.entities.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie,Integer> {
}
