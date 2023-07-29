package com.willen.RaffleZoneApplication.openAPI;

import com.willen.RaffleZoneApplication.entities.PrizeDraw;
import com.willen.RaffleZoneApplication.resources.PrizeDrawResource;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Sorteio")
public interface PrizeDrawOpenAPI {
    @Operation(summary = "cadastra um novo sorteio")
    ResponseEntity<PrizeDrawResource> createPrize(PrizeDraw prizeDraw);
}
