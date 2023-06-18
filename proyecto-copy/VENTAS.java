
import java.util.Scanner;
public class VENTAS
{
       public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       int cantidad1,cantidad2,cantidad3,cantidad4,cantidad5,cantidad6,cantidad7,cantidad8,cantidad9,cantidad10,cantidad11,cantidad12,cantidad13,cantidad14,cantidad15,cantidad16,cantidad17,cantidad18,cantidad19,cantidad20,cantidad21;
       double valor1, valor2, valor3,promedio,promedio2,promedio3,promedio_general,ganancias_pan1,ganancias_pan2,ganancias_pan3,gananciasgeneran;
       String pan,pan2,pan3;
        System.out.println("nombre del primer tipo de pan: ");
        pan  = sc.next();
        System.out.println("nombre del segundo tipo de pan: ");
        pan2 = sc.next();
        System.out.println("nombre del tercer tipo de pan: ");
        pan3 = sc.next();
        System.out.println("ingrese el valor del primer tipo de pan:");
        valor1 = sc.nextDouble();
        System.out.println("ingrese el valor del segundo tipo de pan:");
        valor2 = sc.nextDouble();
        System.out.println("ingrese el valor del tercero tipo de pan:");
        valor3 = sc.nextDouble();
        System.out.println("ingrese el numero de ventas del dia lunes de todos los tipos de pan:");
        cantidad1 = sc.nextInt();
        cantidad2 = sc.nextInt();
        cantidad3 = sc.nextInt();
        System.out.println("ingrese el numero de ventas del dia martes de todos los tipos de pan:");
        cantidad4 = sc.nextInt();
        cantidad5 = sc.nextInt();
        cantidad6 = sc.nextInt();
        System.out.println("ingrese el numero de ventas del dia miercoles de todos los tipos de pan:");
        cantidad7 = sc.nextInt();
        cantidad8 = sc.nextInt();
        cantidad9 = sc.nextInt();
        System.out.println("ingrese el numero de ventas del dia jueves de todos los tipos de pan:");
        cantidad10 = sc.nextInt();
        cantidad11 = sc.nextInt();
        cantidad12 = sc.nextInt();
        System.out.println("ingrese el numero de ventas del dia viernes de todos los tipos de pan:");
        cantidad13 = sc.nextInt();
        cantidad14= sc.nextInt();
        cantidad15 = sc.nextInt();
        System.out.println("ingrese el numero de ventas del dia sabado de todos los tipos de pan:");
        cantidad16 = sc.nextInt();
        cantidad17 = sc.nextInt();
        cantidad18 = sc.nextInt();
        System.out.println("ingrese el numero de ventas del dia dimingo de todos los tipos de pan:");
        cantidad19= sc.nextInt();
        cantidad20 = sc.nextInt();
        cantidad21 = sc.nextInt();
        promedio = (cantidad1+cantidad4+cantidad7+cantidad10+cantidad13+cantidad16+cantidad19)/7;
        promedio2 = (cantidad2+cantidad5+cantidad8+cantidad11+cantidad14+cantidad17+cantidad20)/7;
        promedio3 = (cantidad3+cantidad6+cantidad9+cantidad12+cantidad15+cantidad18+cantidad21)/7;
        promedio_general =(promedio+promedio2+promedio3)/3;
        ganancias_pan1 = (cantidad1+cantidad4+cantidad7+cantidad10+cantidad13+cantidad16+cantidad19)*(valor1);
        ganancias_pan2 = (cantidad2+cantidad5+cantidad8+cantidad11+cantidad14+cantidad17+cantidad20)*(valor2);
        ganancias_pan3 = (cantidad3+cantidad6+cantidad9+cantidad12+cantidad15+cantidad18+cantidad21)*(valor3);
        gananciasgeneran =(ganancias_pan1+ganancias_pan2+ganancias_pan3);
        System.out.println("El promedio de ventas del tipo de pan1 es:"  +pan+"es de:" +promedio);
        System.out.println("El promedio de ventas del tipo de pan2 es:"  +pan2+"es de:" +promedio2);
        System.out.println("El promedio de ventas del tipo de pan3 es:"  +pan3+"es de:" +promedio3);
        System.out.println("El promedio de ventas de todos los panes es de:  "+promedio_general);
        System.out.println("las ganancias fueron de :  " +gananciasgeneran);
    }
}

        
        
        
        
        
        