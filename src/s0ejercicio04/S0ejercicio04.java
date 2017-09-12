/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s0ejercicio04;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S0ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("INGRESA UNA LETRA");
        String s = input.nextLine();
        char ch = s.charAt(0);
        
        
        if (Character.isLetter(ch)){
            switch (Character.toUpperCase(ch)){
                        case 'A':
                        case 'E':
                        case 'I':
                        case 'O':
                        case 'U':
                            System.out.println(ch + " ES UNA VOCAL");
                            break;
                        default:
                            System.out.println(ch + " ES UNA CONSONANTE");
            }
         
        }else {
            System.out.println(ch + " ES UNA ESTRADA INVALIDA");
        }
    }
}
