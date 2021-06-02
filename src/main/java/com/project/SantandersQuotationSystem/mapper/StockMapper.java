package com.project.SantandersQuotationSystem.mapper;


import com.project.SantandersQuotationSystem.model.Stock;
import com.project.SantandersQuotationSystem.model.dto.StockDTO;
import org.springframework.stereotype.Component;

@Component
public class StockMapper {
    public Stock toEntity(StockDTO dto) {
        Stock stock = new Stock();
        stock.setId(dto.getId());
        stock.setName(dto.getName());
        stock.setPrice(dto.getPrice());
        stock.setVariation(dto.getVariation());
        stock.setDate(dto.getDate());
        return stock;
    }
}
