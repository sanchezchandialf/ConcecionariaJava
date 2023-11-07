package Diseño;
import java.util.HashMap;
import java.io.*;

public class Administracion {
    HashMap<Integer, Automovil> autos;
    private HashMap<Integer, Motocicleta> motos;

    public Administracion() {
        this.autos = new HashMap<>();
        this.motos = new HashMap<>();

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
        try (FileInputStream fis = new FileInputStream("autos.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            autos = (HashMap<Integer, Automovil>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los datos de los autos: " + e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream("motos.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            motos = (HashMap<Integer, Motocicleta>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los datos de las motos: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Administracion admin = new Administracion();
         admin.cargarDatos();

    // Aquí puedes agregar código para visualizar los datos cargados
    // Por ejemplo, puedes imprimir el contenido de los HashMaps autos y motos
    System.out.println(admin.autos);
    System.out.println(admin.motos);
} 
}
