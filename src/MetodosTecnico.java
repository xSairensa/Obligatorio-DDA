import java.util.ArrayList;
import java.util.Scanner;

public class MetodosTecnico {
    static ArrayList<Tecnico> pListaTecnicos = new ArrayList<Tecnico>();
    public static void gestionTecnicos(Scanner keyboard){
        limpiarConsola();
        boolean salir = false;
        while(salir == false){
            System.out.println("Ingrese la opcion deseada\n" +
                    "1- Alta Técnico \n" +
                    "2- Actualizar Técnico \n" +
                    "3- Eliminar Técnico \n" +
                    "4- Listar Técnicos \n" +
                    "0- Volver");
            //     try {
            short opcion3 = keyboard.nextShort();
            switch (opcion3) {
                case 1:
                    altaTecnico(keyboard);
                    break;
                case 2:
                    actualizarTecnicos(keyboard);
                    break;
                case 3:
                    eliminarTecnico(keyboard);
                    break;
                case 4:
                    listarTecnicos();
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
    public static void altaTecnico(Scanner keyboard){
        MetodosEquipo pMetodoE = new MetodosEquipo();
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

        System.out.println("Equipos disponibles:");
        pMetodoE.listarEquipos();
        System.out.print("Seleccione el nombre de su equipo: ");
        String nombreEquipo = scanner.nextLine();
        Equipo equipoSeleccionado = pMetodoE.buscarEquipo(nombreEquipo);

        Tecnico pTecnico = new Tecnico(pNombre, pApellido, pCi, pSueldo, equipoSeleccionado);
        boolean isExiste = tecnicoExistente(pCi, pListaTecnicos);
        if(!isExiste){
            pListaTecnicos.add(pTecnico);
            System.out.println("Técnico agregado correctamente");
            try{
                equipoSeleccionado.setTecnico(pTecnico);
            }
            catch (NullPointerException e){
                System.out.println("No se pudo setear el tecnico del equipo");
            }
        }
        else{
            System.out.println("El tecnico ya existe");
        }
    }
    public static void actualizarTecnicos(Scanner keyboard){
        MetodosEquipo pMetodoE = new MetodosEquipo();
        keyboard.nextLine();
        listarTecnicos();
        System.out.println("Ingrese CI del técnico que desee modificar:");
        String pCi = keyboard.nextLine();
        Tecnico pTecnico = buscarTecnico(pCi);
        boolean salir = false;
        while(salir == false) {
            if (pTecnico != null) {
                System.out.println("Seleccione lo que desea modificar: \n" +
                        "1 - Nombre: \n" +
                        "2 - Apellido: \n" +
                        "3 - CI: \n" +
                        "4 - Sueldo: \n" +
                        "5 - Equipo: \n" +
                        "0 - Volver");
                int opcion = keyboard.nextInt();
                keyboard.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nuevo nombre:");
                        String nuevoNombre = keyboard.nextLine();
                        pTecnico.setNombre(nuevoNombre);
                        System.out.println("Nombre modificado correctamente");
                        break;
                    case 2:
                        System.out.println("Ingrese el nuevo apellido:");
                        String nuevoApellido = keyboard.nextLine();
                        pTecnico.setApellido(nuevoApellido);
                        System.out.println("Apellido modificado correctamente");
                        break;
                    case 3:
                        System.out.println("Ingrese la nueva CI:");
                        String nuevaCI = keyboard.nextLine();
                        pTecnico.setCi(nuevaCI);
                        System.out.println("CI modificada correctamente");
                        break;
                    case 4:
                        System.out.println("Ingrese el nuevo sueldo:");
                        int nuevoSueldo = keyboard.nextInt();
                        pTecnico.setSueldo(nuevoSueldo);
                        System.out.println("Sueldo modificado correctamente");
                        break;
                    case 5:
                        System.out.println("Equipos disponibles:");
                        pMetodoE.listarEquipos();
                        System.out.print("Seleccione el nombre de su equipo nuevo: ");
                        String nombreEquipo = keyboard.nextLine();
                        Equipo pNuevoEquipo = pMetodoE.buscarEquipo(nombreEquipo);
                        pTecnico.setEquipo(pNuevoEquipo);
                        //Seteo el nuevo tecnico del equipo
                        pNuevoEquipo.setTecnico(pTecnico);
                        break;
                    case 0:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción Incorrecta");
                        break;
                }
            }
        }
    }
    //FUNCIONA
    public static void eliminarTecnico(Scanner keyboard){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la CI del técnico que quiere eliminar:");
        String ciT = scanner.nextLine();

        Tecnico tecnicoE = buscarTecnico(ciT);
            if (tecnicoE != null) {
                Equipo pEquipo = tecnicoE.getEquipo();
                pEquipo.setTecnico(null);
                pListaTecnicos.remove(tecnicoE);
                System.out.println("El técnico se eliminó correctamente.");
                listarTecnicos();
            }
    }
    //FUNCIONA
    public static void listarTecnicos(){
        System.out.println("Lista de Tecnicos:");
        for (Tecnico tecnico : pListaTecnicos) {
            System.out.println(tecnico);
        }
    }
    //FUNCIONA
    public static Tecnico buscarTecnico(String pCI){
        Tecnico elTecnico = null;
        for (Tecnico pTecnico : pListaTecnicos){
            if(pTecnico.getCi().equalsIgnoreCase(pCI)){
                elTecnico = pTecnico;
                break;
            }
        }
        return elTecnico;
    }
    public static boolean tecnicoExistente(String pCI, ArrayList<Tecnico> pLista){
        boolean existe = false;
        for (Tecnico pTecnico : pLista){
            if(pTecnico.getCi().equalsIgnoreCase(pCI)){
                existe = true;
            }
        }
        return existe;
    }
    private static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
