package com.willen.RaffleZoneApplication.resources;

import com.willen.RaffleZoneApplication.entities.PrizeDraw;
import com.willen.RaffleZoneApplication.openAPI.PrizeDrawOpenAPI;
import com.willen.RaffleZoneApplication.services.PrizeDrawService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/prizedraw")
public class PrizeDrawResource implements PrizeDrawOpenAPI {

    @Autowired
    private PrizeDrawService prizeDrawService;

    @PostMapping()
    @ApiResponses(value = @ApiResponse(responseCode = "201", description = "status 200 - created"))
    public ResponseEntity<PrizeDrawResource> createPrize(@RequestBody @Valid PrizeDraw prizeDraw) {
        prizeDrawService.save(prizeDraw);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(prizeDraw.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PrizeDraw> findPrizeDrawById(@PathVariable Integer id) {
        PrizeDraw prizeDraw = prizeDrawService.findById(id);
        return ResponseEntity.ok().body(prizeDraw);
    }

}
