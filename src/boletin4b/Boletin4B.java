/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin4b;
import java.util.Scanner;

/**
 *
 * @author jbarrosgarcia
 */
public class Boletin4B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Consume toyota=new Consume();
        Scanner teclado=new Scanner(System.in);
        toyota.setLitros(50f);
        toyota.setPGas(1.57f);
        float km, litros, vMed, pGas;
        System.out.println("Introduzca los km");
        km=teclado.nextFloat();
        System.out.println("Introduzca los litros");
        litros=teclado.nextFloat();
        System.out.println("Introduzca la velocidad media");
        vMed=teclado.nextFloat();
        System.out.println("Introduzca el precio del litro de gasolina");
        pGas=teclado.nextFloat();
        Consume mazda=new Consume(km,litros,vMed,pGas);
        System.out.println("El consumo medio es "+mazda.getConM()+" l / 100 km");
        System.out.println("Has consumido "+mazda.getLit()+" litros de combustible");
        System.out.println("Introducir nueva cantidad de litros");
        litros=teclado.nextFloat();
        mazda.setLitros(litros);
        System.out.println("El nuevo total de litros es "+mazda.getLit());
        // TODO code application logic here
    }
    
}
