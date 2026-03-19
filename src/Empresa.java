public class Empresa {
    protected String nombre;
    protected int id;
    protected int edad;
    protected double salarioBase;


    public Empresa() {
    }

    public Empresa(String nombre, int id, int edad, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre +
                ", ID="+ id+
                ", edad=" + edad +
                ", Salario base=" + salarioBase;
    }

    public String mostrarInfo() {
        return  "--Nombre: " + nombre +" --ID: "+id +" --Edad: " + edad +" --SalarioBase: " + salarioBase+"\n";
    }
    public double calcularSalario(){

        return calcularSalario();
    }
    public int verificarEdad(){

        return verificarEdad();
    }
}
