import java.util.ArrayList;
import java.util.Scanner;

public class MetodosArbitro {
    static ArrayList<Arbitro> pListaArbitros = new ArrayList<Arbitro>();
    public static void gestionArbitros(Scanner keyboard){
        limpiarConsola();
        boolean salir = false;
        while(salir == false){
            System.out.println("Ingrese la opcion deseada\n" +
                    "1- Alta Árbitro \n" +
                    "2- Actualizar Árbitro \n" +
                    "3- Eliminar Árbitro \n" +
                    "4- Listar Árbitros \n" +
                    "0- Volver");
            //     try {
            short opcion4 = keyboard.nextShort();
            switch (opcion4) {
                case 1:
                    altaArbitro(keyboard);
                    break;
                case 2:
                    actualizarArbitros(keyboard);
                    break;
                case 3:
                    eliminarArbitro(keyboard);
                    break;
                case 4:
                    listarArbitros();
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
    //FUNCIONA
    public static void altaArbitro(Scanner keyboard){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos del técnico:");

        System.out.print("Nombre: ");
        String pNombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String pApellido = scanner.nextLine();

        System.out.print("Cédula: ");
        String pCi = scanner.nextLine();

        System.out.print("Sueldo: ");
        int pSueldo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Cantidad de partidos: ");
        int pCantPartidos = scanner.nextInt();
        scanner.nextLine();

        Arbitro pArbitro = new Arbitro(pNombre, pApellido, pCi, pSueldo, pCantPartidos);
        long cantidad = pListaArbitros.size();
        pListaArbitros.add(pArbitro);
        if(pListaArbitros.size() > cantidad){
            System.out.println("Árbitro agregado correctamente");
        }
        else{
            System.out.println("Error al guardar el árbitro");
        }
    }
    //FUNCIONA
    public static void eliminarArbitro(Scanner keyboard){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la CI del árbitro que quiere eliminar:");
        String ciA = scanner.nextLine();

        Arbitro arbitroE = null;
        for (Arbitro arbitro : pListaArbitros) {
            if (arbitro.getCi().equals(ciA)) {
                arbitroE = arbitro;
                pListaArbitros.remove(arbitroE);
                System.out.println("El árbitro se eliminó correctamente.");
                listarArbitros();
                break;
            }
        }
    }
    //FUNCIONA
    public static void listarArbitros(){
        System.out.println("Lista de Árbitros:");
        for (Arbitro arbitro : pListaArbitros) {
            System.out.println(arbitro);
        }
    }
    public static void actualizarArbitros(Scanner keyboard){
        keyboard.nextLine();
        listarArbitros();
        System.out.println("Ingrese CI del árbitro que desee modificar:");
        String pCi = keyboard.nextLine();
        Arbitro pArbitro = buscarArbitro(pCi);
        boolean salir = false;
        while(salir == false) {
            if (pArbitro != null) {
                System.out.println("Seleccione lo que desea modificar: \n" +
                        "1 - Nombre: \n" +
                        "2 - Apellido: \n" +
                        "3 - CI: \n" +
                        "4 - Sueldo: \n" +
                        "5 - Minutos jugados: \n" +
                        "0 - Volver");
                int opcion = keyboard.nextInt();
                keyboard.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nuevo nombre:");
                        String nuevoNombre = keyboard.nextLine();
                        pArbitro.setNombre(nuevoNombre);
                        System.out.println("Nombre modificado correctamente");
                        break;
                    case 2:
                        System.out.println("Ingrese el nuevo apellido:");
                        String nuevoApellido = keyboard.nextLine();
                        pArbitro.setApellido(nuevoApellido);
                        System.out.println("Apellido modificado correctamente");
                        break;
                    case 3:
                        System.out.println("Ingrese la nueva CI:");
                        String nuevaCI = keyboard.nextLine();
                        pArbitro.setCi(nuevaCI);
                        System.out.println("CI modificada correctamente");
                        break;
                    case 4:
                        System.out.println("Ingrese el nuevo sueldo:");
                        int nuevoSueldo = keyboard.nextInt();
                        pArbitro.setSueldo(nuevoSueldo);
                        System.out.println("Sueldo modificado correctamente");
                        break;
                    case 5:
                        System.out.println("Ingrese la cantidad de partidos:");
                        int nuevosPartidos = keyboard.nextInt();
                        pArbitro.setCantPartidos(nuevosPartidos);
                        System.out.println("Partidos dirigidos modificados correctamente");
                        break;
                    case 0:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción Incorrecta");
                        break;
                }
            }
            else{
                System.out.println("El equipo no existe");
            }
        }
    }
    public static Arbitro buscarArbitro(String pCI){
        Arbitro elArbitro = null;
        for (Arbitro pArbitro : pListaArbitros){
            if(pArbitro.getCi().equalsIgnoreCase(pCI)){
                elArbitro = pArbitro;
                break;
            }
        }
        return elArbitro;
    }
    private static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
