package co.edu.cue.jpa.repositories;

import co.edu.cue.jpa.domain.entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository  extends CrudRepository<Person,Integer> {

}
