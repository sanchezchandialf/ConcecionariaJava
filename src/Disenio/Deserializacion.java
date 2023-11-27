package Disenio;
/*
Este programa realiza la deserialización de datos de archivos binarios de autos (autos.dat)
y motocicletas (motos.dat), convirtiéndolos en archivos de texto para generar catálogos
de autos (catalogo_autos.txt) y motos (catalogo_motos.txt).

Los archivos de texto contendrán detalles detallados de los vehículos almacenados, 
incluyendo ID del vehículo seguido de la información correspondiente del automóvil o moto.
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;

class Deserializacion {

    public static void main(String[] args) {
        Deserializacion deserializacion = new Deserializacion();
        deserializacion.deserializarAutos();
        deserializacion.deserializarMotos();
    }

    public void deserializarAutos() {
        try (FileInputStream fis = new FileInputStream("autos.dat");
             ObjectInputStream ois = new ObjectInputStream(fis);
             FileWriter writer = new FileWriter("catalogo_autos.txt")) {
            HashMap<Integer, Automovil> autos = (HashMap<Integer, Automovil>) ois.readObject();
            for (Map.Entry<Integer, Automovil> entry : autos.entrySet()) {
                writer.write("ID Auto: " + entry.getKey() + "\n");
                writer.write("Automóvil: " + entry.getValue() + "\n");
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void deserializarMotos() {
        try (FileInputStream fis = new FileInputStream("motos.dat");
             ObjectInputStream ois = new ObjectInputStream(fis);
             FileWriter writer = new FileWriter("catalogo_motos.txt")) {
            HashMap<Integer, Motocicleta> motos = (HashMap<Integer, Motocicleta>) ois.readObject();
            for (Map.Entry<Integer, Motocicleta> entry : motos.entrySet()) {
                writer.write("ID Moto: " + entry.getKey() + "\n");
                writer.write("Motocicleta: " + entry.getValue() + "\n");
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
