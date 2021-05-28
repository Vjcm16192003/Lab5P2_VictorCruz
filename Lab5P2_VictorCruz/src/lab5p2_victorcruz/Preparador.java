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
public class Preparador extends Integrantes {
    private String ID,especialidad,titulo;
    private int contrato;

    public Preparador(String ID, String especialidad, String titulo, int contrato, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
        this.ID = ID;
        this.especialidad = especialidad;
        this.titulo = titulo;
        this.contrato = contrato;
    }

    public Preparador(String ID, String especialidad, String titulo, int contrato) {
        this.ID = ID;
        this.especialidad = especialidad;
        this.titulo = titulo;
        this.contrato = contrato;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
