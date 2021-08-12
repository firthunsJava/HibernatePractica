package modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="Cuadros")
public class Cuadros implements Serializable {
    @Column(name="cuadro")
    private String cuadro;
    @Id
    @Column(name="identificador")
    private int identificador;
    @Column(name="añoCreacion")
    private int añoCreacion;


    @Column(name="identificadorAutor")
    private int identificadorAutor; // ojito

    public Cuadros() {
    }

    public Cuadros(String cuadro, int identificador, int añoCreacion, int identificadorAutor) {
        this.cuadro = cuadro;
        this.identificador = identificador;
        this.añoCreacion = añoCreacion;
        this.identificadorAutor = identificadorAutor;
    }

    public String getCuadro() {
        return cuadro;
    }

    public void setCuadro(String cuadro) {
        this.cuadro = cuadro;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getAñoCreacion() {
        return añoCreacion;
    }

    public void setAñoCreacion(int añoCreacion) {
        this.añoCreacion = añoCreacion;
    }

    public int getIdentificadorAutor() {
        return identificadorAutor;
    }

    public void setIdentificadorAutor(int identificadorAutor) {
        this.identificadorAutor = identificadorAutor;
    }

    @Override
    public String toString() {
        return "Cuadros{" +
                "cuadro='" + cuadro + '\'' +
                ", identificador=" + identificador +
                ", añoCreacion=" + añoCreacion +
                ", identificadorAutor=" + identificadorAutor +
                '}';
    }
}
