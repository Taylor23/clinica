/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;
import BaseDatos.Conexion;
import java.util.*;
/**
 *
 * @author landr
 */
public class Secretaria extends Persona{
    //ATRIBUTOS

    //CONSTRUCTORES

    public Secretaria(String Nombre, String Apellido_pa, String Apellido_ma, int DNI, int Telefono, String Correo, String Direccion, String Contraseña,int Privilegio) {
        super(Nombre, Apellido_pa, Apellido_ma, DNI, Telefono, Correo, Direccion, Contraseña, Privilegio);
    }

    //METODOS GETTER AND SETTER
    

    //METODOS PUBLICOS
    public void Modificar_secretaria(int SECRETARIA_ID,Secretaria secretaria) {
        Conexion objConexion = new Conexion();
        String strSentenciaInsert = String.format("UPDATE SECRETARIA SET NOMBRE = '%s',APELLIDO_PA ='%s',APELLIDO_MA ='%s',DNI =%d,TELEFONO =%d,CORREO ='%s',DIRECCION ='%s',CONTRASEÑA='%s',PRIVILEGIO =%d "+"WHERE SECRETARIA_ID=%d",secretaria.getNombre(), secretaria.getApellido_pa(), secretaria.getApellido_ma(), secretaria.getDNI(), secretaria.getTelefono(), secretaria.getCorreo(), secretaria.getDireccion(), secretaria.getContraseña(),secretaria.getPrivilegio(), SECRETARIA_ID);
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
    }

    public void Eliminar_secretaria(int SECRETARIA_ID,Secretaria secretaria ) {
        Conexion objConexion = new Conexion();
        String strSentenciaInsert = String.format("DELETE FROM SECRETARIA WHERE SECRETARIA_ID =%d", SECRETARIA_ID);
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
    }

    public void Agregar_secretaria(Secretaria secretaria) {
        Conexion objConexion = new Conexion();
        String strSentenciaInsert = String.format("INSERT INTO SECRETARIA (SECRETARIA_ID,NOMBRE,APELLIDO_PA,APELLIDO_MA,DNI,TELEFONO,CORREO,DIRECCION,CONTRASEÑA,PRIVILEGIO)"
                + "VALUES (NULL,'%s','%s','%s',%d,%d,'%s','%s','%s',%d)",secretaria.getNombre(), secretaria.getApellido_pa(), secretaria.getApellido_ma(), secretaria.getDNI(), secretaria.getTelefono(), secretaria.getCorreo(), secretaria.getDireccion(), secretaria.getContraseña(),secretaria.getPrivilegio());
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
    }
    
}
