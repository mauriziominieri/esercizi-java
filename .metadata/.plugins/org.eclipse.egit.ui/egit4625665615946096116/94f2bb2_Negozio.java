package com.bookingbarbieri.server.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="NEGOZIO")
public class Negozio {
    
    @Id
    @Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID;

    @Column(name="NOME", nullable = false)
    private String nome;

    @Column(name="INDIRIZZO", nullable = false)
    private String indirizzo;

    @Column(name="REC_TELEFONICO", nullable = false)
    private String recapitoTel;

    @OneToMany(mappedBy = "negozio", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Lavoratore> dipendenti;


    public Negozio(String nome, String indirizzo, String recapitoTel){
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.recapitoTel = recapitoTel;
    }


    public Integer getID(){
        return this.ID;
    }

    public String getIndirizzo(){
        return this.indirizzo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getRecapTelefonico(){
        return this.recapitoTel;
    }

    public void setIndirizzo(String indirizzo){
        this.indirizzo = indirizzo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setID(int id){
        this.ID = id;
    }

    public void setRecapitoTel(String recapitoTel){
        this.recapitoTel = recapitoTel;
    }

    @Override
    public String toString() {
        return  "\nNEGOZIO_ID: " + this.ID + 
                "\nNOME: " + this.nome + 
                "\nINDIRIZZO: " + this.indirizzo +
                "\nTELEFONO: " + this.recapitoTel;
    }

}
