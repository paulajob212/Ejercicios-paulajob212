public class Main {
    public static void main(String[] args) {

        Universidad universidad = new Universidad ("UniversidadXYZ");

        Estudiante estudiante = new Estudiante("Rosita Perez", 22, 1020);
        Estudiante estudiante2 = new Estudiante("juanito Gomez", 22, 2054);

        //agregar los estudiantes creados a la  universidad con el metdo agregar estudiante de la clase universida

        universidad.setEstudiante(estudiante);
        universidad.setEstudiante(estudiante2);

        System.out.println("La universidad se llama: " + universidad.getNombre());

        //recorrer el vector de estudiantes

        for (int i = 0; i < universidad.getCantidadEstudiante(); i++) {
            System.out.println("Estudiante " + (i+1));

            universidad.getEstudiantes()[i].mostrarInformacionEstudiante();
        }


}


}