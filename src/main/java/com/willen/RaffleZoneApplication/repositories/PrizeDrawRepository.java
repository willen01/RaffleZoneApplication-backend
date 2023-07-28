package com.willen.RaffleZoneApplication.repositories;

import com.willen.RaffleZoneApplication.entities.PrizeDraw;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrizeDrawRepository extends JpaRepository<PrizeDraw, Integer> {
}
