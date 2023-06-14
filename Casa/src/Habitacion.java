public class Habitacion {

    private int numeroHabitacion;
    private double tamanoHabMetrosCuad;

    //constructor

    public Habitacion (int numeroHabitacion, double tamanoHabMetrosCuad){
        this.numeroHabitacion = numeroHabitacion;
        this.tamanoHabMetrosCuad = tamanoHabMetrosCuad;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public double getTamanoHabMetrosCuad() {
        return tamanoHabMetrosCuad;
    }

    public void informacionHabitacion(){
        System.out.println("numero de habitacion: " + numeroHabitacion
        + "el tamaño de habitacion en metros cuadrados es: " + tamanoHabMetrosCuad + "\n");
    }

}
