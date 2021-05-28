/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5p2_victorcruz;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Info_Part {
    private String nom_rival;
    private int num_jugadores;

    public Info_Part(String nom_rival, int num_jugadores) {
        this.nom_rival = nom_rival;
        this.num_jugadores = num_jugadores;
    }

    public Info_Part() {
    }

    public String getNom_rival() {
        return nom_rival;
    }

    public void setNom_rival(String nom_rival) {
        this.nom_rival = nom_rival;
    }

    public int getNum_jugadores() {
        return num_jugadores;
    }

    public void setNum_jugadores(int num_jugadores) {
        this.num_jugadores = num_jugadores;
    }

    @Override
    public String toString() {
        return "nombre del Rival: " + nom_rival 
              + "\nCantidad de jugadores: " + num_jugadores;
    }
    
    
}
