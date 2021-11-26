package Backend;

/**
 *
 */
public abstract class Persona {

    //ATRIBUTO
    protected String Nombre;
    protected String Apellido_pa;
    protected String Apellido_ma;
    protected int DNI;
    protected int Telefono;
    protected String Correo;
    protected String Direccion;
    protected String Contraseña;
    protected int Privilegio;

    //GETTER AND SETTER

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido_pa() {
        return Apellido_pa;
    }

    public void setApellido_pa(String Apellido_pa) {
        this.Apellido_pa = Apellido_pa;
    }

    public String getApellido_ma() {
        return Apellido_ma;
    }

    public void setApellido_ma(String Apellido_ma) {
        this.Apellido_ma = Apellido_ma;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getPrivilegio() {
        return Privilegio;
    }

    public void setPrivilegio(int Privilegio) {
        this.Privilegio = Privilegio;
    }
    

    //CONSTRUCTORES
    public Persona() {
        this.Nombre = "";
        this.Apellido_pa = "";
        this.Apellido_ma = "";
        this.DNI = 0;
        this.Telefono = 0;
        this.Correo = "";
        this.Direccion = "";
        this.Contraseña = "";
        this.Privilegio = 0;
    }
    public Persona(String Nombre, String Apellido_pa, String Apellido_ma, int DNI, int Telefono, String Correo, String Direccion, String Contraseña,int Privilegio) {
        this.Nombre = Nombre;
        this.Apellido_pa = Apellido_pa;
        this.Apellido_ma = Apellido_ma;
        this.DNI = DNI;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Direccion = Direccion;
        this.Contraseña = Contraseña;
        this.Privilegio = Privilegio;
    }
    


}
