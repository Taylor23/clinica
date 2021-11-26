package Backend;

import BaseDatos.Conexion;

/**
 *
 */
public class Doctor extends Persona {

    //ATRIBUTOS
    private int CMP;

    //CONSTRUCTORES
    public Doctor(String Nombre, String Apellido_pa, String Apellido_ma, int DNI, int CMP, int Telefono, String Correo, String Direccion, String Contraseña, int Privilegio) {
        super(Nombre, Apellido_pa, Apellido_ma, DNI, Telefono, Correo, Direccion, Contraseña, Privilegio);
        this.CMP = CMP;
    }

    //METODOS GETTER AND SETTER
    public int getCMP() {
        return CMP;
    }

    public void setCMP(int CMP) {
        this.CMP = CMP;
    }

    //METODOS PUBLICOS
    public void Modificar_doctor(int DOCTOR_ID, Doctor doctor, int ESPECIALIDAD_ID) {
        Conexion objConexion = new Conexion();
        String strSentenciaInsert = String.format("UPDATE DOCTOR SET NOMBRE = '%s',APELLIDO_PA ='%s',APELLIDO_MA ='%s',DNI =%d,CMP =%d,TELEFONO =%d,CORREO ='%s',DIRECCION ='%s',CONTRASEÑA='%s',PRIVILEGIO =%d, ESPECIALIDAD_ID = %d " + "WHERE DOCTOR_ID=%d",
                                                   doctor.getNombre(), doctor.getApellido_pa(), doctor.getApellido_ma(), doctor.getDNI(), doctor.getCMP(), doctor.getTelefono(), doctor.getCorreo(), doctor.getDireccion(), doctor.getContraseña(), doctor.getPrivilegio(),ESPECIALIDAD_ID, DOCTOR_ID);
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
    }

    public void Eliminar_doctor(int DOCTOR_ID, Doctor doctor) {
        Conexion objConexion = new Conexion();
        String strSentenciaInsert = String.format("DELETE FROM DOCTOR WHERE DOCTOR_ID =%d", DOCTOR_ID);
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
    }

    public void Agregar_doctor(Doctor doctor, int ESPECIALIDAD_ID) {
        Conexion objConexion = new Conexion();
        String strSentenciaInsert = String.format("INSERT INTO DOCTOR (NOMBRE,APELLIDO_PA,APELLIDO_MA,DNI,CMP,TELEFONO,CORREO,DIRECCION,CONTRASEÑA,PRIVILEGIO,ESPECIALIDAD_ID)"
                + "VALUES ('%s','%s','%s',%d,'%s',%d,'%s','%s','%s',%d,%d)", doctor.getNombre(), doctor.getApellido_pa(), doctor.getApellido_ma(), doctor.getDNI(), doctor.getCMP(), doctor.getTelefono(), doctor.getCorreo(), doctor.getDireccion(), doctor.getContraseña(), doctor.getPrivilegio(),ESPECIALIDAD_ID);
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
    }

}
