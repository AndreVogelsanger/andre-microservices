package br.com.andre.controllers;

import br.com.andre.model.Person;
import br.com.andre.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/person")
public class PersonController {

   @Autowired
    PersonService service;

    @GetMapping()
    public List<Person> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable(value = "id") String id) {
        return service.findByid(id);
    }

    @PostMapping()
    public Person create(@RequestBody Person person) {
        return service.create(person);
    }

    @PutMapping()
    public Person update(@RequestBody Person person) {
        return service.update(person);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(value = "id") String id) {
         service.delete(id);
    }



}
