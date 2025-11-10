abstract class Vehiculo {
    private String placa;
    private String marca;
    private int anio;
    private String propietario;

    public Vehiculo(String placa, String marca, int anio, String propietario) {
        this.placa = placa;
        this.marca = marca;
        this.anio = anio;
        this.propietario = propietario;
    }

    // GETTERS Y SETTERS

    public void setPlaca(String p) {
        placa = p;
    }

    public String getPlaca() {
        return placa;
    }

    public void setMarca(String m) {
        marca = m;
    }

    public String getMarca() {
        return marca;
    }
    public void setAnio(int a) {
        anio = a;
    }
    public int getAnio() {
        return anio;
    }
    public void setPropietario(String pr) {
        propietario = pr;
    }

    public String getPropietario() {
        return propietario;
    }


    public abstract double calcularValorMatricula();


}


class Auto extends Vehiculo{

    public Auto(String placa, String marca, int anio, String propietario) {
        super(placa, marca, anio, propietario);
    }
    @Override
    public double calcularValorMatricula(){
        int anio = getAnio();
        double anio1 = anio;
        return anio1 * 500;
    }
}

class Moto extends Vehiculo{
    public Moto(String placa, String marca, int anio, String propietario) {
        super(placa, marca, anio, propietario);
    }

    @Override
    public double calcularValorMatricula(){
        int anio= getAnio();
        double anio1 = anio;
        return  anio1 * 100;
    }
}

class Camion extends Vehiculo{

    public Camion(String placa, String marca, int anio, String propietario) {
        super(placa, marca, anio, propietario);
    }

    @Override
    public double calcularValorMatricula(){
        int anio= getAnio();
        double anio1 = anio;
        return  anio1 * 0.5;
    }
}
