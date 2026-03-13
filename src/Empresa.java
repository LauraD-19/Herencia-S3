public class Empresa {
    protected String nombre;
    protected int edad;
    protected double salarioBase;

    public Empresa() {
    }

    public Empresa(String nombre, int edad, double salarioBase) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salarioBase=" + salarioBase +
                '}';
    }

    public String mostrarInfo() {
        return  "nombre: " + nombre +"\n"+ "Edad: " + edad +"\n" + "salarioBase: " + salarioBase+"\n";
    }
    public double calcularSalario(){

        return calcularSalario();
    }
    public int verificarEdad(){

        return verificarEdad();
    }
}
