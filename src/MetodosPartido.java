import java.util.ArrayList;
import java.util.Scanner;

public class MetodosPartido {
    static ArrayList<Partido> pListaPartidos = new ArrayList<Partido>();
    //FUNCIONA
    public static void gestionarPartidos(Scanner keyboard){
        limpiarConsola();
        //   Scanner keyboardT = new Scanner(System.in);
        boolean salir = false;
        while(salir == false){
            System.out.println("Ingrese la opcion deseada\n" +
                    "1- Ingresar Partido \n" +
                    "2- Listar Partidos \n" +
                    "0- Volver");
            //     try {
            short opcion5 = keyboard.nextShort();
            switch (opcion5) {
                case 1:
                    ingresarPartido(keyboard);
                    break;
                case 2:
                    listarPartidos();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta");
                    break;
            }
        }
    }
    //endregion

    //region Metodos Partido - COMPLETA
    //FUNCIONA
    public static void ingresarPartido(Scanner keyboard) {
        MetodosEquipo pMetodosE = new MetodosEquipo();
        MetodosArbitro pMetodosA = new MetodosArbitro();
        System.out.println("Ingrese los datos del partido:");

        System.out.print("Fecha y hora: ");
        String pFyH = keyboard.nextLine();

        System.out.println("Equipos disponibles:");
        pMetodosE.listarEquipos();
        System.out.print("Seleccione el nombre del equipo local: ");
        String nombreLocal = keyboard.nextLine();
        Equipo equipoSeleccionadoL = pMetodosE.buscarEquipo(nombreLocal);

        System.out.print("Seleccione el nombre del equipo visitante: ");
        String nombreVisitante = keyboard.nextLine();
        Equipo equipoSeleccionadoV = pMetodosE.buscarEquipo(nombreVisitante);

        System.out.println("Árbitros disponibles:");
        pMetodosA.listarArbitros();
        System.out.print("Seleccione CI del árbitro: ");
        String CIArbitro = keyboard.nextLine();
        Arbitro arbitroSeleccionado = pMetodosA.buscarArbitro(CIArbitro);

        Partido pPartido = new Partido(pFyH, equipoSeleccionadoL, equipoSeleccionadoV, arbitroSeleccionado);
        long cantidad = pListaPartidos.size();
        pListaPartidos.add(pPartido);
        if (pListaPartidos.size() > cantidad) {
            System.out.println("Partido agregado correctamente");
        } else {
            System.out.println("Error al guardar el partido");
        }
    }
    //FUNCIONA
    public static void listarPartidos() {
        System.out.println("Lista de Partidos:");
        for (Partido partido : pListaPartidos) {
            System.out.println(partido);
        }
    }
    private static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
