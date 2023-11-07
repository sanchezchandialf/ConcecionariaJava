
package Diseño;


public class Motocicleta extends Vehiculo{
    private MarcasMoto marcasmoto;
    private int cilindrada;

    public Motocicleta() {}

    public Motocicleta(MarcasMoto marcasmoto, int cilindrada, int id, Color color, boolean mantenimiento, int kilometraje, boolean estado, double precio) {
        super(id, color, mantenimiento, kilometraje, estado, precio);
        this.marcasmoto = marcasmoto;
        this.cilindrada = cilindrada;
    }

    public MarcasMoto getMarcasmoto() {
        return marcasmoto;
    }

    public void setMarcasmoto(MarcasMoto marcasmoto) {
        this.marcasmoto = marcasmoto;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "marcasmoto=" + marcasmoto + ", cilindrada=" + cilindrada + '}';
    }

     

    
    
}
