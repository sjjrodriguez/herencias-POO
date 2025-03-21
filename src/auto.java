public class auto extends vehiculo{
    private String n_puertas;

    public auto(String marca, String modelo, double precio, int ano, String n_puertas) {
        super(marca, modelo, precio, ano);
        this.n_puertas = n_puertas;
    }

    public String getN_puertas() {
        return n_puertas;
    }

    public void setN_puertas(String n_puertas) {
        this.n_puertas = n_puertas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "n_puertas='" + n_puertas + '\'' +
                '}';
    }
    public void mostrar_autos(){
        System.out.println("la marca del vehiculo es "+marca);
        System.out.println("el modelo del auto es "+modelo);
        System.out.println("el año del auto es "+ano);
        System.out.println("el precio base del vehiculo es"+precio);
        System.out.println("numero de puertas"+n_puertas);
    }
}
