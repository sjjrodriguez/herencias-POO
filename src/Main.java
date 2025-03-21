//soy el numero 2
import javax.swing.text.html.ListView;
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op;
        boolean estado = true;

        List<vehiculo> listVehiculos = new ArrayList<>();
        do {
            System.out.println("""
                    1. crear auto
                    2. crear motocicleta
                    3.mostrar lista
                    
                    
                    
                    """);
            System.out.println("ingrese una opcion");
            op = teclado.nextInt();
            teclado.nextLine();
            switch (op) {
                case 1 -> {
                    System.out.println("ingrese la marca del auto");
                    String marca = teclado.nextLine();

                    System.out.println("ingrese el modelo del auto");
                    String modelo = teclado.nextLine();

                    System.out.println("ingrese el precio del auto");
                    double precio = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("ingrese el año del auto");
                    int ano = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("ingrese el N_de puertas");
                    String n_puertas = teclado.nextLine();


                    listVehiculos.add(new auto(marca, modelo, precio, ano, n_puertas));


                }
                case 2 -> {

                    System.out.println("ingrese la marca de la motocicleta");
                    String marca = teclado.nextLine();

                    System.out.println("ingrese el modelo de la motocicleta");
                    String modelo = teclado.nextLine();

                    System.out.println("ingrese el precio de la motocicleta");
                    double precio = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("ingrese el año de la motocicleta");
                    int ano = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("ingrese el N_de cilindraje");
                    int cilindrado = teclado.nextInt();


                    listVehiculos.add(new motocicletas(marca, modelo, precio, ano, cilindrado));
                }
                case 3 -> {
                    for (vehiculo cu : listVehiculos) {
                        System.out.println(cu);
                        cu.precio_final();

                    }

                }

            }

        }while (estado) ;
    }
}
