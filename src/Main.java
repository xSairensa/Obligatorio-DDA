import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

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

    public static void gestionJugadores(Scanner keyboard){
        boolean volver = false;
        while(volver == false){
            System.out.println("Elija una opción:\n" +
                    "1- Ingresar Jugador\n" +
                    "2- Modificar Jugador\n" +
                    "3- Eliminar Jugador\n" +
                    "4- Lista de Jugadores\n" +
                    "0- Volver");
            try {
                short opcion = keyboard.nextShort();
                switch (opcion) {
                    case 1:
                        System.out.println("Test");
                        break;
                    case 0:
                        volver = true;
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
    }
    public static void gestionTecnicos(Scanner keyboard){
        boolean volver = false;
        while(volver == false){
            System.out.println("Elija una opción:\n" +
                    "1- Ingresar Técnico\n" +
                    "2- Modificar Técnico\n" +
                    "3- Eliminar Técnico\n" +
                    "4- Lista de Técnicos\n" +
                    "0- Volver");
            try {
                short opcion = keyboard.nextShort();
                switch (opcion) {
                    case 1:
                        System.out.println("Test");
                        break;
                    case 0:
                        volver = true;
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
    }
    public static void gestionArbitros(Scanner keyboard){
        boolean volver = false;
        while(volver == false){
            System.out.println("Elija una opción:\n" +
                    "1- Ingresar Árbitro\n" +
                    "2- Modificar Árbitro\n" +
                    "3- Eliminar Árbitro\n" +
                    "4- Lista de Árbitros\n" +
                    "0- Volver");
            try {
                short opcion = keyboard.nextShort();
                switch (opcion) {
                    case 1:
                        System.out.println("Test");
                        break;
                    case 0:
                        volver = true;
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
    }

    public static void gestionarCuadros(Scanner keyboard){
        boolean volver = false;
        while(volver == false){
            System.out.println("Elija una opción:\n" +
                    "1- Ingresar Cuadro\n" +
                    "2- Modificar Modificar Cuadro\n" +
                    "3- Eliminar Cuadro\n" +
                    "4- Lista de Cuadros\n" +
                    "5- Detalle del Cuadro" +
                    "0- Volver");
            try {
                short opcion = keyboard.nextShort();
                switch (opcion) {
                    case 1:
                        System.out.println("Test");
                        break;
                    case 0:
                        volver = true;
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
    }

    public static void gestionarPartidos(Scanner keyboard){
        boolean volver = false;
        while(volver == false){
            System.out.println("Elija una opción:\n" +
                    "1- Ingresar Partido\n" +
                    "2- Detalle del Partido\n" +
                    "3- Cálculo de Salario" +
                    "0- Volver");
            try {
                short opcion = keyboard.nextShort();
                switch (opcion) {
                    case 1:
                        System.out.println("Test");
                        break;
                    case 0:
                        volver = true;
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
    }
}
