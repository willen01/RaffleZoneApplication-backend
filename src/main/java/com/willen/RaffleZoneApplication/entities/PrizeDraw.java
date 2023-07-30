package com.willen.RaffleZoneApplication.entities;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class PrizeDraw implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private Integer id;

    private String prizeDraw_name;

    @Schema(description = "ticket_value", example = "2.50")
    private Double ticket_value;

    @Schema(description = "ticket_quantity", example = "20")
    private Integer ticket_quantity;

    @Hidden
    private Instant createdAt;

    @ElementCollection
    private List<Award> award;

    @OneToMany(mappedBy = "prizeDraw")
    List<Ticket> tickets = new ArrayList<>();

    public PrizeDraw() {
    }

    public PrizeDraw(Integer id, String prizeDraw_name,List<Award> award, Integer ticket_quantity ,Double ticket_value,
                     Instant createdAt) {
        this.id = id;
        this.prizeDraw_name = prizeDraw_name;
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

    public String getPrizeDraw_name() {
        return prizeDraw_name;
    }

    public void setPrizeDraw_name(String prizeDraw_name) {
        this.prizeDraw_name = prizeDraw_name;
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

    public List<Award> getAward() {
        return award;
    }

    public void setAward(List<Award> award) {
        this.award = award;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Embeddable
    public static class Award {

        private String name;
        private String description;
        private Integer quantity;

        private String imageUrl;
        private boolean active;

        public Award() {
        }

        public Award(String name, String description, Integer quantity,String imageUrl, boolean active) {
            this.name = name;
            this.description = description;
            this.quantity = quantity;
            this.imageUrl = imageUrl;
            this.active = active;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }


        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public boolean isActive() {
            return active;
        }

        public void setActive(boolean active) {
            this.active = active;
        }
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
