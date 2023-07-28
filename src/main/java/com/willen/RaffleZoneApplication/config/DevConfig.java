package com.willen.RaffleZoneApplication.config;

import com.willen.RaffleZoneApplication.entities.PrizeDraw;
import com.willen.RaffleZoneApplication.entities.Ticket;
import com.willen.RaffleZoneApplication.repositories.PrizeDrawRepository;
import com.willen.RaffleZoneApplication.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.List;

@Configuration
@Profile("dev")
public class DevConfig implements CommandLineRunner {

    @Autowired
    private PrizeDrawRepository prizeRepository;

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public void run(String... args) throws Exception {

        PrizeDraw prizeDraw = new PrizeDraw(null, "MotorCycle", 10, 10.00, Instant.now());
        Ticket ticket0 = new Ticket(null, 1, "Jhon Doe", "Maria Silva", "+55952345678", prizeDraw);
        Ticket ticket1 = new Ticket(null, 2, "Jhon Doe", "Maria Silva", "+55952345678", prizeDraw);
        Ticket ticket2 = new Ticket(null, 3, "Jhon Doe", "Maria Silva", "+55952345678", prizeDraw);
        Ticket ticket3 = new Ticket(null, 4, "Jhon Doe", "Maria Silva", "+55952345678", prizeDraw);
        Ticket ticket4 = new Ticket(null, 5, "Jhon Doe", "Maria Silva", "+55952345678", prizeDraw);
        Ticket ticket5 = new Ticket(null, 6, "Jhon Doe", "Maria Silva", "+55952345678", prizeDraw);
        Ticket ticket6 = new Ticket(null, 7, "Jhon Doe", "Maria Silva", "+55952345678", prizeDraw);
        Ticket ticket7 = new Ticket(null, 8, "Jhon Doe", "Maria Silva", "+55952345678", prizeDraw);
        Ticket ticket8 = new Ticket(null, 9, "Jhon Doe", "Maria Silva", "+55952345678", prizeDraw);
        Ticket ticket9 = new Ticket(null, 10, "Jhon Doe", "Maria Silva", "+55952345678", prizeDraw);

        this.prizeRepository.saveAll(List.of(prizeDraw));
        this.ticketRepository.saveAll(List.of(ticket0, ticket1, ticket2, ticket3, ticket4, ticket5, ticket6, ticket7,
                                             ticket8, ticket9));
    }
}
