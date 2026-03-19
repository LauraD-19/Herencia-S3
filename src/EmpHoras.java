public class EmpHoras extends Empresa{
    private int horasTrabajadas;
    private double valorHoras;

    public EmpHoras() {
    }

    public EmpHoras(int horasTrabajadas, double valorHoras) {
        this.horasTrabajadas = horasTrabajadas;
        this.valorHoras = valorHoras;
    }

    public EmpHoras(String nombre, int edad, int id, double salarioBase, int horasTrabajadas, double valorHoras) {
        super(nombre,id, edad, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHoras = valorHoras;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(double valorHoras) {
        this.valorHoras = valorHoras;
    }

    @Override
    public String toString() {
        return super.toString()+", ☀\uFE0Fempleado por horas☀\uFE0F" +
                ", horas trabajadas=" + horasTrabajadas +
                ", valor horas=" + valorHoras;
    }
    public String mostrarInfo() {
        return "--☀\uFE0FPor horas-"+"-Nombre: " + nombre +" --ID: "+id +" --Edad: " + edad +" --SalarioBase: " + salarioBase+" --Horas trabajadas: "+horasTrabajadas+" --Valor horas: "+valorHoras+"\n";
    }

    public double calcularSalario(){

        double h3=horasTrabajadas*valorHoras;
        return h3;
    }
}
