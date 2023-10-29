import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean salir = false;
        while(salir == false) {

            System.out.println("Bienvenido!\n" +
                    "Ingrese la opcion deseada\n" +
                    "1- Gestionar Jugador \n" +
                    "2- Gestionar Técnico \n" +
                    "3- Gestionar Equipo \n" +
                    "4- Gestionar Árbitro \n" +
                    "5- Gestionar Partido \n" +
                    "0- Salir");
            try {
                short opcion = keyboard.nextShort();
                switch (opcion) {
                    case 1:
                        MetodosJugador pMetodoJ = new MetodosJugador();
                        pMetodoJ.gestionJugadores(keyboard);
                        break;
                    case 2:
                        MetodosTecnico pMetodoT = new MetodosTecnico();
                        pMetodoT.gestionTecnicos(keyboard);
                        break;
                    case 3:
                        MetodosEquipo pMetodoE = new MetodosEquipo();
                        pMetodoE.gestionarEquipos(keyboard);
                        break;
                    case 4:
                        MetodosArbitro pMetodoA = new MetodosArbitro();
                        pMetodoA.gestionArbitros(keyboard);
                        break;
                    case 5:
                        MetodosPartido pMetodoP = new MetodosPartido();
                        pMetodoP.gestionarPartidos(keyboard);
                    case 0:
                        salir = true;
                        break;
                    default:
                        System.out.println("La opción ingresada no es correcta");
                        break;
                }
            } catch (InputMismatchException e) {
                String ingreso = keyboard.nextLine();
                System.err.println("Debe ingresar un numero, no '" + ingreso + "'");
            }
        }
        keyboard.close();
    }
}