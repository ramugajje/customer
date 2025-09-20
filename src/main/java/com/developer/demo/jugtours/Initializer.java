package com.developer.demo.jugtours;


import com.developer.demo.model.Client;
import com.developer.demo.model.Event;
import com.developer.demo.model.Group;
import com.developer.demo.repository.ClientRepository;
import com.developer.demo.repository.GroupRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Collections;
import java.util.stream.Stream;

//@Component
class Initializer implements CommandLineRunner {

    private final GroupRepository repository;
    private final ClientRepository clientRepository;

    public Initializer(GroupRepository repository, ClientRepository clientRepository) {
        this.repository = repository;
        this.clientRepository = clientRepository;
    }

    @Override
    public void run(String... strings) {
        Stream.of("Seattle JUG", "Denver JUG", "Dublin JUG",
                "London JUG").forEach(name ->
                repository.save(new Group(name))
        );

        Group djug = repository.findByName("Seattle JUG");
        Event e = Event.builder().title("Micro Frontends for Java Developers")
                .description("JHipster now has microfrontend support!")
                .date(Instant.parse("2022-09-13T17:00:00.000Z"))
                .build();
        djug.setEvents(Collections.singleton(e));
        repository.save(djug);

        repository.findAll().forEach(System.out::println);
        clientRepository.save(Client.builder().id(1L).name("A").email("a@gmail.com").build());
        clientRepository.save(Client.builder().id(2L).name("B").email("b@gmail.com").build());
        clientRepository.save(Client.builder().id(3L).name("C").email("c@gmail.com").build());
    }
}