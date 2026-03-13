public class EmpVentas extends Empresa{
    private double totalVentas;
    private double procentajeComision;

    public EmpVentas() {
    }

    public EmpVentas(double totalVentas, double procentajeComision) {
        this.totalVentas = totalVentas;
        this.procentajeComision = procentajeComision;
    }

    public EmpVentas(String nombre, int edad, double salarioBase, double totalVentas, double procentajeComision) {
        super(nombre, edad, salarioBase);
        this.totalVentas = totalVentas;
        this.procentajeComision = procentajeComision;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public double getProcentajeComision() {
        return procentajeComision;
    }

    public void setProcentajeComision(double procentajeComision) {
        this.procentajeComision = procentajeComision;
    }

    @Override
    public String toString() {
        return super.toString()+"EmpVentas{" +
                "totalVentas=" + totalVentas +
                ", procentajeComision=" + procentajeComision +
                '}';
    }
    public String mostrarInfo() {
        return "nombre: " + nombre +"\n"+ "Edad: " + edad +"\n" + "salarioBase: " + salarioBase+"\n"+ "Comision (%): "+procentajeComision+"\n"+"Total ventas: "+totalVentas+"\n";
    }
    public double calcularComision(){
        double v1=totalVentas*procentajeComision;
        return v1;
    }
    public double calcularSalario(){
        double v2=salarioBase*calcularComision();
        return v2;
    }

}
