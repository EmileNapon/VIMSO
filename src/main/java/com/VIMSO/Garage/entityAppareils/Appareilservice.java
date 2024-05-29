package com.example.demo.service;

import com.example.demo.entity.Appareil;
import com.example.demo.repository.AppareilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppareilService {

    @Autowired
    private AppareilRepository appareilRepository;

    public Appareil saveAppareil(Appareil appareil) {
        return appareilRepository.save(appareil);
    }

    public List<Appareil> getAllAppareils() {
        return appareilRepository.findAll();
    }
}
