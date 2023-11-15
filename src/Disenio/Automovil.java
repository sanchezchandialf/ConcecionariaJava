
package Disenio;


public class Automovil extends Vehiculo{
  private MarcasAuto marca;
  private CarroceriaAuto carroceria;
  private double motor;
  private static final long serialVersionUID = 1987670492596060694L; 


    public Automovil() {
    }

    public Automovil(MarcasAuto marca, CarroceriaAuto carroceria, double motor, int id, Color color, boolean mantenimiento, int kilometraje, boolean estado, double precio) {
        super(id, color, mantenimiento, kilometraje, estado, precio);
        this.marca = marca;
        this.carroceria = carroceria;
        this.motor = motor;
    }
    
    public MarcasAuto getMarca() {
        return marca;
    }

    public void setMarca(MarcasAuto marca) {
        this.marca = marca;
    }

    public CarroceriaAuto getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(CarroceriaAuto carroceria) {
        this.carroceria = carroceria;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }
    public void actualizarEstadoMantenimiento(boolean estado) {
        this.setMantenimiento(estado);
    }
    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", carroceria=" + carroceria + ", motor=" + motor + '}';
    }
    
    
}
