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
public class Psicologo extends Integrantes {
    private String Titulo;
    private String ID;
    private String Especialidad;
    private int cant_infor = 0;
    private int cant_jug = 0;

    public Psicologo(String Titulo, String ID, String Especialidad, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
        this.Titulo = Titulo;
        this.ID = ID;
        this.Especialidad = Especialidad;
    }

    public Psicologo(String Titulo, String ID, String Especialidad) {
        this.Titulo = Titulo;
        this.ID = ID;
        this.Especialidad = Especialidad;
    }

    public Psicologo() {
    super();
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public int getCant_infor() {
        return cant_infor;
    }

    public void setCant_infor(int cant_infor) {
        this.cant_infor = cant_infor;
    }

    public int getCant_jug() {
        return cant_jug;
    }

    public void setCant_jug(int cant_jug) {
        this.cant_jug = cant_jug;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
}
