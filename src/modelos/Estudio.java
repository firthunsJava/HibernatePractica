package modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="Estudio")
public class Estudio implements Serializable {

    @Id
    @Column(name = "idEstudio")
    private int idEstudio;
    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private int numero;
    @Column(name = "CodigoPostal")
    private  int CodigoPostal;
    @Column(name = "localidad")
    private String localidad;

    public Estudio(int idEstudio, String calle, int numero, int codigoPostal, String localidad) {
       this.idEstudio = idEstudio;
        this.calle = calle;
        this.numero = numero;
        this.CodigoPostal = codigoPostal;
        this.localidad = localidad;
    }

    public Estudio() {
    }

    public int getIdEstudio() {
        return idEstudio;
    }

    public void setIdEstudio(int idEstudio) {
        this.idEstudio = idEstudio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodigoPostal() {
        return CodigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        CodigoPostal = codigoPostal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Estudio{" +
                "idEstudio=" + idEstudio +
                ", calle='" + calle + '\'' +
                ", numero=" + numero +
                ", CodigoPostal=" + CodigoPostal +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
