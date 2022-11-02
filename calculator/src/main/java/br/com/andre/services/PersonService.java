package br.com.andre.services;

import br.com.andre.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();

    public Person create(Person person){
        return person;
    }

    public Person update(Person person){
        return person;
    }

    public void delete(String id){
    }

    public Person findByid(String id){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Andre");
        person.setLastName("Vogel");
        person.setAdress("Rua a");
        person.setGemder("M");
        return person;

    }

    public List<Person> findAll(){
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    private Person mockPerson(int i) {

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Andre" + i);
        person.setLastName("Vogel"+ i);
        person.setAdress("Rua a"+ i);
        person.setGemder("M");
        return person;

    }


}
