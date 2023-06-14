public class Casa {
     private Habitacion[] habitaciones;
     private int cantidadHabitaciones;

     // es una variable fija por eso se llama final cuyo valor es 100
     private final int CAPACIDAD_MAXIMA = 100;

     //CONSTRUCTOR

    public Casa () {
        // inicialice contador en 0 se hace asi:
        cantidadHabitaciones = 0;
        // Inicializamos el vector de habitaciones asi:
        habitaciones = new Habitacion[CAPACIDAD_MAXIMA];

    }

    //recibe un objeto de tipo habitacion y lo agrega al vector de habitaciones si hay capacidad disponible
    public void agregarHabitacion(Habitacion habitacion){
        habitaciones[cantidadHabitaciones] = habitacion;
        cantidadHabitaciones++;

    }
    public void mostrarInformacionCasa(){

        if (cantidadHabitaciones > 1){
            System.out.printf("la cantidad de habitaciones de la casa es:  " + cantidadHabitaciones
                    + " La capacidad maxima de habitaciones es: " + CAPACIDAD_MAXIMA + "\n");
            for (int i = 0; i < cantidadHabitaciones; i++) {
            habitaciones[i].informacionHabitacion();
            }
        } else {
            System.out.printf("No se han creado habitaciones");
        }

    }

    public void destruirCasa(){
        // inicialice contador en 0 se hace asi:
        cantidadHabitaciones = 0;
        // Inicializamos el vector de habitaciones asi:
        habitaciones = new Habitacion[CAPACIDAD_MAXIMA];
        System.out.println("La Casa ha sido destruida");

    }
}
