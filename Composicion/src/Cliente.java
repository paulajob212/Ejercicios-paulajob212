public class Cliente {

    private String nombre;
    private String apellidoMaterno;
    private String apellidoPaterno;
    Private FechaNacimiento fechaNacimiento;
    private Direccion direccion;

    public Cliente(String nombre, String apellidoMaterno, String apellidoPaterno, Private fechaNacimiento, Direccion direccion) {
        this.nombre = nombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        FechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public Private getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Private fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", FechaNacimiento=" + FechaNacimiento +
                ", direccion=" + direccion +
                '}';
    }
}
