public class Universidad {
    private String nombre;
    private int cantidadEstudiante;
    private Estudiante estudiantes[];

    public Universidad (String nombre){
        this.nombre = nombre;
        estudiantes = new Estudiante[100];
        cantidadEstudiante = 0;
   }
    public void setEstudiante(Estudiante estudiante){
        if (cantidadEstudiante < 100){
            estudiantes [cantidadEstudiante]= estudiante;
            cantidadEstudiante++;
        } else
            System.out.println("Ha excedido el limite de cupo");
    }
    public String getNombre(){
        return nombre;

    }
    public int getCantidadEstudiante(){
        return cantidadEstudiante;
    }

    public Estudiante[] getEstudiantes(){
        return estudiantes;
    }
}
