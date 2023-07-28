package com.willen.RaffleZoneApplication.repositories;

import com.willen.RaffleZoneApplication.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
