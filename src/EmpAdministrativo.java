public class EmpAdministrativo extends Empresa{
    private double bonificacion;

    public EmpAdministrativo() {
    }

    public EmpAdministrativo(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public EmpAdministrativo(String nombre, int edad, double salarioBase, double bonificacion) {
        super(nombre, edad, salarioBase);
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
        return super.toString()+"EmpAdministrativo{" +
                "bonificacion=" + bonificacion +
                '}';
    }

    public String mostrarInfo() {
        return "Empleados Administrativos: \n"+"nombre: " + nombre +"\n"+ "Edad: " + edad +"\n" + "salarioBase: " + salarioBase+"\n"+ "Bonificación: "+bonificacion+"\n";
    }
    public double calcularSalario(){
        double v1=salarioBase+bonificacion;
        return v1;
    }

}
