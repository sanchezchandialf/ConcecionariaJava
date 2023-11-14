

package Disenio;
import java.util.HashMap;
import java.io.*;
import java.util.Scanner;
public class Administracion {
    HashMap<Integer, Automovil> autos;
    private HashMap<Integer, Motocicleta> motos;
    private Scanner scanner;

    public Administracion() {
        this.autos = new HashMap<>();
        this.motos = new HashMap<>();
        this.scanner = new Scanner(System.in); // Inicializar Scanner
        if (new File("autos.dat").exists() && new File("motos.dat").exists()) {
            cargarDatos();
        } else {
        // Crear y agregar 5 autos de diferentes marcas y modelos
        this.autos.put(1, new Automovil(MarcasAuto.TOYOTA, CarroceriaAuto.SEDAN, 1.6, 1, Color.AZUL, true, 0, true, 20000.0)); // 0km
        this.autos.put(2, new Automovil(MarcasAuto.HONDA, CarroceriaAuto.HATCHBACK, 1.8, 2, Color.VERDE, false, 5000, true, 15000.0)); // usado
        this.autos.put(3, new Automovil(MarcasAuto.FORD, CarroceriaAuto.PICKUP, 2.0, 3, Color.NEGRO, true, 0,true ,22000.0)); // 0km
        this.autos.put(4,new Automovil(MarcasAuto.CHEVROLET ,CarroceriaAuto.SUV ,2.1 ,4 ,Color.BLANCO ,false ,8000 ,true ,18000.0)); // usado
        this.autos.put(5,new Automovil(MarcasAuto.BMW ,CarroceriaAuto.CONVERTIBLE ,2.0 ,5 ,Color.ROJO ,true ,0,true ,30000.0)); // 0km

        // Crear y agregar 5 motos de diferentes marcas y cilindradas
        this.motos.put(1,new Motocicleta(MarcasMoto.HONDA ,150 ,6 ,Color.AZUL,true ,0,true ,10000.0)); // 0km
        this.motos.put(2,new Motocicleta(MarcasMoto.YAMAHA ,120 ,7 ,Color.VERDE,true ,0,true ,9000.0)); // 0km
        this.motos.put(3,new Motocicleta(MarcasMoto.SUZUKI ,250 ,8 ,Color.NEGRO,true ,0,true ,11000.0)); // 0km
        this.motos.put(4,new Motocicleta(MarcasMoto.KAWASAKI ,150 ,9 ,Color.BLANCO,true ,0,true ,8000.0)); // 0km
        this.motos.put(5,new Motocicleta(MarcasMoto.DUCATI ,120 ,10 ,Color.ROJO,true ,0,true ,12000.0)); // 0km

        guardarDatos();
        }
    }

