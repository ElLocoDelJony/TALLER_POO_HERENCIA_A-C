import java.util.Scanner;

public class mainVehiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Moto m1 = new Moto("A001","TOYOTA",2025,"KEVIN");
        Auto a1 = new Auto("AB02","CHEVROLET",2012,"MICHAEL");
        Camion c1 = new Camion("ACC0","MAZDA",2002,"KEVIN");

        System.out.println("Calculo de matricula en auto\n");
        System.out.println(a1.calcularValorMatricula());

        System.out.println("Calculo de matricula en moto\n");
        System.out.println(m1.calcularValorMatricula());

        System.out.println("Calculo de matricula en camion\n");
        System.out.println(c1.calcularValorMatricula());
    }
}
