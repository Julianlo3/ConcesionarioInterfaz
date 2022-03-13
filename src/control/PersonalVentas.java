package control;

public class PersonalVentas {

    private String nombrePersonal;
    private int cantidadVentas;
    private double netoAcumulado;

    public PersonalVentas() {
    }

    public PersonalVentas(String nombrePersonal, int cantidadVentas, double netoAcumulado) {
        this.nombrePersonal = nombrePersonal;
        this.cantidadVentas = cantidadVentas;
        this.netoAcumulado = netoAcumulado;
    }

    public String getNombrePersonal() {
        return nombrePersonal;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public double getNetoAcumulado() {
        return netoAcumulado;
    }

    public void setNombrePersonal(String nombrePersonal) {
        this.nombrePersonal = nombrePersonal;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    public void setNetoAcumulado(double netoAcumulado) {
        this.netoAcumulado = netoAcumulado;
    }

   

}
