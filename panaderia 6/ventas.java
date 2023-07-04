import java.util.Scanner;
public class ventas
{
     public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        panaderia mipanaderia = new panaderia("123456","Suba");
        String nombre;
        double promedio = 0;
        
        System.out.println("Digite el numero de panes normales : ");
        int numpan1 = sc.nextInt();
        for(int i = 0; i < numpan1; i++){
            double venta1, venta2,venta3,venta4,venta5,venta6,venta7;
            System.out.println("Digite el nombre del pan: ");
            nombre = sc.next();
            System.out.println("Digite las ventas del dia lunes: ");
            venta1 = sc.nextDouble();
            System.out.println("Digite las ventas del dia Martes: ");
            venta2 = sc.nextDouble();
            System.out.println("Digite las ventas del dia miercoles: ");
            venta3 = sc.nextDouble();
            System.out.println("Digite las ventas del dia jueves: ");
            venta4 = sc.nextDouble();
            System.out.println("Digite las ventas del dia viernes: ");
            venta5 = sc.nextDouble();
            System.out.println("Digite las ventas del dia sabado: ");
            venta6 = sc.nextDouble();
            System.out.println("Digite las ventas del dia domingo: ");
            venta7 = sc.nextDouble();
            mipanaderia.adicionarpannormal( nombre, venta1, venta2,venta3,venta4,venta5,venta6,venta7);
        }
        
        System.out.println("Digite el numero de panes dulces : ");
        int numpan2 = sc.nextInt();
        for(int i = 0; i < numpan1; i++){
            double venta1, venta2,venta3,venta4,venta5,venta6,venta7;
            System.out.println("Digite el nombre del pan: ");
            nombre = sc.next();
            System.out.println("Digite las ventas del dia lunes: ");
            venta1 = sc.nextDouble();
            System.out.println("Digite las ventas del dia Martes: ");
            venta2 = sc.nextDouble();
            System.out.println("Digite las ventas del dia miercoles: ");
            venta3 = sc.nextDouble();
            System.out.println("Digite las ventas del dia jueves: ");
            venta4 = sc.nextDouble();
            System.out.println("Digite las ventas del dia viernes: ");
            venta5 = sc.nextDouble();
            System.out.println("Digite las ventas del dia sabado: ");
            venta6 = sc.nextDouble();
            System.out.println("Digite las ventas del dia domingo: ");
            venta7 = sc.nextDouble();
            mipanaderia.adicionarpannormal( nombre, venta1, venta2,venta3,venta4,venta5,venta6,venta7);
        }
        
        System.out.println("Digite el numero de panes grandes : ");
        int numpan3 = sc.nextInt();
        for(int i = 0; i < numpan1; i++){
            double venta1, venta2,venta3,venta4,venta5,venta6,venta7;
            System.out.println("Digite el nombre del pan: ");
            nombre = sc.next();
            System.out.println("Digite las ventas del dia lunes: ");
            venta1 = sc.nextDouble();
            System.out.println("Digite las ventas del dia Martes: ");
            venta2 = sc.nextDouble();
            System.out.println("Digite las ventas del dia miercoles: ");
            venta3 = sc.nextDouble();
            System.out.println("Digite las ventas del dia jueves: ");
            venta4 = sc.nextDouble();
            System.out.println("Digite las ventas del dia viernes: ");
            venta5 = sc.nextDouble();
            System.out.println("Digite las ventas del dia sabado: ");
            venta6 = sc.nextDouble();
            System.out.println("Digite las ventas del dia domingo: ");
            venta7 = sc.nextDouble();
            mipanaderia.adicionarpannormal(nombre, venta1, venta2,venta3,venta4,venta5,venta6,venta7);
        }
        
        promedio = mipanaderia.calcularPromedioGeneral();
        System.out.println("\n El promedio de ventas es: " + promedio);
    }
}
