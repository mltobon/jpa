package co.edu.cue.jpa.controllers;

import co.edu.cue.jpa.domain.entities.Person;
import co.edu.cue.jpa.services.impl.PersonaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
@AllArgsConstructor
public class PersonController {
    private final PersonaService service;

    @GetMapping("/list")
    public String listAllPerson(Model model) {
        List<Person> personList = service.list();
        model.addAttribute("personList", personList);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model) {
        model.addAttribute("persona", new Person());
        return "form";
    }

    public String save(@Valid Person p, Model model){

    }

}
