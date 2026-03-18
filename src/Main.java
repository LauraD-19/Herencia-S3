import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        List<Empresa> EmpresaList = new ArrayList<>();
        int op;
        String buscar;

        System.out.println("Bienvenido a Mielex \uD83D\uDC1D");

        do {
            System.out.println("\n\uD83D\uDC1DPor favor eliga una de las siguientes opciones\uD83D\uDC1D:");
            System.out.println(" 1. Agregar un empleado administrativo \n 2. Agregar un empleado de ventas \n 3. Agregar un empleado por horas \n 4. Mostrar todos los empleados \n 5. Buscar un empleado \n 6. Salir");
            op = teclado.nextInt();
            switch (op){
                case 1://administrativo
                    EmpleadoAD (teclado, EmpresaList);
                    break;
                case 2://Ventas
                    EmpleadoVE (teclado, EmpresaList);
                    break;
                case 3://Horas
                    EmpleadoHO (teclado, EmpresaList);
                    break;
                case 4://Mostrar empleados
                    System.out.println("Empleados: \n");
                    for (Empresa E : EmpresaList) {
                        System.out.println(E.mostrarInfo());
                    }
                    break;
                case 5://buscar empleado por nombre
                    System.out.println("Escriba el nombre del empleado: ");
                    teclado.nextLine();
                    buscar = teclado.nextLine();
                    boolean encontrado=false;
                    for (Empresa E : EmpresaList) {
                        if (buscar.equalsIgnoreCase(E.getNombre())) {
                            System.out.println(E);
                            encontrado=true;
                            break;
                        }
                    }
                    if(!encontrado){
                        System.out.println("El empleado no se encuentra registrado o esta mal escrito \nPor favor intentelo de nuevo");

                    }
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    System.out.println("Que tenga buen día ʕ•́ᴥ•̀ʔっ ...");
                    break;

                default:
                    System.out.println("Ingrese una opcion correcta (ㆆ_ㆆ)");

            }
        }while (op!=6);


    }

    private static void EmpleadoAD(Scanner teclado, List<Empresa> EmpresaList) {
        teclado.nextLine();
        System.out.println("Nombre del empleado:");
        String nombre = teclado.nextLine();
        System.out.println("Edad del empleado:");
        int edad = teclado.nextInt();
        System.out.println("Salario base:");
        double salarioBase= teclado.nextDouble();
        System.out.println("Bonificacion:");
        double bonificacion= teclado.nextDouble();

        EmpAdministrativo empleadosA= new EmpAdministrativo(nombre, edad, salarioBase, bonificacion);
        EmpresaList.add(empleadosA);
        System.out.println("\n--Empleado registrado...\uD83C\uDF6F");
    }
    private static void EmpleadoVE(Scanner teclado, List<Empresa> EmpresaList) {
        teclado.nextLine();
        System.out.println("Nombre del empleado:");
        String nombre = teclado.nextLine();
        System.out.println("Edad del empleado:");
        int edad = teclado.nextInt();
        System.out.println("Salario base:");
        double salarioBase= teclado.nextDouble();
        System.out.println("Total ventas:");
        double totalVentas= teclado.nextDouble();
        System.out.println("Porcentaje comisiones:");
        double porcentajeComisiones= teclado.nextDouble();

        EmpVentas empleadosV= new EmpVentas(nombre, edad, salarioBase, totalVentas, porcentajeComisiones );
        EmpresaList.add(empleadosV);
        System.out.println("\n--Empleado registrado...\uD83C\uDF3B");
    }
    private static void EmpleadoHO(Scanner teclado, List<Empresa> EmpresaList) {
        teclado.nextLine();
        System.out.println("Nombre del empleado:");
        String nombre = teclado.nextLine();
        System.out.println("Edad del empleado:");
        int edad = teclado.nextInt();
        System.out.println("Salario base:");
        double salarioBase= teclado.nextDouble();
        System.out.println("Horas trabajadas:");
        int horasTrabajadas= teclado.nextInt();
        System.out.println("Valor horas:");
        double valorHoras= teclado.nextDouble();

        EmpHoras empleados= new EmpHoras(nombre, edad, salarioBase, horasTrabajadas, valorHoras);
        EmpresaList.add(empleados);
        System.out.println("\n--Empleado registrado...☀\uFE0F");
    }
}