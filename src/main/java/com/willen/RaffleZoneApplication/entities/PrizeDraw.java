package com.willen.RaffleZoneApplication.entities;

import jakarta.persistence.Entity;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
public class PrizeDraw implements Serializable {

    private Integer id;
    private String award;
    private Double ticket_value;
    private Integer ticket_quantity;
    private Instant createdAt;

    public PrizeDraw() {
    }

    public PrizeDraw(Integer id, String award, Integer ticket_quantity ,Double ticket_value, Instant createdAt) {
        this.id = id;
        this.award = award;
        this.ticket_quantity = ticket_quantity;
        this.ticket_value = ticket_value;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public Integer getTicket_quantity() {
        return ticket_quantity;
    }

    public void setTicket_quantity(Integer ticket_quantity) {
        this.ticket_quantity = ticket_quantity;
    }

    public Double getTicket_value() {
        return ticket_value;
    }

    public void setTicket_value(Double ticket_value) {
        this.ticket_value = ticket_value;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrizeDraw prizeDraw = (PrizeDraw) o;
        return Objects.equals(id, prizeDraw.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
