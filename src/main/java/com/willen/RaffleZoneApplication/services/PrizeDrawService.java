package com.willen.RaffleZoneApplication.services;

import com.willen.RaffleZoneApplication.entities.PrizeDraw;
import com.willen.RaffleZoneApplication.entities.Ticket;
import com.willen.RaffleZoneApplication.repositories.PrizeDrawRepository;
import com.willen.RaffleZoneApplication.repositories.TicketRepository;
import com.willen.RaffleZoneApplication.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

@Service
public class PrizeDrawService {

    @Autowired
    private PrizeDrawRepository prizeDrawRepository;

    @Autowired
    private TicketRepository ticketRepository;

    public void save(PrizeDraw prizeDraw) {
        prizeDraw.setCreatedAt(Instant.now());
        PrizeDraw savedDraw = prizeDrawRepository.save(prizeDraw);

        List<Ticket> tickets = generateTickets(savedDraw);
        ticketRepository.saveAll(tickets);
    }

    private List<Ticket> generateTickets(PrizeDraw prizeDraw) {
        int ticketQuantity = prizeDraw.getTicket_quantity();
        List<Ticket> tickets = new ArrayList<>();

        IntStream.rangeClosed(1, ticketQuantity).forEach(ticketNumber -> {
            Ticket ticket = new Ticket();
            ticket.setTicket_number(ticketNumber);
            ticket.setPrizeDraw(prizeDraw);
            tickets.add(ticket);
        });

        return tickets;
    }

    public PrizeDraw findById(Integer id) {
        Optional<PrizeDraw> prizeDraw = prizeDrawRepository.findById(id);
        return  prizeDraw.orElseThrow(() -> new ResourceNotFoundException("prizedraw not found"));
    }
}
