

package Disenio;
import java.util.HashMap;

public class Taller {
    private HashMap<Integer, Automovil> autosEnTaller;

    public Taller() {
        this.autosEnTaller = new HashMap<>();
    }

    public void recibirAutos(HashMap<Integer, Automovil> autos) {
        for (Integer key : autos.keySet()) {
            Automovil auto = autos.get(key);
            if (auto.getKilometraje() > 0) {
                this.autosEnTaller.put(key, auto);
            }
        }
    }
     public HashMap<Integer, Automovil> getAutosEnTaller() {
        return this.autosEnTaller;
    }
    
    // Aquí puedes agregar métodos para trabajar con los autos en el taller
      private void imprimirAutosEnTaller() {
        if (this.autosEnTaller.isEmpty()) {
            System.out.println("No hay autos en el taller.");
        } else {
            System.out.println("Autos en el taller:");
            for (Integer key : this.autosEnTaller.keySet()) {
                Automovil auto = this.autosEnTaller.get(key);
                System.out.println("ID: " + key + ", Auto: " + auto);
            }
        }
    }
      
      public static void main(String[] args) {
        Administracion admin = new Administracion();
        admin.cargarDatos();

        Taller taller = new Taller();
        taller.recibirAutos(admin.autos);
        taller.imprimirAutosEnTaller();
         
    }   

}
