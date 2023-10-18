import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        short opcion;
        boolean salir = false;
        while(salir == false){

            System.out.println("Bienvenido!\n" +
                    "Ingrese la opcion deseada\n" +
                    "1- Jugador \n" +
                    "0- Salir");
            try {
                opcion = keyboard.nextShort();
                switch (opcion) {
                    case 1:
                        ingresarJugador(keyboard);
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
                opcion = -1;
                System.out.println("Debe ingresar un número");
            }
        }
        keyboard.close();
    }

    public static void ingresarJugador(Scanner keyboard){
        boolean volver = false;
        while(volver == false){
            System.out.println("Elija una opción:\n" +
                    "1- Ingresar Jugador\n" +
                    "2- Modificar Jugador\n" +
                    "3- Eliminar Jugador\n" +
                    "4- Lista de Jugadores\n" +
                    "0- Volver");
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
    }
}
