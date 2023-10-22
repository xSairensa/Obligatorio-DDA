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

    //region Metodos de Gestion

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
                        altaJugador(keyboard);
                        break;
                    case 4:
                        listarJugadores();
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

    //endregion

    //region Metodos Jugador

    public static void altaJugador(Scanner keyboard){
        //Cuando usas keyboard.nextInt(), se deja un salto de línea pendiente en el búfer
        //Hay que consumirlo con la linea siguiente sino rompera el programa
        keyboard.nextLine();

        System.out.println("Ingrese el nombre: ");
        String pNombre = keyboard.nextLine();
        System.out.println("Ingrese el apellido: ");
        String pApellido = keyboard.nextLine();
        System.out.println("Ingrese el documento: ");
        String pCi = keyboard.nextLine();
        System.out.println("Ingrese el sueldo: ");
        int pSueldo = keyboard.nextInt();

        keyboard.nextLine();

        System.out.println("Ingrese la posición: ");
        String pPosicion = keyboard.nextLine();

        Jugador pJugador = new Jugador(pNombre, pApellido, pCi, pSueldo, pPosicion);
        long cantidad = pListaJugadores.size();
        pListaJugadores.add(pJugador);
        if(pListaJugadores.size() > cantidad){
            System.out.println("Jugador agregado correctamente");
        }
        else{
            System.out.println("Error al guardar el jugador");
        }

    }

    public static void listarJugadores(){
        if (pListaJugadores.size() > 0) {
            for (Jugador pJugador : pListaJugadores) {
                System.out.println(pJugador.toString());
            }
        }
        else{
            System.out.println("No hay Jugadores ingresados");
        }
    }

    //endregion
}
