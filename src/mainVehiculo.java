import java.util.Scanner;

public class mainVehiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la placa del vehiculo:");
        String placa = sc.nextLine();

        System.out.println("Ingrese la marca del vehiculo:");
        String marca = sc.nextLine();

        System.out.println("Ingrese la anio del vehiculo:");
        int anio = sc.nextInt();

        System.out.println("Ingrese la propietario del vehiculo:");
        String propietario = sc.nextLine();


        Moto m1 = new Moto(placa, marca, anio, propietario);
        Auto a1 = new Auto(placa, marca, anio, propietario);
        Camion c1 = new Camion(placa, marca, anio, propietario);

        System.out.println("Calculo de matricula en auto\n");
        System.out.println(a1.calcularValorMatricula());

        System.out.println("Calculo de matricula en moto\n");
        System.out.println(m1.calcularValorMatricula());

        System.out.println("Calculo de matricula en camion\n");
        System.out.println(c1.calcularValorMatricula());
    }
}
