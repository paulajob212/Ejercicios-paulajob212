public class Estudiante {

    private String nombreEstudiante;
    private int edad;
    private int numeroEstudiante;

    public Estudiante(String nombreEstudiante, int edad, int numeroEstudiante){
        this.nombreEstudiante = nombreEstudiante;
        this.edad = edad;
        this.numeroEstudiante = numeroEstudiante;
    }

    public void mostrarInformacionEstudiante() {
        System.out.println("El nombre del estudiante es: " + nombreEstudiante + " la edad del estudiante es: "
                + edad + " El numero del estudiante es: " + numeroEstudiante);
    }
}
