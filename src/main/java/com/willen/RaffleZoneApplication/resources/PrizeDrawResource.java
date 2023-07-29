package com.willen.RaffleZoneApplication.resources;

import com.willen.RaffleZoneApplication.entities.PrizeDraw;
import com.willen.RaffleZoneApplication.services.PrizeDrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/prizedraw")
public class PrizeDrawResource {

    @Autowired
    private PrizeDrawService prizeDrawService;

    @PostMapping()
    ResponseEntity<PrizeDrawResource> createPrize(@RequestBody PrizeDraw prizeDraw) {
        prizeDrawService.save(prizeDraw);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(prizeDraw.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }
}