    public void guardarDatos() {
        try (FileOutputStream fos = new FileOutputStream("autos.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(autos);
        } catch (IOException e) {
            System.out.println("Error al guardar los datos de los autos: " + e.getMessage());
        }

        try (FileOutputStream fos = new FileOutputStream("motos.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(motos);
        } catch (IOException e) {
            System.out.println("Error al guardar los datos de las motos: " + e.getMessage());
        }
    }

     public void cargarDatos() {
        try (FileInputStream fisAutos = new FileInputStream("autos.dat");
             ObjectInputStream oisAutos = new ObjectInputStream(fisAutos)) {
            autos = (HashMap<Integer, Automovil>) oisAutos.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los datos de los autos: " + e.getMessage());
        }

        try (FileInputStream fisMotos = new FileInputStream("motos.dat");
             ObjectInputStream oisMotos = new ObjectInputStream(fisMotos)) {
            motos = (HashMap<Integer, Motocicleta>) oisMotos.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los datos de las motos: " + e.getMessage());
        }
    }

    public void agregarAuto() {
    System.out.println("Por favor, ingresa los detalles del auto:");
    System.out.println("Marca (opciones: TOYOTA, HONDA, FORD, CHEVROLET, BMW, MERCEDES, AUDI, VOLKSWAGEN):");
    MarcasAuto marca = MarcasAuto.valueOf(scanner.nextLine().toUpperCase());
    System.out.println("Carrocería (opciones: SEDAN, HATCHBACK, SUV, PICKUP, COUPE, CONVERTIBLE):");
    CarroceriaAuto carroceria = CarroceriaAuto.valueOf(scanner.nextLine().toUpperCase());
    System.out.println("Motor:");
    double motor = Double.parseDouble(scanner.nextLine());
    System.out.println("ID:");
    int id = Integer.parseInt(scanner.nextLine());
    System.out.println("Color (opciones: ROJO, AZUL, VERDE, AMARILLO, NEGRO, BLANCO, NARANJA, MORADO, ROSA, MARRON):");
    Color color = Color.valueOf(scanner.nextLine().toUpperCase());
    System.out.println("¿Es nuevo? (true/false):");
    boolean nuevo = Boolean.parseBoolean(scanner.nextLine());
    System.out.println("Kilometraje:");
    int kilometraje = Integer.parseInt(scanner.nextLine());
    System.out.println("¿Está disponible? (true/false):");
    boolean disponible = Boolean.parseBoolean(scanner.nextLine());
    System.out.println("Precio:");
    double precio = Double.parseDouble(scanner.nextLine());
    Automovil auto = new Automovil(marca, carroceria, motor, id, color, nuevo, kilometraje, disponible, precio);
    autos.put(id, auto);
    System.out.println("Se ha agregado el auto con ID: " + id);
    guardarDatos();  // Guarda los datos después de agregar un auto
    guardarDatosAutos();
}

public void agregarMoto() {
    System.out.println("Por favor, ingresa los detalles de la moto:");
    System.out.println("Marca (opciones: SUZUKI, KAWASAKI, DUCATI, HARLEY_DAVIDSON):");
    MarcasMoto marca = MarcasMoto.valueOf(scanner.nextLine().toUpperCase());
    System.out.println("Cilindrada:");
    int cilindrada = Integer.parseInt(scanner.nextLine());
    System.out.println("ID:");
    int id = Integer.parseInt(scanner.nextLine());
    System.out.println("Color (opciones: ROJO, AZUL, VERDE, AMARILLO, NEGRO, BLANCO, NARANJA, MORADO, ROSA, MARRON):");
    Color color = Color.valueOf(scanner.nextLine().toUpperCase());
    System.out.println("¿Es nueva? (true/false):");
    boolean nuevo = Boolean.parseBoolean(scanner.nextLine());
    System.out.println("Kilometraje:");
    int kilometraje = Integer.parseInt(scanner.nextLine());
    System.out.println("¿Está disponible? (true/false):");
    boolean disponible = Boolean.parseBoolean(scanner.nextLine());
    System.out.println("Precio:");
    double precio = Double.parseDouble(scanner.nextLine());
    Motocicleta moto = new Motocicleta(marca, cilindrada, id, color, nuevo, kilometraje, disponible, precio);
    motos.put(id, moto);
    System.out.println("Se ha agregado la moto con ID: " + id);
    guardarDatos();  // Guarda los datos después de agregar una moto
    guardarDatosMotos();
}

public void guardarDatosAutos() {
    try (FileOutputStream fos = new FileOutputStream("autos.dat");
         ObjectOutputStream oos = new ObjectOutputStream(fos)) {
        oos.writeObject(autos);
    } catch (IOException e) {
        System.out.println("Error al guardar los datos de los autos: " + e.getMessage());
    }
}

public void guardarDatosMotos() {
    try (FileOutputStream fos = new FileOutputStream("motos.dat");
         ObjectOutputStream oos = new ObjectOutputStream(fos)) {
        oos.writeObject(motos);
    } catch (IOException e) {
        System.out.println("Error al guardar los datos de las motos: " + e.getMessage());
    }
}
    public HashMap<Integer, Automovil> getAutos() {
        return this.autos;
    }

    public HashMap<Integer, Motocicleta> getMotos() {
        return this.motos;
    }
    public static void main(String[] args) {
        Administracion admin = new Administracion();
         admin.cargarDatos();

    // Aquí puedes agregar código para visualizar los datos cargados
    // Por ejemplo, puedes imprimir el contenido de los HashMaps autos y motos
    System.out.println(admin.autos);
    System.out.println(admin.motos);
     while (true) {
        System.out.println("Por favor, elige una opción:");
        System.out.println("1. Agregar auto");
        System.out.println("2. Agregar moto");
        System.out.println("3. Salir");
       String opcion = admin.scanner.nextLine();

        switch (opcion) {
            case "1":
                admin.agregarAuto();
                System.out.println(admin.autos);
                break;
            case "2":
                admin.agregarMoto();
                System.out.println(admin.motos);
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
}
