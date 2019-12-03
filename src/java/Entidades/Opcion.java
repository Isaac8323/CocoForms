package Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="opcion")
public class Opcion {
    @Id
    @Column (name="id_opcion")
    private int id_opcion;
    @Column (name="texto")
    private String texto;
    @Column (name="pregunta")
    private int pregunta;
    
    public Opcion(){
        
    }

    public Opcion(int id_opcion, String texto, int pregunta) {
        this.id_opcion = id_opcion;
        this.texto = texto;
        this.pregunta = pregunta;
    }

    public int getId_opcion() {
        return id_opcion;
    }

    public void setId_opcion(int id_opcion) {
        this.id_opcion = id_opcion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getPregunta() {
        return pregunta;
    }

    public void setPregunta(int pregunta) {
        this.pregunta = pregunta;
    }
}
