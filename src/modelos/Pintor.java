package modelos;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="Pintor")
public class Pintor implements Serializable {


    @Id
    @Column(name = "identificador")
    private int identificador;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "numCuadros")
    private int numCuadros;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn // con esta instruccion decimos que las tablas unidas por sus id
  // Relacion
    private Agente agente;

    public Pintor() {
    }



    public Pintor(int identificador, String nombre, String apellidos, int numCuadros, Agente agente) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numCuadros = numCuadros;
        this.agente = agente;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumCuadros() {
        return numCuadros;
    }

    public void setNumCuadros(int numCuadros) {
        this.numCuadros = numCuadros;
    }

    public Agente getAgente() {
        return agente;
    }

    public void setAgente(Agente agente) {
        this.agente = agente;
    }

    @Override
    public String toString() {
        return "Pintor{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numCuadros=" + numCuadros +
                ", agente=" + agente +
                '}';
    }


}
