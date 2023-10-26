import java.awt.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static ArrayList<Jugador> pListaJugadores = new ArrayList<Jugador>();
    static ArrayList<Arbitro> pListaArbitros = new ArrayList<Arbitro>();
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean salir = false;
        while(salir == false){

            System.out.println("Bienvenido!\n" +
                    "Ingrese la opcion deseada\n" +
                    "1- Gestionar Jugador \n" +
                    "2- Gestionar Técnico \n" +
                    "3- Gestionar Árbitro \n" +
                    "4- Gestionar Cuadro \n" +
                    "5- Gestionar Partido \n" +
                    "0- Salir");
            try {
                short opcion = keyboard.nextShort();
                switch (opcion) {
                    case 1:
                        gestionJugadores(keyboard);
                        break;
                    case 2:
                        gestionTecnicos(keyboard);
                        break;
                    case 3:
                        gestionArbitros(keyboard);
                        break;
                    case 4:
                        gestionarCuadros(keyboard);
                        break;
                    case 5:
                        gestionarPartidos(keyboard);
                        break;
                    case 0:
                        salir = true;
                        break;
                    default:
                        System.out.println("La opcion ingresada no es correcta");
                        break;
                }
            }
            catch (InputMismatchException e){
                String ingreso = keyboard.nextLine();
                System.err.println("Debe ingresar un numero, no '" + ingreso + "'");
            }
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
    }
    public static void modificarJugador(Scanner keyboard){
    }
    public static void eliminarJugador(Scanner keyboard){
    }
    public static void listarJugadores(){
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
