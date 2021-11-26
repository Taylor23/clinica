package Backend;

import java.util.*;

/**
 *
 */
public class Historial {

    //ATRIBUTOS
    private int cantidad_de_atenciones;
    private String Atencion_de_que_Doctores;
    private String Medicamento_recibido;
    private String Alguna_emergencia;
    private Paciente Paciente;

    //CONSTRUCTORES
    public Historial() {
        this.cantidad_de_atenciones = 0;
        this.Atencion_de_que_Doctores = "";
        this.Medicamento_recibido = "";
        this.Alguna_emergencia = "";
        this.Paciente = null;
    }

    public Historial(int cantidad_de_atenciones, String Atencion_de_que_Doctores, String Medicamento_recibido, String Alguna_emergencia, Paciente Paciente) {
        this.cantidad_de_atenciones = cantidad_de_atenciones;
        this.Atencion_de_que_Doctores = Atencion_de_que_Doctores;
        this.Medicamento_recibido = Medicamento_recibido;
        this.Alguna_emergencia = Alguna_emergencia;
        this.Paciente = Paciente;
    }

    //METODOS GETTER AND SETTER
    public int getCantidad_de_atenciones() {
        return cantidad_de_atenciones;
    }

    public void setCantidad_de_atenciones(int cantidad_de_atenciones) {
        this.cantidad_de_atenciones = cantidad_de_atenciones;
    }

    public String getAtencion_de_que_Doctores() {
        return Atencion_de_que_Doctores;
    }

    public void setAtencion_de_que_Doctores(String Atencion_de_que_Doctores) {
        this.Atencion_de_que_Doctores = Atencion_de_que_Doctores;
    }

    public String getMedicamento_recibido() {
        return Medicamento_recibido;
    }

    public void setMedicamento_recibido(String Medicamento_recibido) {
        this.Medicamento_recibido = Medicamento_recibido;
    }

    public String getAlguna_emergencia() {
        return Alguna_emergencia;
    }

    public void setAlguna_emergencia(String Alguna_emergencia) {
        this.Alguna_emergencia = Alguna_emergencia;
    }

    public Paciente getPaciente() {
        return Paciente;
    }

    public void setPaciente(Paciente Paciente) {
        this.Paciente = Paciente;
    }

    //METODOS PUBLICOS
    public void Buscar(int dni) {
        // TODO implement here
    }

    public void Registro(Historial Historial) {
        // TODO implement here
    }

}
