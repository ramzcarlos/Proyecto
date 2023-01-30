package org.bedu.crp.Proyecto.controller;


import org.bedu.crp.Proyecto.model.Spectrum;
import org.bedu.crp.Proyecto.repository.ISpectrumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
public class SpectrumController
{

    private ISpectrumRepository repository;
    @Autowired
    public SpectrumController (ISpectrumRepository repository){
        this.repository=repository;
    }
    @PostMapping("/spec")
    public ResponseEntity<Void> creaSpectrum(@Valid @RequestBody Spectrum spectrum){
        System.out.println(spectrum.getName());
        return ResponseEntity.created(URI.create("1")).build();
    }
    @GetMapping("/getSpectrum")
    public List<Spectrum> getSpectrum(Spectrum spectrum){
        System.out.println(spectrum.getName());
        return repository.findAll();
    }
}
