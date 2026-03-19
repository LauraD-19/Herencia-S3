public class EmpVentas extends Empresa{
    private double totalVentas;
    private double procentajeComision;

    public EmpVentas() {
    }

    public EmpVentas(double totalVentas, double procentajeComision) {
        this.totalVentas = totalVentas;
        this.procentajeComision = procentajeComision;
    }

    public EmpVentas(String nombre, int edad,int id, double salarioBase, double totalVentas, double procentajeComision) {
        super(nombre, id,  edad, salarioBase);
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
        return super.toString()+", \uD83C\uDF3Bempleado ventas\uD83C\uDF3B" +
                ", total ventas=" + totalVentas +
                ", procentaje comision=" + procentajeComision;
    }
    public String mostrarInfo() {
        return "--\uD83C\uDF3BVentas-"+"-Nombre: " + nombre +" --ID: "+id +" --Edad: " + edad +" --SalarioBase: " + salarioBase+" --Comision: "+procentajeComision+"%"+" --Total ventas: "+totalVentas+"\n";
    }
    public double calcularComision(){
        double v1=totalVentas*procentajeComision;
        return v1;
    }

    @Override
    public double calcularSalario(){
        double v2=salarioBase*calcularComision();
        return v2;
    }

}
