package com.example.demoapplication.Controller;

import com.example.demoapplication.Dto.CacheDto;
import com.example.demoapplication.Entity.CacheEntity;
import com.example.demoapplication.Service.CacheService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prod")
public class CacheController {

    private final CacheService service;

    public CacheController(CacheService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public CacheEntity create(@RequestBody CacheDto cacheDto) {
        if (cacheDto.name() == null || cacheDto.name().isBlank()) {
            throw new RuntimeException("Product name is required");
        }
        return service.saveCache(cacheDto);
    }

    @GetMapping("/{id}")
    public CacheEntity get(@PathVariable Long id) {
        return service.getCache(id);
    }

    @PutMapping("/update")
    public CacheEntity update(@RequestBody CacheDto cacheDto) {
        if (cacheDto.id() == null) {
            throw new RuntimeException("Product ID is required");
        }
        return service.updateCache(cacheDto);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteProduct(id);
        return "Deleted & cache evicted for id: " + id;
    }

    @DeleteMapping("/cache/clear")
    public String clear() {
        service.clearAll();
        return "All cache cleared!";
    }
}