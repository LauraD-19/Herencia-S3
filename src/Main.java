import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Empresa> EmpresaList = new ArrayList<>();
        int op;
        int op2;
        int op3;
        int buscar;

        System.out.println("Bienvenido a Mielex \uD83D\uDC1D");
        do{
            System.out.println("\n\uD83D\uDC1DPor favor eliga una de las siguientes opciones\uD83D\uDC1D:");
            System.out.println(" 1. Agregar un empleado administrativo \n 2. Agregar un empleado de ventas \n 3. Agregar un empleado por horas \n 4. Mostrar empleados \n 5. Buscar un empleado \n 6. Calular salario\n 7. Aumentar salario \n 8. Mostrar empleados mayores de edad \n 9. Salir");
            op = teclado.nextInt();
            switch (op){
                case 1://administrativo
                    EmpleadoAD(teclado, EmpresaList);
                    break;

                case 2://ventas
                    EmpleadoVE(teclado, EmpresaList);
                    break;

                case 3://horas
                    EmpleadoHO(teclado, EmpresaList);
                    break;

                case 4://mostrar empleados
                    System.out.println("Digite \n1. Para ver la lista de Administrativos \n2. Para la lista de ventas \n3. Para empleados por horas \n4. Para ver todos los empleados");
                    op3= teclado.nextInt();
                    switch (op3){
                        case 1://ad
                            System.out.println("\uD83C\uDF6FEmpleados administrativos: \n");
                            for(Empresa E:EmpresaList){
                                if(E instanceof EmpAdministrativo){
                                    System.out.println(E.mostrarInfo());
                                }
                            }
                            break;

                        case 2://ve
                            System.out.println("\uD83C\uDF3BEmpleados de ventas: \n");
                            for(Empresa E:EmpresaList){
                                if(E instanceof EmpVentas){
                                    System.out.println(E.mostrarInfo());
                                }
                            }
                            break;

                        case 3://ho
                            System.out.println("☀\uFE0FEmpleados por horas: \n");
                            for(Empresa E:EmpresaList){
                                if(E instanceof EmpHoras){
                                    System.out.println(E.mostrarInfo());
                                }
                            }
                            break;

                        case 4://todos
                            System.out.println("Empleados: \n");
                            for (Empresa E : EmpresaList) {
                                System.out.println(E.mostrarInfo());
                            }
                            break;

                        default:
                            System.out.println("Ingrese una opcion correcta (ㆆ_ㆆ)");
                    }
                    break;

                case 5://buscar
                    System.out.println("Escriba el ID del empleado (sin comas, puntos o espacios): ");
                    buscar = teclado.nextInt();
                    boolean encontrado = false;
                    for (Empresa E : EmpresaList) {
                        if (E.getId() == buscar) {
                            System.out.println(E);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("El empleado no se encuentra registrado o esta mal escrito \nPor favor intentelo de nuevo");
                    }
                    break;

                case 6://calcular salario
                    System.out.println("Escriba el ID del empleado (sin comas, puntos o espacios): ");
                    buscar = teclado.nextInt();
                    boolean encontrado2 = false;
                    for (Empresa E : EmpresaList) {
                        if (E.getId() == buscar) {
                            System.out.println(E.mostrarInfo());
                            System.out.println("--Salario: "+E.calcularSalario());
                            encontrado2 = true;
                            break;
                        }
                    }
                    if (!encontrado2) {
                        System.out.println("El empleado no se encuentra registrado o esta mal escrito \nPor favor intentelo de nuevo");
                    }
                    break;

                case 7://aumentar salario
                    System.out.println("Escriba el ID del empleado (sin comas, puntos o espacios): ");
                    buscar = teclado.nextInt();
                    boolean encontrado5 = false;
                    for (Empresa E : EmpresaList) {
                        if (E.getId() == buscar) {
                            System.out.println("Cuanto desea aumnetar?");
                            double aumento = teclado.nextDouble();
                            E.aumentarSalario(aumento);
                            System.out.println("--El salario a sido modificado exitosamente \n "+E.mostrarInfo());
                            encontrado5 = true;
                            break;
                        }
                    }
                    if (!encontrado5) {
                        System.out.println("El empleado no se encuentra registrado o esta mal escrito \nPor favor intentelo de nuevo");
                    }
                    break;


                case 8://mayores de edad
                    System.out.println("--Empleados mayores de edad: ");
                    for(Empresa Em: EmpresaList){
                        if(Em.verificarEdad()){
                            System.out.println("--"+Em.getNombre()+ " es mayor de edad \n");
                        }
                    }
                    break;

                case 9://salir
                    System.out.println("Saliendo...");
                    System.out.println("Que tenga buen día ʕ•́ᴥ•̀ʔっ ...");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta (ㆆ_ㆆ)");
            }

        }while (op != 9);
    }
    private static void EmpleadoAD(Scanner teclado, List<Empresa> EmpresaList) {
        teclado.nextLine();
        System.out.println("Nombre del empleado:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el ID del empleado (sin comas, puntos o espacios): ");
        int id = teclado.nextInt();
        System.out.println("Edad del empleado:");
        int edad = teclado.nextInt();
        System.out.println("Salario base:");
        double salarioBase = teclado.nextDouble();
        System.out.println("Bonificacion:");
        double bonificacion = teclado.nextDouble();

        EmpAdministrativo empleadosA = new EmpAdministrativo(nombre, id, edad, salarioBase, bonificacion);
        EmpresaList.add(empleadosA);
        System.out.println("\n--Empleado registrado...\uD83C\uDF6F");
    }

    private static void EmpleadoVE(Scanner teclado, List<Empresa> EmpresaList) {
        teclado.nextLine();
        System.out.println("Nombre del empleado:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el ID del empleado (sin comas, puntos o espacios): ");
        int id = teclado.nextInt();
        System.out.println("Edad del empleado:");
        int edad = teclado.nextInt();
        System.out.println("Salario base:");
        double salarioBase = teclado.nextDouble();
        System.out.println("Total ventas:");
        double totalVentas = teclado.nextDouble();
        System.out.println("Porcentaje comisiones:");
        double porcentajeComisiones = teclado.nextDouble();

        EmpVentas empleadosV = new EmpVentas(nombre, id, edad, salarioBase, totalVentas, porcentajeComisiones);
        EmpresaList.add(empleadosV);
        System.out.println("\n--Empleado registrado...\uD83C\uDF3B");
    }

    private static void EmpleadoHO(Scanner teclado, List<Empresa> EmpresaList) {
        teclado.nextLine();
        System.out.println("Nombre del empleado:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el ID del empleado (sin comas, puntos o espacios): ");
        int id = teclado.nextInt();
        System.out.println("Edad del empleado:");
        int edad = teclado.nextInt();
        System.out.println("Salario base:");
        double salarioBase = teclado.nextDouble();
        System.out.println("Horas trabajadas:");
        int horasTrabajadas = teclado.nextInt();
        System.out.println("Valor horas:");
        double valorHoras = teclado.nextDouble();

        EmpHoras empleados = new EmpHoras(nombre, id, edad, salarioBase, horasTrabajadas, valorHoras);
        EmpresaList.add(empleados);
        System.out.println("\n--Empleado registrado...☀\uFE0F");
    }
}
