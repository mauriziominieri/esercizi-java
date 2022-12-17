package com.bookingbarbieri.server.dto;

import com.bookingbarbieri.server.model.Negozio;

import lombok.Data;


@Data
public class NegozioDTO {
    
    private int negozioID;
    private String nome;
    private String indirizzo;
    private String recapitoTel;

    public NegozioDTO(String nome, String indirizzo, String recapitoTel){
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.recapitoTel = recapitoTel;
    }

    public NegozioDTO(Negozio negozio){
        this.nome = negozio.getNome();
        this.indirizzo = negozio.getIndirizzo();
        this.recapitoTel = negozio.getRecapTelefonico();
        this.negozioID = negozio.getID();
    }
}
