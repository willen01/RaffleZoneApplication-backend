package com.willen.RaffleZoneApplication.services;

import com.willen.RaffleZoneApplication.entities.PrizeDraw;
import com.willen.RaffleZoneApplication.entities.Ticket;
import com.willen.RaffleZoneApplication.repositories.PrizeDrawRepository;
import com.willen.RaffleZoneApplication.repositories.TicketRepository;
import com.willen.RaffleZoneApplication.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public Ticket sellerTicket (Integer prizedrawId, Ticket ticketData) {
        Ticket ticket = ticketRepository.findByIdAndPrizeDrawId(ticketData.getId(), prizedrawId);

        ticket.setClient(ticketData.getClient());
        ticket.setPhone(ticketData.getPhone());
        ticket.setSeller(ticketData.getSeller());

        ticketRepository.save(ticket);
        return ticket;
    }

}
