package Negocio;

import Disenio.*;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Usuario {
    private Scanner scanner;
    private final Administracion admin;
    private ArrayList<Integer> autosComprados;
    private ArrayList<Integer> motosCompradas;

    public Usuario(Administracion admin) {
        this.admin = admin;
        this.scanner = new Scanner(System.in);
        this.autosComprados = new ArrayList<>();
        this.autosComprados = cargarAutosComprados();
        this.motosCompradas= new ArrayList<>();
        this.motosCompradas = cargarMotosCompradas();
    }
     private ArrayList<Integer> cargarAutosComprados() {
        ArrayList<Integer> autos = new ArrayList<>();
        try {
            File file = new File("autos_comprados.txt");
            if (file.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while ((line = br.readLine()) != null) {
                    autos.add(Integer.parseInt(line));
                }
                br.close();
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al cargar datos de autos comprados: " + e.getMessage());
        }
        return autos;
    }

    private void guardarAutosComprados() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("autos_comprados.txt"));
            for (Integer id : autosComprados) {
                bw.write(String.valueOf(id));
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Error al guardar datos de autos comprados: " + e.getMessage());
        }
    }

    private ArrayList<Integer> cargarMotosCompradas() {
    ArrayList<Integer> motos = new ArrayList<>();
    try {
        File file = new File("motos_compradas.txt");
        if (file.exists()) {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                motos.add(Integer.parseInt(line));
            }
            br.close();
        }
    } catch (IOException | NumberFormatException e) {
        System.out.println("Error al cargar datos de motos compradas: " + e.getMessage());
    }
    return motos;
}

private void guardarMotosCompradas() {
    try {
        BufferedWriter bw = new BufferedWriter(new FileWriter("motos_compradas.txt"));
        for (Integer id : motosCompradas) {
            bw.write(String.valueOf(id));
            bw.newLine();
        }
        bw.close();
    } catch (IOException e) {
        System.out.println("Error al guardar datos de motos compradas: " + e.getMessage());
    }
}
 public void iniciar() {
        while (true) {
            System.out.println("Por favor, elige una opción:");
            System.out.println("1. Ver catálogo");
            System.out.println("2. Comprar auto");
            System.out.println("3. Comprar moto");
            System.out.println("4. Salir");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    verCatalogo();
                    break;
                case "2":
                    comprarAuto();
                    break;
                case "3":
                    comprarMoto();
                    break;
                case "4":
                    System.out.println("Gracias por usar nuestro servicio. ¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                    break;
            }
        }
    }
    private boolean esIdAutoValido(String id) {
        try {
            int idAuto = Integer.parseInt(id);
            return admin.getAutos().containsKey(idAuto);
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
    }
    
      private void verCatalogo() {
         System.out.println("Catálogo de autos disponibles:");
    for (Integer id : admin.getAutos().keySet()) {
        if (!autosComprados.contains(id)) {
            System.out.println("ID: " + id + ", Auto: " + admin.getAutos().get(id));
        }
    }

       System.out.println("\nCatálogo de motos disponibles:");
    for (Integer id : admin.getMotos().keySet()) {
        if (!motosCompradas.contains(id)) {
            System.out.println("ID: " + id + ", Moto: " + admin.getMotos().get(id));
        }
    }
    
    }

    private void comprarAuto() {

          System.out.println("Autos disponibles para comprar:");
    for (Integer id : admin.getAutos().keySet()) {
        if (!autosComprados.contains(id)) {
            System.out.println("ID: " + id + ", Auto: " + admin.getAutos().get(id));
        }
    }

        System.out.println("Ingresa el ID del auto que deseas comprar:");
        String idAuto = scanner.nextLine();
        if (esIdAutoValido(idAuto)) {
            int idAutoSeleccionado = Integer.parseInt(idAuto);
            if (admin.getAutos().containsKey(idAutoSeleccionado)) {
                Automovil autoSeleccionado = admin.getAutos().get(idAutoSeleccionado);
                 autosComprados.add(idAutoSeleccionado);
                  guardarAutosComprados();
                if (autoSeleccionado.getKilometraje() > 0) {
                    System.out.println("El auto se enviara al taller y estará listo en 7 días hábiles.");
                }
                admin.getAutos().remove(idAutoSeleccionado);
                autosComprados.add(idAutoSeleccionado);
                  guardarAutosComprados();
                System.out.println("Has comprado el auto con ID: " + idAutoSeleccionado + ". ¡Disfrútalo!");
            } else {
                System.out.println("Lo siento, ese auto no está disponible para la compra.");
            }
        } else {
            System.out.println("Por favor, ingresa un ID válido.");
        }
    }
    private void comprarMoto() {
            System.out.println("Motos disponibles para comprar:");
       for (Integer id : admin.getMotos().keySet()) {
           if (!motosCompradas.contains(id)) {
               System.out.println("ID: " + id + ", Moto: " + admin.getMotos().get(id));
           }
       }


        System.out.println("Ingresa el ID de la moto que deseas comprar:");
        String idMoto = scanner.nextLine();
        if (esIdAutoValido(idMoto)) {
            int idMotoSeleccionada = Integer.parseInt(idMoto);
            if (admin.getMotos().containsKey(idMotoSeleccionada)) {
                admin.getMotos().remove(idMotoSeleccionada);
                guardarMotosCompradas();
                System.out.println("Has comprado la moto con ID: " + idMotoSeleccionada + ". ¡Disfrútala!");
            } else {
                System.out.println("Lo siento, esa moto no está disponible para la compra.");
            }
        } else {
            System.out.println("Por favor, ingresa un ID válido.");
        }
    }
    public static void main(String[] args) {
        // Inicializa el objeto Administracion como sea necesario
        Administracion admin = new Administracion();
        Usuario usuario = new Usuario(admin);
        usuario.iniciar();
    }
}
