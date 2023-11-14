

package Disenio;
import java.io.Serializable;
class Vehiculo implements Serializable{
    private int id;
    private Color color;
    private boolean mantenimiento;
    private int kilometraje;
    private boolean estado;
    private  double precio;
    public Vehiculo() {
    }

    public Vehiculo(int id, Color color, boolean mantenimiento, int kilometraje, boolean estado, double precio) {
        this.id = id;
        this.color = color;
        this.mantenimiento = mantenimiento;
        this.kilometraje = kilometraje;
        this.estado = estado;
        this.precio = precio;
    }
    
    
  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(boolean mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    @Override
    public String toString() {
        return "Vehiculo{" + "id=" + id + ", color=" + color + ", mantenimiento=" + mantenimiento + ", kilometraje=" + kilometraje + ", estado=" + estado + '}';
    }

    
}
