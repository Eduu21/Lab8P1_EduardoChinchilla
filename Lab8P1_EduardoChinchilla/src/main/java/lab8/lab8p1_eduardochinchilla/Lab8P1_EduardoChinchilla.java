
package lab8.lab8p1_eduardochinchilla;

import java.util.Scanner; 
import java.util.Random;


public class Lab8P1_EduardoChinchilla {
    static Scanner read = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) {
        
     int opcion =0;
     
     do{
         System.out.println("Menu");
         System.out.println("1. X-Array");
         System.out.println("2. Sin Duplicados");
         System.out.println("3. Oracion a Matriz");
         System.out.println("4. Salir");
         
         opcion = read.nextInt();
         
         switch(opcion){
             case 1:{
                 System.out.println("Ingrese el tamaño: ");
                 int tam = read.nextInt();
                 int[][] temp = new int[tam][tam];
                    for(int i = 0; i < tam; i++){
                       for (int j = 0; j < tam; j++){
                        temp[i][j] = 1100+rand.nextInt(3001);
                       }
                    }
                    
                 break;
             }
             case 2:{
                 System.out.println("Ingrese un tamaño: ");
                 int x = read.nextInt();
                     while(x<5 || x>10){
                     System.out.println("Error, El valor ingresado esta fuera de los limites");
                     System.out.println("Ingrese un tamaño: ");
                     x = read.nextInt();
                     }
                     Duplicados atributo= new Duplicados(x);
                     imprimirarray(atributo.getarray());
                     
                     System.out.println(" ");
                     atributo.SDuplicados();
                     imprimirarray(atributo.getarray()); 
                 break;
             }
             case 3:{
                 System.out.println("Ingrese una oracion");
                 String s = read.next();
                 break;
             }
             case 4:{
                 System.out.println("Ha salido del menu");
                 break;
             }
             
             
             
             
             default:
         }//fin switch
         
     }while (opcion !=4);
    }//fin main
   public static String imprimirarray(int [] array){
    String arreglo ="";
    for (int i=0; i <array.length;i++){
        arreglo += ("["+array[i]+"]");
    }
    arreglo +="\n";
    return arreglo;
}
public static String imprimirM(int[][] numeros){
        String matri="";
        for (int i = 0; i<numeros.length;i++){
            for (int j = 0; j < numeros[i].length;j++){
                matri += "["+numeros[i][j]+"]";
            }
            matri += "\n";
            }
        return matri;
        }
}//fin class
