package Backend;

import BaseDatos.Conexion;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 */
public class Paciente extends Persona {

    //ATRIBUTOS
    private String Nacimiento;

    //CONSTRUCTORES
    public Paciente(String Nombre, String Apellido_pa, String Apellido_ma, int DNI,String Nacimiento, int Telefono, String Correo, String Direccion, String Contraseña, int Privilegio) {
        super(Nombre, Apellido_pa, Apellido_ma, DNI, Telefono, Correo, Direccion, Contraseña, Privilegio);
        this.Nacimiento = Nacimiento;
    }

    //METODOS GETTER AND SETTER
    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }
    //METODOS PUBLICOS

    public void Modificar_paciente(int PACIENTE_ID, Paciente paciente) {
        Conexion objConexion = new Conexion();
        String strSentenciaInsert = String.format("UPDATE PACIENTE SET NOMBRE = '%s',APELLIDO_PA ='%s',APELLIDO_MA ='%s',DNI =%d,NACIMIENTO ='%s',TELEFONO =%d,CORREO ='%s',DIRECCION ='%s',CONTRASEÑA='%s',PRIVILEGIO =%d " + "WHERE PACIENTE_ID=%d",
                                              paciente.getNombre(), paciente.getApellido_pa(), paciente.getApellido_ma(), paciente.getDNI(),paciente.getNacimiento(), paciente.getTelefono(), paciente.getCorreo(), paciente.getDireccion(), paciente.getContraseña(), paciente.getPrivilegio(), PACIENTE_ID);
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
    }

    public void Eliminar_paciente(int PACIENTE_ID, Paciente paciente) {
        Conexion objConexion = new Conexion();
        String strSentenciaInsert = String.format("DELETE FROM PACIENTE WHERE PACIENTE_ID =%d", PACIENTE_ID);
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
    }

    public void Agregar_paciente(Paciente paciente) {
        Conexion objConexion = new Conexion();
        String strSentenciaInsert = String.format("INSERT INTO PACIENTE (NOMBRE,APELLIDO_PA,APELLIDO_MA,DNI,NACIMIENTO,TELEFONO,CORREO,DIRECCION,CONTRASEÑA,PRIVILEGIO)"
                + "VALUES ('%s','%s','%s',%d,'%s',%d,'%s','%s','%s',%d)", paciente.getNombre(), paciente.getApellido_pa(), paciente.getApellido_ma(), paciente.getDNI(),paciente.getNacimiento(), paciente.getTelefono(), paciente.getCorreo(), paciente.getDireccion(), paciente.getContraseña(), paciente.getPrivilegio());
        if(objConexion.ejecutarSentenciaSQL(strSentenciaInsert) == 1) JOptionPane.showMessageDialog(null, "Paciente agregado");
        else JOptionPane.showMessageDialog(null, "Error");
    }
}
