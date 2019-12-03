package Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pregunta")
public class Pregunta {
    @Id
    @Column (name="id_pregunta")
    private int id_pregunta;
    @Column (name="texto")
    private String texto;
    @Column (name="encuesta")
    private int encuesta;

    public Pregunta(){
        
    }
    
    public Pregunta(int id_pregunta, String texto, int encuesta) {
        this.id_pregunta = id_pregunta;
        this.texto = texto;
        this.encuesta = encuesta;
    }

    public int getId_pregunta() {
        return id_pregunta;
    }

    public void setId_pregunta(int id_pregunta) {
        this.id_pregunta = id_pregunta;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getEncuesta() {
        return encuesta;
    }

    public void setEncuesta(int encuesta) {
        this.encuesta = encuesta;
    }
    
    
    
}
