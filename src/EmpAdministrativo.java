public class EmpAdministrativo extends Empresa{
    private double bonificacion;

    public EmpAdministrativo() {
    }

    public EmpAdministrativo(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public EmpAdministrativo(String nombre,int id, int edad, double salarioBase, double bonificacion) {
        super(nombre, id, edad, salarioBase);
        this.bonificacion = bonificacion;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public String toString() {
        return super.toString()+", \uD83C\uDF6Fempleado administrativo\uD83C\uDF6F" +
                ", bonificacion=" + bonificacion;
    }

    public String mostrarInfo() {
        return "--\uD83C\uDF6FAdministrativos-"+"-Nombre: " + nombre +" --ID: "+id +" --Edad: " + edad +" --SalarioBase: " + salarioBase+" --Bonificación: "+bonificacion+"\n";
    }

    @Override
    public double calcularSalario(){
        double v1=salarioBase+bonificacion;
        return v1;
    }

}
