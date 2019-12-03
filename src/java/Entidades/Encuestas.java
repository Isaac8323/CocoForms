package Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="encuesta")
public class Encuestas {
    @Id
    @Column (name="id_encuesta")
    private int id_encuesta;
    @Column (name="nombre_encuesta")
    private String nombre_encuesta;
    @Column (name="status")
    private char status;
    @Column (name="vigencia")
    private String vigencia;
    @Column (name="creador")
    private String creador;

    public Encuestas(){
        
    }
    
    public Encuestas(int id_encuesta, String nombre_encuesta, char status, String vigencia, String creador) {
        this.id_encuesta = id_encuesta;
        this.nombre_encuesta = nombre_encuesta;
        this.status = status;
        this.vigencia = vigencia;
        this.creador = creador;
    }

    public int getId_encuesta() {
        return id_encuesta;
    }

    public void setId_encuesta(int id_encuesta) {
        this.id_encuesta = id_encuesta;
    }

    public String getNombre_encuesta() {
        return nombre_encuesta;
    }

    public void setNombre_encuesta(String nombre_encuesta) {
        this.nombre_encuesta = nombre_encuesta;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
    
}
