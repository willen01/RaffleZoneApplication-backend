package com.willen.RaffleZoneApplication.repositories;

import com.willen.RaffleZoneApplication.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    Ticket findByIdAndPrizeDrawId (Integer ticketId, Integer prizeDraw);
}
