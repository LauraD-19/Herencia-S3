public class EmpHoras extends Empresa{
    private int horasTrabajadas;
    private double valorHoras;

    public EmpHoras() {
    }

    public EmpHoras(int horasTrabajadas, double valorHoras) {
        this.horasTrabajadas = horasTrabajadas;
        this.valorHoras = valorHoras;
    }

    public EmpHoras(String nombre, int edad, double salarioBase, int horasTrabajadas, double valorHoras) {
        super(nombre, edad, salarioBase);
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
        return super.toString()+"EmpHoras{" +
                "horasTrabajadas=" + horasTrabajadas +
                ", valorHoras=" + valorHoras +
                '}';
    }
    public String mostrarInfo() {
        return "nombre: " + nombre +"\n"+ "Edad: " + edad +"\n" + "salarioBase: " + salarioBase+"\n"+ "Horas trabajadas: "+horasTrabajadas+"\n"+"Valor horas: "+valorHoras+"\n";
    }

    public double calcularSalario(){

        double h3=horasTrabajadas*valorHoras;
        return h3;
    }
}
