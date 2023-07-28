package com.willen.RaffleZoneApplication.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Ticket implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer ticket_number;
    private String seller;
    private String client;
    private String phone;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "prizedraw_id")
    private PrizeDraw prizeDraw;

    public Ticket() {
    }

    public Ticket(Integer id, Integer ticket_number, String seller, String client, String phone, PrizeDraw prizeDraw) {
        this.id = id;
        this.ticket_number = ticket_number;
        this.seller = seller;
        this.client = client;
        this.phone = phone;
        this.prizeDraw = prizeDraw;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTicket_number() {
        return ticket_number;
    }

    public void setTicket_number(Integer ticket_number) {
        this.ticket_number = ticket_number;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public PrizeDraw getPrizeDraw() {
        return prizeDraw;
    }

    public void setPrizeDraw(PrizeDraw prizeDraw) {
        this.prizeDraw = prizeDraw;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(id, ticket.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
