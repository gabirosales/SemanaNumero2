/*4-. Una  empresa  de  venta  de  computadoras  paga  a  su  personal  de  ventas  un  salario  de $300,00 más una 
comisión de $50,00 por computadora vendida. Diseñar un programa para calcular  el  salario  de  un  vendedor  en  
un  determinado  mes,  conociendo  el  nº  de computadoras vendidas. Al salario devengado se debe de retener el 10%
en concepto de renta. Imprimir el nombre del vendedor, el salario devengado y la retención de la renta.*/
package EjerciciosDeLaGuia2;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String [] args) {
        Ejercicio4 ();
    }
    public static void Ejercicio4 () {
        Scanner leer = new Scanner (System.in);
        
        String nombre;
        double salario = 300, comision = 50, NComputadora, retencion = 0.1;
        
        System.out.println("Escriba el nombre del vendedor: ");
        nombre = leer.next();
        
        System.out.println("Digite el numero de computadoras vendidas: ");
        NComputadora = leer.nextDouble();
        
        double salarioD = Ejercicio4.Salariodesvengado(salario, comision, NComputadora);
        double  Renta  = Ejercicio4.RetencionR(salarioD, retencion);
        
        System.out.println("El nombre del vendedor es: " + nombre);
        System.out.println("El salario desvengado del vendedor es:$ " + salarioD);
        System.out.println("La retención de la renta es: " + Renta);
    }
    public static double Salariodesvengado (double salario,double comision,double NComputadora){
        double SalD = 0;
        SalD = salario + (comision * NComputadora);
        return SalD;
    }
    
    public static double RetencionR (double salarioD, double retencion) {
        
        double RentaR = 0;
        RentaR = salarioD * retencion;
        
        return RentaR;
    }
}
