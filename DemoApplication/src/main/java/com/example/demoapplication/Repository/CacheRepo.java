package com.example.demoapplication.Repository;

import com.example.demoapplication.Entity.CacheEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CacheRepo extends JpaRepository<CacheEntity, Long> {

//    Optional<CacheEntity> findById(Long Long);
}
