package com.lokaty.controller;

import com.lokaty.exception.ResourceNotFoundException;
import com.lokaty.model.Lokata;
import com.lokaty.repository.LokataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LokataController {

    @Autowired
    private LokataRepository lokataRepository;

    @RequestMapping(value = "/investments", method = RequestMethod.GET)
    public List<Lokata> listaLokat(){
        return this.lokataRepository.findAll();
    }

    @RequestMapping(value = "/investments", method = RequestMethod.POST)
    public Lokata nowaLokata(@RequestBody Lokata lokata){
        return this.lokataRepository.save(lokata);
    }

    @RequestMapping(value = "/investments/{id}/calculations", method = RequestMethod.POST)
    public ResponseEntity<Lokata> zyskLokaty(@PathVariable("id") Long id) throws ResourceNotFoundException {
        Lokata lokata = lokataRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Nie znaleziono lokaty o podanym numerze id: " + id));
        return ResponseEntity.ok().body(lokata);
    }

    @RequestMapping(value = "/investments/{id}/calculations", method = RequestMethod.GET)
    public String kalkulacjeHistoryczne(@PathVariable("id") Long id){
        return "Podane id:" + id;
    }
}
