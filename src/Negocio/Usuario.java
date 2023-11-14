
package Negocio;

import Disenio.*;
import java.util.List;
import java.util.Scanner;
public class Usuario {
     private Taller taller;
    private Scanner scanner;
    private final Administracion admin;

       
    public Usuario(Administracion admin) {
        this.admin = admin;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        while (true) {
            System.out.println("Por favor, elige una opción:");
            System.out.println("1. Comprar auto");
            System.out.println("2. Comprar moto");
            System.out.println("3. Salir");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    comprarAuto();
                    break;
                case "2":
                    comprarMoto();
                    break;
                case "3":
                    System.out.println("Gracias por usar nuestro servicio. ¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                    break;
            }
        }
    }

     private void comprarAuto() {
    System.out.println("Estos son los autos disponibles:");
    for (Integer id : admin.getAutos().keySet()) {
        System.out.println("ID: " + id + ", Auto: " + admin.getAutos().get(id));
    }

    System.out.println("Por favor, ingresa el ID del auto que deseas comprar:");
    String idAuto = scanner.nextLine();
    if (admin.getAutos().containsKey(Integer.valueOf(idAuto))) {
        admin.getAutos().remove(Integer.valueOf(idAuto));
        System.out.println("Has comprado el auto con ID: " + idAuto);
    } else {
        System.out.println("Lo siento, ese auto no está disponible.");
    }
}
  private void comprarMoto() {
    System.out.println("Estas son las motos disponibles:");
    for (Integer id : admin.getMotos().keySet()) {
        System.out.println("ID: " + id + ", Moto: " + admin.getMotos().get(id));
    }

    System.out.println("Por favor, ingresa el ID de la moto que deseas comprar:");
    String idMoto = scanner.nextLine();
    if (admin.getMotos().containsKey(Integer.parseInt(idMoto))) {
        admin.getMotos().remove(Integer.parseInt(idMoto));
        System.out.println("Has comprado la moto con ID: " + idMoto);
    } else {
        System.out.println("Lo siento, esa moto no está disponible.");
    }
} 
    public static void main(String[] args) {
        // Inicializa el objeto Administracion como sea necesario
        Administracion admin = new Administracion();
        Usuario usuario = new Usuario(admin);
        usuario.iniciar();
    }
}

