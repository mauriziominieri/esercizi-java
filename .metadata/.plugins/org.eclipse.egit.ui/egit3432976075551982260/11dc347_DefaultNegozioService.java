package com.bookingbarbieri.server.service.Negozio;

import java.util.List;

import com.bookingbarbieri.server.dto.NegozioDTO;
import com.bookingbarbieri.server.repository.NegozioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("NegozioService")
public class DefaultNegozioService implements NegozioService {

    @Autowired
    private NegozioRepository negozioRepository;

    @Override
    public NegozioDTO saveNegozio(NegozioDTO negozio) {
        // TODO Auto-generated method stub
        
        return null;
    }

    @Override
    public boolean deleteNegozio(Long negozioID) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<NegozioDTO> getAllNegozio() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public NegozioDTO getNegozioById(Long negozioID) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
