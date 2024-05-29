package com.example.demo.repository;

import com.example.demo.entity.Appareil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppareilRepository extends JpaRepository<Appareil, Long> {
}
