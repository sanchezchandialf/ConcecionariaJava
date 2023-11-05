/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseño;


public class Automovil extends Vehiculo{
  private MarcasAuto marca;
  private CarroceriaAuto carroceria;
  private double motor;

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

    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", carroceria=" + carroceria + ", motor=" + motor + '}';
    }
    
    
}
