package Backend;

import java.util.*;

/**
 *
 */
public class Turno {

    //ATRIBUTOS
    private int Dia_atencion;
    private int Consultorio;
    private int Cupos_de_atencion;
    private int Hora_out;
    private int Horas_in;

    //CONSTRUCTORES
    public Turno() {
        this.Dia_atencion = 0;
        this.Consultorio = 0;
        this.Cupos_de_atencion = 0;
        this.Hora_out = 0;
        this.Horas_in = 0;
    }

    public Turno(int Dia_atencion, int Consultorio, int Cupos_de_atencion, int Hora_out, int Horas_in) {
        this.Dia_atencion = Dia_atencion;
        this.Consultorio = Consultorio;
        this.Cupos_de_atencion = Cupos_de_atencion;
        this.Hora_out = Hora_out;
        this.Horas_in = Horas_in;
    }

    //METODOS GETTER AND SETTER
    public int getDia_atencion() {
        return Dia_atencion;
        // TODO implement here
    }

    public void setDia_atencion(int Dia_atencion) {
        this.Dia_atencion = Dia_atencion;
    }

    public int getConsultorio() {
        return Consultorio;
    }

    public void setConsultorio(int Consultorio) {
        this.Consultorio = Consultorio;
    }

    public int getCupos_de_atencion() {
        return Cupos_de_atencion;
    }

    public void setCupos_de_atencion(int Cupos_de_atencion) {
        this.Cupos_de_atencion = Cupos_de_atencion;
    }

    public int getHora_out() {
        return Hora_out;
    }

    public void setHora_out(int Hora_out) {
        this.Hora_out = Hora_out;
    }

    public int getHoras_in() {
        return Horas_in;
    }

    public void setHoras_in(int Horas_in) {
        this.Horas_in = Horas_in;
    }

    //METODOS PUBLICOS
    public void AsignarDoctor(Turno disponibe) {
        // TODO implement here
    }

    public void Verificar_disponible(int Hora_in, int Hora_out, int Dia_atencion) {
        // TODO implement here
    }

}
