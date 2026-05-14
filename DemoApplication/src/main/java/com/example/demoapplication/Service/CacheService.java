package com.example.demoapplication.Service;

import com.example.demoapplication.Dto.CacheDto;
import com.example.demoapplication.Entity.CacheEntity;
import com.example.demoapplication.Repository.CacheRepo;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    private final CacheRepo cacheRepo;

    public CacheService(CacheRepo cacheRepo) {
        this.cacheRepo = cacheRepo;
    }

    @CachePut(value = "products", key = "#result.id")
    public CacheEntity saveCache(CacheDto cacheDto) {
        System.out.println("Saving to DB... name = " + cacheDto.name());

        CacheEntity entity = new CacheEntity(
                null,
                cacheDto.name(),
                cacheDto.price()
        );

        return cacheRepo.save(entity);
    }

    @Cacheable(value = "products", key = "#id")
    public CacheEntity getCache(Long id) {
        System.out.println("Getting from DB... id = " + id);
        return cacheRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found for id: " + id));
    }

    @CachePut(value = "products", key = "#cacheDto.id")
    public CacheEntity updateCache(CacheDto cacheDto) {
        System.out.println("Updating DB... id = " + cacheDto.id());

        CacheEntity existing = cacheRepo.findById(cacheDto.id())
                .orElseThrow(() -> new RuntimeException("Product not found for id: " + cacheDto.id()));

        existing.setName(cacheDto.name());
        existing.setPrice(cacheDto.price());

        return cacheRepo.save(existing);
    }

    @CacheEvict(value = "products", key = "#id")
    public void deleteProduct(Long id) {
        System.out.println("Deleting from DB... id = " + id);
        if (!cacheRepo.existsById(id)) {
            throw new RuntimeException("Product not found for id: " + id);
        }
        cacheRepo.deleteById(id);
    }

    @CacheEvict(value = "products", allEntries = true)
    public void clearAll() {
        System.out.println("Cache cleared!");
    }
}