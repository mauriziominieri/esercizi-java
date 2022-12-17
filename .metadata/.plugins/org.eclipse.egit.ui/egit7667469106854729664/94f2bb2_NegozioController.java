package com.bookingbarbieri.server.controller;

import com.bookingbarbieri.server.dto.NegozioDTO;
import com.bookingbarbieri.server.model.Negozio;
import com.bookingbarbieri.server.repository.NegozioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/negozio")
public class NegozioController {
    
    @Autowired
    private NegozioRepository negozioRepository;





    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String createNegozio(@Validated @RequestBody NegozioDTO negozio){

        Negozio negozioToSave = new Negozio(negozio.getNome(), 
                                            negozio.getIndirizzo(), 
                                            negozio.getRecapitoTel());
                                            
        negozioRepository.save(negozioToSave);

        return "Negozio Salvato";
    }
    
}
