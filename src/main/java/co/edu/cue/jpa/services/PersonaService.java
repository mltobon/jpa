package co.edu.cue.jpa.services;

import co.edu.cue.jpa.domain.entities.Person;

import java.util.List;

public interface PersonaService {
    List<Person> list();
    Person getPersonById(int id);
    Person save(Person person);
    Person update(Person person);
}
