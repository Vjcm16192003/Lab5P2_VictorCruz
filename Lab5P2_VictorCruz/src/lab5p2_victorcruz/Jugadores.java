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
public class Jugadores extends Integrantes{
     private int num_jug;
    private int cant_par=0;
    private int tar_amarilla=0;
    private int tar_roja=0;
    private int contrato;

    public Jugadores(int num_jug, int contrato, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
        this.num_jug = num_jug;
        this.contrato = contrato;
    }

    public Jugadores(int num_jug, int contrato) {
        this.num_jug = num_jug;
        this.contrato = contrato;
    }

    public Jugadores() {
    super();
    }

    public int getNum_jug() {
        return num_jug;
    }

    public void setNum_jug(int num_jug) {
        this.num_jug = num_jug;
    }

    public int getCant_par() {
        return cant_par;
    }

    public void setCant_par(int cant_par) {
        this.cant_par = cant_par;
    }

    public int getTar_amarilla() {
        return tar_amarilla;
    }

    public void setTar_amarilla(int tar_amarilla) {
        this.tar_amarilla = tar_amarilla;
    }

    public int getTar_roja() {
        return tar_roja;
    }

    public void setTar_roja(int tar_roja) {
        this.tar_roja = tar_roja;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
    
}
