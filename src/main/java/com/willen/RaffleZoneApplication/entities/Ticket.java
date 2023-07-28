package com.willen.RaffleZoneApplication.entities;

import jakarta.persistence.Entity;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Ticket implements Serializable {

    private Integer id;
    private Integer ticket_number;
    private String seller;
    private String client;
    private String phone;

    public Ticket() {
    }

    public Ticket(Integer id, Integer ticket_number, String seller, String client, String phone) {
        this.id = id;
        this.ticket_number = ticket_number;
        this.seller = seller;
        this.client = client;
        this.phone = phone;
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
