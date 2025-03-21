public class motocicletas extends vehiculo {
    private int cilindrado;

    public motocicletas(String marca, String modelo, double precio, int ano, int cilindrado) {
        super(marca, modelo, precio, ano);
        this.cilindrado = cilindrado;
    }

    public int getCilindrado() {
        return cilindrado;
    }

    public void setCilindrado(int cilindrado) {
        this.cilindrado = cilindrado;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "cilindrado=" + cilindrado +
                '}';
    }
    public void mostrar_motocicletas(){
        System.out.println("la marca de la motocicleta es "+marca);
        System.out.println("el modelo de la motocicleta es "+modelo);
        System.out.println("el año de la motocicleta es "+ano);
        System.out.println("el precio base de la moto  es"+precio);
        System.out.println("el cilindrado de la moto es"+cilindrado);
    }
}
