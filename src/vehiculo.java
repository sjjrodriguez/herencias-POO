public class vehiculo {
    protected String marca;
    protected String modelo;
    protected double precio;
    protected  int ano;


    public vehiculo() {
    }

    public vehiculo(String marca, String modelo, double precio, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", ano=" + ano +
                '}';
    }
    public void precio_final(){
        double iva =(precio*21)/100;
        double precio_final=precio+iva;
        System.out.println("el precio final de su vehiculo  es " +precio_final + " IVA 21%");
    }
}
