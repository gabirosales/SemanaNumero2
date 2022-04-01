package EjemplosDeLaGuia2;

import java.util.Scanner;

public class CalcularDainConScanner {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double valorMaquina, valorFlete, valorSeguro;
        
        System.out.println("Valor de la maquina : ");
        valorMaquina = leer.nextDouble();
        System.out.println("Valor del flete : ");
        valorFlete = leer.nextDouble();
        System.out.println("Valor del seguro : ");
        valorSeguro = leer.nextDouble();
        
        double valorDai = CalcularDainConScanner.obtenerDai(valorMaquina, valorFlete, valorSeguro);
        double valorConIVA = CalcularDainConScanner.obtenerIVA(valorDai);
        
        System.out.println("Valor del DAI : " + valorDai);
        System.out.println("Valor del IVA : " + valorConIVA);
    }
    
    public static double obtenerDai(double valorMaquina, double valorFlete, double valorSeguro){
        double dai = 0;
        dai = (valorMaquina * valorFlete * valorSeguro) * 0.10;
        return dai;
    }
    
    public static double obtenerIVA(double dai){
        double pagoConIVA = 0;
        pagoConIVA = dai * 0.13;
        return pagoConIVA;
    }
}
