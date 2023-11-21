package co.edu.cue.jpa.services.impl;

import co.edu.cue.jpa.domain.entities.Person;
import co.edu.cue.jpa.repositories.PersonaRepository;
import co.edu.cue.jpa.services.PersonaService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonaServiceImpl implements PersonaService {
    private final PersonaRepository repository;

    public PersonaServiceImpl(PersonaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Person> list() {
        return (List<Person>)repository.findAll();
    }

    @Override
    public Person getPersonById(int id) {
        //lanzar excepcion personalizada
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Person save(Person person) {
        //debe llegar es un dto y ser mapeado.
        return repository.save(person);
    }

    @Override
    public Person update(Person person) {
        return repository.save(person);
    }
}
