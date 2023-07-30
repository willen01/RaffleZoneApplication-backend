package com.willen.RaffleZoneApplication.resources;

import com.willen.RaffleZoneApplication.entities.Ticket;
import com.willen.RaffleZoneApplication.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/tickets")
public class TickerResource {

    @Autowired
    TicketService ticketService;

    @PutMapping()
    ResponseEntity<Ticket> sellerTicket(@RequestParam(required = false) Integer idPrizedraw, @RequestBody Ticket ticket){
        Ticket sellerTicket = ticketService.sellerTicket(idPrizedraw, ticket);

        return ResponseEntity.ok().body(sellerTicket);
    }

}
