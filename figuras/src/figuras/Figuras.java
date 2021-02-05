/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.Scanner;
import java.security.SecureRandom;

/**
 *
 * @author Claudio Hernandez
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int ejercicio = 0;
        while (ejercicio != 9) {
            System.out.println("Ingrese una opcion");
            System.out.println("1) cuadrado ");
            System.out.println("2) triangulo");
            System.out.println("3) triangulo invertidio");
            System.out.println("4) Triangulo con espacios");
            System.out.println("5) rombo");
            System.out.println("6) Escalera vacia");
            System.out.println("7) cuadrado vacio");
            System.out.println("8) escaleras invertidas vacias");
            System.out.println("9) salirse");
            ejercicio = leer.nextInt();
            switch (ejercicio) {
                case 1: {
                    int filas, columnas;
                    System.out.print("ingrese fila");
                    filas = leer.nextInt();
                    System.out.println("ingresa las columnas");
                    columnas = leer.nextInt();
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            System.out.print("*");
                        }//fin del for interno
                        System.out.println("");
                    }//fin del for externo
                    break;
                }
                case 2: {
                    //triangulo normal
                    int limite;
                    System.out.println("Ingrese el limite");
                    limite = leer.nextInt();
                    for (int i = 1; i <= limite; i++) {
                       // System.out.println("");
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                }
                case 3: {
                    //triangulo invertido
                    int limite;
                    System.out.println("Ingrese el limite");
                    limite = leer.nextInt();
                    for (int i = 1; i <= limite; i++) {
                        for (int j = limite; j >= i; j--) {
                            System.out.print("*");
                        }//interno
                        System.out.println("");
                    }//externo
                    break;
                }//fin del case 3
                case 4: {
                    //triangulo espaciado
                    System.out.println("Ingrese el limite del triangulo:");
                    int limite = leer.nextInt();
                    for (int i = 0; i <= limite; i++) {
                        System.out.println("");
                        for (int k = limite; k > i; k--) {
                            System.out.print(" ");
                        }//para los espacios
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }//for externo
                    }//for interno
                    break;
                }
                case 5: {
                    int limite;
                    System.out.println("Ingrese el limite del rombo");
                    limite = leer.nextInt();
                    for (int i = 0; i < limite; i++) {
                        for (int j = 0; j < (limite - 1) - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < i - 1; k++) {
                            System.out.print("a");
                        }
                        for (int l = 0; l < i - 2; l++) {
                            System.out.print("c");
                        }
                        System.out.println("");
                    }//parte de arriba
                    for (int i = 0; i < limite; i++) {
                        for (int j = 0; j < (limite + 1) - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k > i - 1; k++) {
                            System.out.print("a");
                        }
                        for (int l = 0; l > i - 2; l++) {
                            System.out.print("c");
                        }
                        System.out.println("");
                    }

                    break;
                }
                case 6: {
                    //escalera vacia
                    int num;
                    System.out.println("Ingrese numero");
                    num = leer.nextInt();
                    for (int i = 0; i < num; i++) {
                        for (int j = 0; j < i; j++) {

                            for (int e = 1; e < num - j; e++) {
                                System.out.print(" ");

                            }
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                }//fin de caso 6
                case 7: {
                    //cuadrado vacio
                    System.out.println("Ingrese un nunmero");
                    int num = leer.nextInt();
                    for (int i = 0; i < num; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    for (int i = 0; i < num - 2; i++) {
                        System.out.print("*");
                        for (int j = 0; j < num - 2; j++) {
                            System.out.print(" ");
                        }
                        System.out.println("*");
                    }
                    for (int i = 0; i < num; i++) {
                        System.out.print("*");
                    }
                    break;
                }
                case 8: {
                    //escalera invertida vacia
                    int limite;
                    System.out.println("Ingrese el limite");
                    limite = leer.nextInt();
                    for (int i = 1; i <= limite; i++) {
                        for (int j = limite; j >= i; j--) {
                            System.out.print("*");

                        }//interno
                        System.out.println("");
                    }//externo
                    break;
                }
                case 9:{
                    break;
                }
                case 10:{
                SecureRandom l = new SecureRandom();
                for(int i =1;i<=100;i++){
                int c = 1+ l.nextInt(80-1);
                    System.out.println(c);
                }
                }
                
                
            }//switch
            System.out.println("");
        }//entrar al menu

    }

}
