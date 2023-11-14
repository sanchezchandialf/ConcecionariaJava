package Disenio;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
public class TallerAuto implements Service {
    private Queue<Automovil> colaAutos;
    private Taller taller;

    public TallerAuto(Taller taller) {
        this.taller = taller;
        this.colaAutos = new LinkedList<>(taller.getAutosEnTaller().values());
    }

    public void recibirAutos() {
        this.colaAutos.addAll(taller.getAutosEnTaller().values());

    }

    @Override
    public void cambioAceite() {
        if (!colaAutos.isEmpty()) {
            Automovil auto = colaAutos.peek();
            System.out.println("Cambiando aceite al auto con ID: " + auto.getId());
        } else {
            System.out.println("No hay autos en la cola.");
        }
    }

    @Override
    public void inspeccionSeguridad() {
        if (!colaAutos.isEmpty()) {
            Automovil auto = colaAutos.peek();
            System.out.println("Inspeccionando seguridad del auto con ID: " + auto.getId());
            // Aquí va la lógica para la inspección de seguridad
        } else {
            System.out.println("No hay autos en la cola.");
        }
    }
    @Override
    public void rellenoNiveles() {
        if (!colaAutos.isEmpty()) {
            Automovil auto = colaAutos.peek();
            System.out.println("Rellenando niveles del auto con ID: " + auto.getId());
            // Aquí va la lógica para rellenar los niveles
        } else {
            System.out.println("No hay autos en la cola.");
        }
    }

    @Override
    public void liquidoLimpiaparabrisas() {
        if (!colaAutos.isEmpty()) {
            Automovil auto = colaAutos.peek();
            System.out.println("Añadiendo líquido limpiaparabrisas al auto con ID: " + auto.getId());
            // Aquí va la lógica para añadir líquido limpiaparabrisas
        } else {
            System.out.println("No hay autos en la cola.");
        }
    }

    @Override
    public void diagnosticoComputadora() {
        if (!colaAutos.isEmpty()) {
            Automovil auto = colaAutos.peek();
            System.out.println("Realizando diagnóstico por computadora al auto con ID: " + auto.getId());
            // Aquí va la lógica para el diagnóstico por computadora
        } else {
            System.out.println("No hay autos en la cola.");
        }
    }

    @Override
    public void rotacionLlantas() {
        if (!colaAutos.isEmpty()) {
            Automovil auto = colaAutos.peek();
            System.out.println("Rotando llantas del auto con ID: " + auto.getId());
            // Aquí va la lógica para la rotación de llantas
        } else {
            System.out.println("No hay autos en la cola.");
        }
    }

    @Override
    public void cambioFiltroPolvoPolen() {
        if (!colaAutos.isEmpty()) {
            Automovil auto = colaAutos.peek();
            System.out.println("Cambiando filtro de polvo/polen al auto con ID: " + auto.getId());
            // Aquí va la lógica para cambiar el filtro de polvo/polen
        } else {
            System.out.println("No hay autos en la cola.");
        }
    }

    public void realizarServicios() {
        while (!colaAutos.isEmpty()) {
            Automovil auto = colaAutos.poll();
            System.out.println("Realizando servicios al auto con ID: " + auto.getId());
            cambioAceite();
            inspeccionSeguridad();
            rellenoNiveles();
            liquidoLimpiaparabrisas();
            diagnosticoComputadora();
            rotacionLlantas();
            cambioFiltroPolvoPolen();
            taller.getAutosEnTaller().remove(auto.getId());
            System.out.println("Servicios completados. El auto con ID: " + auto.getId() + " ha sido removido del taller.");
        }
    }
}
    class Main {
 public static void main(String[] args) {
    Administracion admin = new Administracion();
    admin.cargarDatos();

    Taller taller = new Taller();
    taller.recibirAutos(admin.autos);

    TallerAuto tallerAuto = new TallerAuto(taller);
    tallerAuto.recibirAutos();
    tallerAuto.realizarServicios();
}


}
