package modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="agente")

public class Agente implements Serializable {

    @Id
    @Column(name="idAgente")
    private int idAgente;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "numClientes")
    private  int numClientes;

    public Agente( int idAgente, String nombre, int numClientes) {
        this.idAgente =    idAgente;
        this.nombre = nombre;
        this.numClientes = numClientes;
    }

    public Agente() {
    }

    public int getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(int idAgente) {
        this.idAgente = idAgente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumClientes() {
        return numClientes;
    }

    public void setNumClientes(int numClientes) {
        this.numClientes = numClientes;
    }

    @Override
    public String toString() {
        return "Agente{" +
                "idAgente=" + idAgente +
                ", nombre='" + nombre + '\'' +
                ", numClientes=" + numClientes +
                '}';
    }
}
