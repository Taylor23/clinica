package Backend;

import java.util.*;

public class Cita {

    //ATRIBUTOS
    public String Paciente;
    public String Dia;
    public int Hora;
    public String Doctor;
    public String Especialidad;
    private String Emergencia;
    public int Calificacion;

    //CONSTRUCTORES
    public Cita() {
        this.Paciente = "";
        this.Dia = "";
        this.Hora = 0;
        this.Doctor = "";
        this.Especialidad = "";
        this.Emergencia = "";
        this.Calificacion = 0;
    }

    public Cita(String Paciente, String Dia, int Hora, String Doctor, String Especialidad, String Emergencia, int Calificacion) {
        this.Paciente = Paciente;
        this.Dia = Dia;
        this.Hora = Hora;
        this.Doctor = Doctor;
        this.Especialidad = Especialidad;
        this.Emergencia = Emergencia;
        this.Calificacion = Calificacion;
    }

    //METODOS GETTER AND SETTER
    public String getPaciente() {
        return Paciente;
    }

    public void setPaciente(String Paciente) {
        this.Paciente = Paciente;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public int getHora() {
        return Hora;
    }

    public void setHora(int Hora) {
        this.Hora = Hora;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String Doctor) {
        this.Doctor = Doctor;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getEmergencia() {
        return Emergencia;
    }

    public void setEmergencia(String Emergencia) {
        this.Emergencia = Emergencia;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int Calificacion) {
        this.Calificacion = Calificacion;
    }

    //METODOS PUBLICOS
    public void Crear_Cita(Cita cita) {
        // TODO implement here
    }

    public void Calificacion(Cita cita) {
        // TODO implement here
    }

    public void Verificar_Cita() {
        // TODO implement here
    }

}
