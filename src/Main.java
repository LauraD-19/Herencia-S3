import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        List<Empresa> EmpresaList = new ArrayList<>();
        int op;
        int op2;
        int op3;
        int buscar;

        System.out.println("Bienvenido a Mielex \uD83D\uDC1D");

        do {
            System.out.println("\n\uD83D\uDC1DPor favor eliga una de las siguientes opciones\uD83D\uDC1D:");
            System.out.println(" 1. Agregar un empleado administrativo \n 2. Agregar un empleado de ventas \n 3. Agregar un empleado por horas \n 4. Mostrar todos los empleados \n 5. Buscar un empleado \n 6. Calular salario\n 7. Aumentar salario \n 8. Mostrar empleados mayores de edad \n 9. Salir");
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
                case 5://buscar empleado por cedula
                    System.out.println("Escriba el ID del empleado (sin comas, puntos o espacios): ");
                    buscar = teclado.nextInt();
                    boolean encontrado=false;
                    for (Empresa E : EmpresaList) {
                        if (E.getId() == buscar) {
                            System.out.println(E);
                            encontrado=true;
                            break;
                        }
                    }
                    if(!encontrado){
                        System.out.println("El empleado no se encuentra registrado o esta mal escrito \nPor favor intentelo de nuevo");
                    }
                    break;

                case 6://calcular salario
                    System.out.println("Que tipo de empleado quiere calcular el salario: Ingrese:\n1. Administrativo \n2. Ventas \n3.Por horas");
                    op2= teclado.nextInt();
                    switch (op2){
                        case 1:
                            System.out.println("Escriba el ID del empleado (sin comas, puntos o espacios): ");
                            buscar = teclado.nextInt();
                            boolean encontrado2=false;
                            for (Empresa E : EmpresaList) {
                                if (E.getId() == buscar) {
                                    System.out.println(E);
                                    encontrado2=true;
                                    E.calcularSalario();
                                    break;
                                }
                            }
                            if(!encontrado2){
                                System.out.println("El empleado no se encuentra registrado o esta mal escrito \nPor favor intentelo de nuevo");
                            }
                            break;
                            
                        case 2:
                            System.out.println("Que tipo de empleado quiere calcular el salario: Ingrese:\n1. Administrativo \n2. Ventas \n3.Por horas");
                            op2= teclado.nextInt();
                            switch (op2){
                                case 1:
                                    System.out.println("Escriba el ID del empleado (sin comas, puntos o espacios): ");
                                    buscar = teclado.nextInt();
                                    boolean encontrado3=false;
                                    for (Empresa E : EmpresaList) {
                                        if (E.getId() == buscar) {
                                            System.out.println(E);
                                            encontrado3=true;
                                            E.calcularSalario();
                                            break;
                                        }
                                    }
                                    if(!encontrado3){
                                        System.out.println("El empleado no se encuentra registrado o esta mal escrito \nPor favor intentelo de nuevo");
                                    }
                                    break;
                            
                        case 3:
                            System.out.println("Que tipo de empleado quiere calcular el salario: Ingrese:\n1. Administrativo \n2. Ventas \n3.Por horas");
                            op2= teclado.nextInt();
                            switch (op2){
                                case 1:
                                    System.out.println("Escriba el ID del empleado (sin comas, puntos o espacios): ");
                                    buscar = teclado.nextInt();
                                    boolean encontrado4=false;
                                    for (Empresa E : EmpresaList) {
                                        if (E.getId() == buscar) {
                                            System.out.println(E);
                                            encontrado4=true;
                                            E.calcularSalario();
                                            break;
                                        }
                                    }
                                    if(!encontrado4){
                                        System.out.println("El empleado no se encuentra registrado o esta mal escrito \nPor favor intentelo de nuevo");
                                    }
                                    break;
                            
                        default:
                            System.out.println("Ingrese una opcion correcta (ㆆ_ㆆ)");
                    }
                case 7://aumentar salario

                    
                case 8://empleados mayores
                    
                case 9:
                    System.out.println("Saliendo...");
                    System.out.println("Que tenga buen día ʕ•́ᴥ•̀ʔっ ...");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta (ㆆ_ㆆ)");

            }
        }while (op!=9);


    }

    private static void EmpleadoAD(Scanner teclado, List<Empresa> EmpresaList) {
        teclado.nextLine();
        System.out.println("Nombre del empleado:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el ID del empleado (sin comas, puntos o espacios): ");
        int id= teclado.nextInt();
        System.out.println("Edad del empleado:");
        int edad = teclado.nextInt();
        System.out.println("Salario base:");
        double salarioBase= teclado.nextDouble();
        System.out.println("Bonificacion:");
        double bonificacion= teclado.nextDouble();

        EmpAdministrativo empleadosA= new EmpAdministrativo(nombre, id, edad, salarioBase, bonificacion);
        EmpresaList.add(empleadosA);
        System.out.println("\n--Empleado registrado...\uD83C\uDF6F");
    }
    private static void EmpleadoVE(Scanner teclado, List<Empresa> EmpresaList) {
        teclado.nextLine();
        System.out.println("Nombre del empleado:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el ID del empleado (sin comas, puntos o espacios): ");
        int id= teclado.nextInt();
        System.out.println("Edad del empleado:");
        int edad = teclado.nextInt();
        System.out.println("Salario base:");
        double salarioBase= teclado.nextDouble();
        System.out.println("Total ventas:");
        double totalVentas= teclado.nextDouble();
        System.out.println("Porcentaje comisiones:");
        double porcentajeComisiones= teclado.nextDouble();

        EmpVentas empleadosV= new EmpVentas(nombre, id, edad, salarioBase, totalVentas, porcentajeComisiones );
        EmpresaList.add(empleadosV);
        System.out.println("\n--Empleado registrado...\uD83C\uDF3B");
    }
    private static void EmpleadoHO(Scanner teclado, List<Empresa> EmpresaList) {
        teclado.nextLine();
        System.out.println("Nombre del empleado:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el ID del empleado (sin comas, puntos o espacios): ");
        int id= teclado.nextInt();
        System.out.println("Edad del empleado:");
        int edad = teclado.nextInt();
        System.out.println("Salario base:");
        double salarioBase= teclado.nextDouble();
        System.out.println("Horas trabajadas:");
        int horasTrabajadas= teclado.nextInt();
        System.out.println("Valor horas:");
        double valorHoras= teclado.nextDouble();

        EmpHoras empleados= new EmpHoras(nombre, id, edad, salarioBase, horasTrabajadas, valorHoras);
        EmpresaList.add(empleados);
        System.out.println("\n--Empleado registrado...☀\uFE0F");
    }
}