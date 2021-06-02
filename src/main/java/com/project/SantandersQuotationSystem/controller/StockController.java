package com.project.SantandersQuotationSystem.controller;

import com.project.SantandersQuotationSystem.model.dto.StockDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/stock") //Defines the controller access location when using the url.
public class StockController {

    //Defining the method and putting JSON as the type of information that is consumed and returned.
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    //Defines the DTO information (coming from the frontend) as parameters to the endpoint.
    public ResponseEntity<StockDTO> save(@Valid @RequestBody StockDTO dto){
        return ResponseEntity.ok(dto);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> update (@RequestBody StockDTO dto){
        return ResponseEntity.ok(dto);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StockDTO>> findAll(){
        List<StockDTO> list = new ArrayList<>();
        StockDTO dto = new StockDTO();
        dto.setId(1L); //1 = Information; L = Long type.
        dto.setName("Magazine Luiza");
        dto.setPrice(100D); //1 = Information; D = Double type.
        dto.setVariation(10D);
        dto.setDate(LocalDate.now());
        list.add(dto);
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<StockDTO> findById(@PathVariable Long id){
        List<StockDTO> list = new ArrayList<>();
        StockDTO stock1 = new StockDTO();
        stock1.setId(1L); //1 = Information; L = Long type.
        stock1.setName("Magazine Luiza");
        stock1.setPrice(100D); //1 = Information; D = Double type.
        stock1.setVariation(10D);
        stock1.setDate(LocalDate.now());
        StockDTO stock2 = new StockDTO();
        stock2.setId(2L); //1 = Information; L = Long type.
        stock2.setName("Amazon");
        stock2.setPrice(200D); //1 = Information; D = Double type.
        stock2.setVariation(5D);
        stock2.setDate(LocalDate.now());
        list.add(stock1);
        list.add(stock2);
        StockDTO dtoSelected = list.stream().filter(x -> x.getId().compareTo(id) == 0).findFirst().get();
        return ResponseEntity.ok(dtoSelected);
    }
}
