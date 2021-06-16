/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese la opcion requerida:\n-1. Estudiante\n-2."
                + " Docente\n-3. Policia");
        int op = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Digite el nombre:");
        String nombre = entrada.nextLine();
        
        System.out.println("Digite el apellido:");
        String apellido = entrada.nextLine();
        
        System.out.println("Digite la edad:");
        int edad = entrada.nextInt();
        
        switch (op){
            case 1:
                System.out.println("Digite la matricula:");
                double mat = entrada.nextDouble();
                
                Estudiante e = new Estudiante(nombre, apellido, edad, mat);
                System.out.println(e);
                break;
            case 2:
                System.out.println("Digite el sueldo:");
                double suel = entrada.nextDouble();
                
                Docente d = new Docente(nombre, apellido, edad, suel); 
                System.out.println(d);
                break;
            case 3:
                entrada.nextLine();
                System.out.println("Digite el rango:");
                String rang = entrada.nextLine();
                
                Policia p = new Policia(nombre, apellido, edad, rang); 
                System.out.println(p);
                break;
        }
    } 
}
