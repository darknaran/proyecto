import java.util.Scanner;
public class ventas{
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        panaderia mipan = new panaderia("123456","pangasa");
        String identificacion, nombre;
        double ventauno,ventados,ventatres, ventacuatro, ventacinco, ventaseis,ventasiete;
        double promedio = 0;
        int opcionMenu = 0;
        
        do{
            System.out.println("\nMenu de Opciones");
            System.out.println("[1]- Adicionar pan normal : ");
            System.out.println("[2]- Adicionar pan dulce: ");
            System.out.println("[3]- Adicionar pan grande: ");
            System.out.println("[4]- Calcular Promedio ");
            System.out.println("[5]- Salir \n");
            System.out.println("Escoja una Opcion: ");
            opcionMenu = sc.nextInt();
            switch(opcionMenu){
                case 1:
                        sc.nextLine();
                        System.out.println("Digite el codigo del pan: ");
                        identificacion = sc.next();
                        System.out.println("Digite el nombre del pan: ");
                        nombre = sc.next();
                        System.out.println("Digite las ventas del dia lunes: ");
                        ventauno = sc.nextDouble();
                        System.out.println("Digite las ventas del dia martes: ");
                        ventados = sc.nextDouble();
                        System.out.println("Digite las ventas del dia miercoles: ");
                        ventatres = sc.nextDouble();
                        System.out.println("Digite las ventas del dia jueves: ");
                        ventacuatro = sc.nextDouble();
                        System.out.println("Digite las ventas del dia viernes: ");
                        ventacinco = sc.nextDouble();
                        System.out.println("Digite las ventas del dia sabado: ");
                        ventaseis = sc.nextDouble();
                        System.out.println("Digite las ventas del dia domingo: ");
                        ventasiete = sc.nextDouble();
                        try{
                            mipan.adicionarpan(identificacion, nombre,ventauno,ventados,ventatres,ventacuatro,ventacinco,ventaseis,ventasiete);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********");
                        break;
                case 2:
                        sc.nextLine();
                        System.out.println("Digite el codigo del pan: ");
                        identificacion = sc.next();
                        System.out.println("Digite el nombre del pan: ");
                        nombre = sc.next();
                        System.out.println("Digite las ventas del dia lunes: ");
                        ventauno = sc.nextDouble();
                        System.out.println("Digite las ventas del dia martes: ");
                        ventados = sc.nextDouble();
                        System.out.println("Digite las ventas del dia miercoles: ");
                        ventatres = sc.nextDouble();
                        System.out.println("Digite las ventas del dia jueves: ");
                        ventacuatro = sc.nextDouble();
                        System.out.println("Digite las ventas del dia viernes: ");
                        ventacinco = sc.nextDouble();
                        System.out.println("Digite las ventas del dia sabado: ");
                        ventaseis = sc.nextDouble();
                        System.out.println("Digite las ventas del dia domingo: ");
                        ventasiete = sc.nextDouble();
                        try{
                            mipan.adicionapan(identificacion, nombre,ventauno,ventados,ventatres,ventacuatro,ventacinco,ventaseis,ventasiete);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********");
                        break;
                case 3:
                        sc.nextLine();
                        System.out.println("Digite el codigo del pan: ");
                        identificacion = sc.next();
                        System.out.println("Digite el nombre del pan: ");
                        nombre = sc.next();
                        System.out.println("Digite las ventas del dia lunes: ");
                        ventauno = sc.nextDouble();
                        System.out.println("Digite las ventas del dia martes: ");
                        ventados = sc.nextDouble();
                        System.out.println("Digite las ventas del dia miercoles: ");
                        ventatres = sc.nextDouble();
                        System.out.println("Digite las ventas del dia jueves: ");
                        ventacuatro = sc.nextDouble();
                        System.out.println("Digite las ventas del dia viernes: ");
                        ventacinco = sc.nextDouble();
                        System.out.println("Digite las ventas del dia sabado: ");
                        ventaseis = sc.nextDouble();
                        System.out.println("Digite las ventas del dia domingo: ");
                        ventasiete = sc.nextDouble();
                        try{
                            mipan.adicionarpa(identificacion, nombre,ventauno,ventados,ventatres,ventacuatro,ventacinco,ventaseis,ventasiete);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********");
                        break;
                case 4:
                        sc.nextLine();
                        promedio = mipan.calcularPromedioGeneral();
                        System.out.println("\n El promedio de notas es: " + promedio); 
                        break;
                default:
                        System.out.println("Ha Seleccionado Salir");
                        
            }
        }while(opcionMenu != 5);
    }
}
