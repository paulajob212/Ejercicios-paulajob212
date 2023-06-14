public class Main {
    public static void main(String[] args) {

        Casa casa = new Casa();

        Habitacion habitacion = new Habitacion(1, 20);
        Habitacion habitacion2 = new Habitacion(2, 30);

        casa.agregarHabitacion(habitacion);
        casa.agregarHabitacion(habitacion2);

        casa.mostrarInformacionCasa();

        casa.destruirCasa();
        casa.mostrarInformacionCasa();
    }
}