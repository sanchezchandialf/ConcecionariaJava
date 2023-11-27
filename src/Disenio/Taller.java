package Disenio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
//LAS MOTOS NO INGRESAN AL TALLER 
class Taller implements Service{
    private Queue<Automovil> colaAutosEnTaller;
    private ArrayList<Integer> autosEnTallerIDs;
    private static final String FILE_NAME = "autosEnTallerIDs.txt"; // Nombre del archivo donde se guardarán las IDs

    public Taller() {
        this.colaAutosEnTaller = new LinkedList<>();
        this.autosEnTallerIDs = cargarIDs(); // Cargar las IDs desde el archivo
    }

    // Método para cargar las IDs desde el archivo
    private ArrayList<Integer> cargarIDs() {
        ArrayList<Integer> ids = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ids = (ArrayList<Integer>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se encontró el archivo de IDs. Se creará uno nuevo.");
        }
        return ids;
    }

    // Método para guardar las IDs en el archivo
    private void guardarIDs() {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(autosEnTallerIDs);
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println("Error al guardar las IDs en el archivo.");
        }
    }

    public ArrayList<Integer> getAutosEnTallerIDs() {
        return autosEnTallerIDs;
    }

    public void recibirAutos(HashMap<Integer, Automovil> autos) {
        boolean algunAutoEnTaller = false; // Variable para verificar si al menos un auto fue agregado al taller

        for (Automovil auto : autos.values()) {
            if (!auto.isMantenimiento() && auto.getKilometraje() > 0 && !autosEnTallerIDs.contains(auto.getId())) {
                colaAutosEnTaller.offer(auto);
                autosEnTallerIDs.add(auto.getId());
                algunAutoEnTaller = true; // Se ha agregado al menos un auto al taller
            } else if (auto.isMantenimiento() && autosEnTallerIDs.contains(auto.getId())) {
                System.out.println("Taller vacio");
                break;
            }
        }

        if (!algunAutoEnTaller) {
            System.out.println("El taller esta vacio. No se agregaron autos para servicio.");
        }

        guardarIDs(); // Guardar las IDs en el archivo después de recibir los autos
    }

    public void realizarServicios(HashMap<Integer, Automovil> autos) {
        while (!colaAutosEnTaller.isEmpty()) {
            Automovil auto = colaAutosEnTaller.poll();
            System.out.println("Realizando servicios al auto con ID: " + auto.getId());
            realizarProcedimientos(auto);

            // Actualizar estado de mantenimiento a true después de los servicios
            auto.setMantenimiento(true);

            // Actualizar el estado del automóvil en el HashMap autos
            actualizarEstadoEnHashMap(auto, autos);
        }
    }
   
    public void cambioAceite(Automovil auto) {
        System.out.println("Cambiando aceite al auto con ID: " + auto.getId());
        // Lógica para cambiar el aceite
    }

    public void inspeccionSeguridad(Automovil auto) {
        System.out.println("Inspeccionando seguridad del auto con ID: " + auto.getId());
        // Lógica para la inspección de seguridad
    }

    public void rellenoNiveles(Automovil auto) {
        System.out.println("Rellenando niveles del auto con ID: " + auto.getId());
        // Lógica para rellenar niveles
    }

    public void liquidoLimpiaparabrisas(Automovil auto) {
        System.out.println("Añadiendo líquido limpiaparabrisas al auto con ID: " + auto.getId());
        // Lógica para añadir líquido limpiaparabrisas
    }

    public void diagnosticoComputadora(Automovil auto) {
        System.out.println("Realizando diagnóstico por computadora al auto con ID: " + auto.getId());
        // Lógica para el diagnóstico por computadora
    }

    public void rotacionLlantas(Automovil auto) {
        System.out.println("Rotando llantas del auto con ID: " + auto.getId());
        // Lógica para la rotación de llantas
    }

    public void cambioFiltroPolvoPolen(Automovil auto) {
        System.out.println("Cambiando filtro de polvo/polen al auto con ID: " + auto.getId());
        // Lógica para cambiar el filtro de polvo/polen
    }
    
    public void realizarProcedimientos(Automovil auto) {
        cambioAceite(auto);
        inspeccionSeguridad(auto);
        rellenoNiveles(auto);
        liquidoLimpiaparabrisas(auto);
        diagnosticoComputadora(auto);
        rotacionLlantas(auto);
        cambioFiltroPolvoPolen(auto);
    }

    private void actualizarEstadoEnHashMap(Automovil auto, HashMap<Integer, Automovil> autos) {
        int idAuto = auto.getId();
        if (autos.containsKey(idAuto)) {
            autos.get(idAuto).setMantenimiento(true);
        }
    }

    public static void main(String[] args) {
        try {
            Administracion admin = new Administracion();
            admin.cargarDatos();

            Taller taller = new Taller();
            HashMap<Integer, Automovil> autos = admin.getAutos(); // Obtener el HashMap de autos
            System.out.println("----------------------------------------------------");
            System.out.println("BIENVENIDOS AL TALLER DE AUTOS DE LA CONSECIONARIA ");
            taller.recibirAutos(autos);
            
            taller.realizarServicios(autos); // Pasar el HashMap de autos a realizarServicios
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
