import java.awt.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static ArrayList<Jugador> pListaJugadores = new ArrayList<Jugador>();
    static ArrayList<Equipo> pListaEquipos = new ArrayList<Equipo>();
    static ArrayList<Arbitro> pListaArbitros = new ArrayList<Arbitro>();

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean salir = false;
        while(salir == false){

            System.out.println("Bienvenido!\n" +
                    "Ingrese la opcion deseada\n" +
                    "1- Gestionar Jugador \n" +
                    "2- Gestionar Técnico \n" +
                    "3- Gestionar Equipo \n" +
                    "4- Gestionar Árbitro \n" +
                    "5- Gestionar Cuadro \n" +
                    "6- Gestionar Partido \n" +
                    "0- Salir");
       //     try {
                short opcion = keyboard.nextShort();
                switch (opcion) {
                    case 1:
                        gestionJugadores(keyboard);
                        break;
                    case 2:
                        gestionTecnicos(keyboard);
                        break;
                    case 3:
                        gestionarEquipos(keyboard);
                        break;
                    case 4:
                        gestionArbitros(keyboard);
                        break;
                    case 5:
                        gestionarCuadros(keyboard);
                        break;
                    case 6:
                        gestionarPartidos(keyboard);
                    case 0:
                        salir = true;
                        break;
                    default:
                        System.out.println("La opción ingresada no es correcta");
                        break;
                }
         /*   }
            catch (InputMismatchException e){
                String ingreso = keyboard.nextLine();
                System.err.println("Debe ingresar un numero, no '" + ingreso + "'");
            } */
        }
        keyboard.close();
    }
    private static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    //region Metodos de Gestion
    public static void gestionJugadores(Scanner keyboard){
        limpiarConsola();
        Scanner keyboardJ = new Scanner(System.in);
        boolean salir = false;
        while(salir == false){
            System.out.println("Ingrese la opcion deseada\n" +
                    "1- Alta Jugador \n" +
                    "2- Modificar Jugador \n" +
                    "3- Eliminar Jugador \n" +
                    "4- Listar Jugadores \n" +
                    "5- Actualizar Jugadores \n" +
                    "0- Salir");
            //     try {
            short opcion2 = keyboardJ.nextShort();
            switch (opcion2) {
                case 1:
                    altaJugador(keyboardJ);
                    break;
                case 2:
                    modificarJugador(keyboardJ);
                    break;
                case 3:
                    eliminarJugador(keyboardJ);
                    break;
                case 4:
                    listarJugadores();
                    break;
                case 5:
                    actualizarJugadores();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta");
                    break;
            }
        }
        keyboardJ.close();
    }
    public static void gestionTecnicos(Scanner keyboard){
        limpiarConsola();
     //   Scanner keyboardT = new Scanner(System.in);
        boolean salir = false;
        while(salir == false){
            System.out.println("Ingrese la opcion deseada\n" +
                    "1- Alta Técnico \n" +
                    "2- Modificar Técnico \n" +
                    "3- Eliminar Técnico \n" +
                    "4- Listar Técnicos \n" +
                    "5- Actualizar Técnicos \n" +
                    "0- Salir");
            //     try {
            short opcion3 = keyboard.nextShort();
            switch (opcion3) {
                case 1:
                    altaTecnico(keyboard);
                    break;
                case 2:
                    modificarTecnico(keyboard);
                    break;
                case 3:
                    eliminarTecnico(keyboard);
                    break;
                case 4:
                    listarTecnicos();
                    break;
                case 5:
                    actualizarTecnicos();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta");
                    break;
            }
        }
        keyboard.close();
    }
    public static void gestionarEquipos(Scanner keyboard){
        limpiarConsola();
        //   Scanner keyboardT = new Scanner(System.in);
        boolean salir = false;
        while(salir == false){
            System.out.println("Ingrese la opcion deseada\n" +
                    "1- Alta Equipo \n" +
                    "2- Modificar Equipo \n" +
                    "3- Eliminar Equipo \n" +
                    "4- Listar Equipos \n" +
                    "5- Actualizar Equipos \n" +
                    "0- Salir");
            //     try {
            short opcion3 = keyboard.nextShort();
            switch (opcion3) {
                case 1:
                    altaEquipo(keyboard);
                    break;
                case 2:
                    modificarEquipo(keyboard);
                    break;
                case 3:
                    eliminarEquipo(keyboard);
                    break;
                case 4:
                    listarEquipos();
                    break;
                case 5:
                    actualizarEquipos();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta");
                    break;
            }
        }
        keyboard.close();
    }
    public static void gestionArbitros(Scanner keyboard){
        limpiarConsola();
        //   Scanner keyboardT = new Scanner(System.in);
        boolean salir = false;
        while(salir == false){
            System.out.println("Ingrese la opcion deseada\n" +
                    "1- Alta Árbitro \n" +
                    "2- Modificar Árbitro \n" +
                    "3- Eliminar Árbitro \n" +
                    "4- Listar Árbitros \n" +
                    "5- Actualizar Árbitros \n" +
                    "0- Salir");
            //     try {
            short opcion4 = keyboard.nextShort();
            switch (opcion4) {
                case 1:
                    altaArbitro(keyboard);
                    break;
                case 2:
                    modificarArbitro(keyboard);
                    break;
                case 3:
                    eliminarArbitro(keyboard);
                    break;
                case 4:
                    listarArbitros();
                    break;
                case 5:
                    actualizarArbitros();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta");
                    break;
            }
        }
        keyboard.close();
    }
    public static void gestionarCuadros(Scanner keyboard){
        limpiarConsola();
        System.out.println("Ingresar Datos:");
        new Scanner(System.in).nextLine();
    }
    public static void gestionarPartidos(Scanner keyboard){
        limpiarConsola();
        System.out.println("Ingresar Datos:");
        new Scanner(System.in).nextLine();
    }
    //endregion
    //region Metodos Jugador
    public static void altaJugador(Scanner keyboard){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos del jugador:");

        System.out.print("Nombre: ");
        String pNombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String pApellido = scanner.nextLine();

        System.out.print("Cédula: ");
        String pCi = scanner.nextLine();

        System.out.print("Sueldo: ");
        int pSueldo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Posicion: ");
        String pPosicion = scanner.nextLine();

        System.out.println("Equipos disponibles:");
        for (Equipo equipo : pListaEquipos) {
            System.out.println(equipo.getNombre());
        }
        System.out.print("Seleccione el nombre de su equipo: ");
        String nombreEquipo = scanner.nextLine();

        Equipo equipoSeleccionado = null;
        for (Equipo equipo : pListaEquipos) {
            if (equipo.getNombre().equalsIgnoreCase(nombreEquipo)) {
                equipoSeleccionado = equipo;
                break;
            }
        }

        System.out.print("Minutos jugados: ");
        int minutosJugados = scanner.nextInt();
        scanner.nextLine();

        int jugadoresPorEquipo = 0;
        for (Jugador jugador : pListaJugadores) {
            if (jugador.getEquipo().equals(equipoSeleccionado)) {
                jugadoresPorEquipo++;
            }
        }
        Jugador pJugador = new Jugador(pNombre, pApellido, pCi, pSueldo, pPosicion, nombreEquipo, minutosJugados);
        long cantidad = pListaJugadores.size();
        pListaJugadores.add(pJugador);
        if(pListaJugadores.size() > cantidad){
            System.out.println("Jugador agregado correctamente");
        }
        else{
            System.out.println("Error al guardar el jugador");
        }

    }
    public static void modificarJugador(Scanner keyboard){
    }
    public static void eliminarJugador(Scanner keyboard){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese CI del jugador que quiere eliminar:");
        String CIeliminar = scanner.nextLine();

        Jugador jugadorE = null;
        for (Jugador jugador : pListaJugadores) {
            if (jugador.getCi().equals(CIeliminar)) {
                jugadorE = jugador;
                pListaJugadores.remove(jugadorE);
                listarJugadores();
                break;
            }
        }

       /* if (jugadorE != null) {
            pListaJugadores.remove(jugadorE);
            listarJugadores();
        } else {
            System.out.println("Nombre no encontrado. \n");
        } */
    }
    public static void listarJugadores(){
        System.out.println("Lista de Jugadores:");
        for (Jugador jugador : pListaJugadores) {
            System.out.println(jugador);
        }
    }
    public static void actualizarJugadores(){
    }
    //endregion
    //region Metodos Tecnico
    public static void altaTecnico(Scanner keyboard){
    }
    public static void modificarTecnico(Scanner keyboard){
    }
    public static void eliminarTecnico(Scanner keyboard){
    }
    public static void listarTecnicos(){
    }
    public static void actualizarTecnicos(){
    }
    //endregion
    //region Metodos Equipo
    public static void altaEquipo(Scanner keyboard){
    }
    public static void modificarEquipo(Scanner keyboard){
    }
    public static void eliminarEquipo(Scanner keyboard){
    }
    public static void listarEquipos(){
    }
    public static void actualizarEquipos(){
    }
    //endregion
    //region Metodos Arbitro
    public static void altaArbitro(Scanner keyboard){
    }
    public static void modificarArbitro(Scanner keyboard){
    }
    public static void eliminarArbitro(Scanner keyboard){
    }
    public static void listarArbitros(){
    }
    public static void actualizarArbitros(){
    }
    //endregion
}

