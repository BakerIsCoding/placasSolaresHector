/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.endollssolars;

/**
 *
 * @author Baker
 */
public class Casa {

    private String nif;
    private String nom;
    private Integer superficie;
    private boolean interruptor = true;
    private PlacaSolar[] placasolar;
    private Aparell[] aparell;

    public Casa(String nif, String nom, Integer superficie) {
        this.nif = nif;
        this.nom = nom;
        this.superficie = superficie;
    }

    public String getNif() {
        return this.nif;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public Integer getSuperficie(){
        return this.superficie;
    }
    
    public boolean getInterruptor(){
        return this.interruptor;
    }
    
    public PlacaSolar[] setPlaca(Integer superficie, float preu, Integer potencia){
        this.placasolar = superficie, preu, potencia;
    }
    
}
