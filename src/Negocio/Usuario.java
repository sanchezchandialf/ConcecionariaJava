package Negocio;

import Disenio.*;
import java.util.Scanner;

public class Usuario {
    private Scanner scanner;
    private final Administracion admin;

    public Usuario(Administracion admin) {
        this.admin = admin;
        this.scanner = new Scanner(System.in);
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
            System.out.println("ID: " + id + ", Auto: " + admin.getAutos().get(id));
        }

        System.out.println("\nCatálogo de motos disponibles:");
        for (Integer id : admin.getMotos().keySet()) {
            System.out.println("ID: " + id + ", Moto: " + admin.getMotos().get(id));
        }
    }

    private void comprarAuto() {
        System.out.println("Autos disponibles para comprar:");
        for (Integer id : admin.getAutos().keySet()) {
            System.out.println("ID: " + id + ", Auto: " + admin.getAutos().get(id));
        }

        System.out.println("Ingresa el ID del auto que deseas comprar:");
        String idAuto = scanner.nextLine();
        if (esIdAutoValido(idAuto)) {
            int idAutoSeleccionado = Integer.parseInt(idAuto);
            if (admin.getAutos().containsKey(idAutoSeleccionado)) {
                Automovil autoSeleccionado = admin.getAutos().get(idAutoSeleccionado);
                if (autoSeleccionado.getKilometraje() > 0) {
                    System.out.println("El auto se enviará al taller y estará listo en 7 días hábiles.");
                }
                admin.getAutos().remove(idAutoSeleccionado);
                System.out.println("Has comprado el auto con ID: " + idAutoSeleccionado + ". ¡Disfrútalo!");
            } else {
                System.out.println("Lo siento, ese auto no está disponible para la compra.");
            }
        } else {
            System.out.println("Por favor, ingresa un ID válido.");
        }
    }

    private void comprarMoto() {
        System.out.println("Estas son las motos disponibles:");
        for (Integer id : admin.getMotos().keySet()) {
            System.out.println("ID: " + id + ", Moto: " + admin.getMotos().get(id));
        }

        System.out.println("Ingresa el ID de la moto que deseas comprar:");
        String idMoto = scanner.nextLine();
        if (esIdAutoValido(idMoto)) {
            int idMotoSeleccionada = Integer.parseInt(idMoto);
            if (admin.getMotos().containsKey(idMotoSeleccionada)) {
                admin.getMotos().remove(idMotoSeleccionada);
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
