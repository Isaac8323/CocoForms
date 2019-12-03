package Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="respuesta")
public class Respuesta {
    @Id
    @Column (name="id_respuesta")
    private int id_respuesta;
    @Column (name="nombre")
    private String nombre;
    @Column (name="respuesta")
    private char respuesta;
    @Column (name="pregunta")
    private int pregunta;

    public Respuesta(){
        
    }
    
    public Respuesta(int id_respuesta, String nombre, char respuesta, int pregunta) {
        this.id_respuesta = id_respuesta;
        this.nombre = nombre;
        this.respuesta = respuesta;
        this.pregunta = pregunta;
    }    
    
    public int getId_respuesta() {
        return id_respuesta;
    }

    public void setId_respuesta(int id_respuesta) {
        this.id_respuesta = id_respuesta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(char respuesta) {
        this.respuesta = respuesta;
    }

    public int getPregunta() {
        return pregunta;
    }

    public void setPregunta(int pregunta) {
        this.pregunta = pregunta;
    }
            
}
