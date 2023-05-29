package GeradorRandomicoDeN�merosLoteria;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class GeradorNumerosLoteria {
   
    public static void main(String[] args) {
        
          
          int quantidadeNumeros = 6;

            List<Integer> numeros = gerarNumerosLoteria(quantidadeNumeros);

            System.out.println("The numbers are: ");
            
            
            for (int numero : numeros){System.out.println(numero + "");
    }

  }



public static List<Integer> gerarNumerosLoteria(int quantidadeNumeros){

        List<Integer> numeros = new ArrayList<>();
             Random random = new Random();
               
             while (numeros.size()<quantidadeNumeros){
             int numero =random.nextInt(60) + 1;//Números de 1 a 60 
             
             if (!numeros.contains(numero)){
                numeros.add(numero);
      }      
  
   }      
    

    
    //ORDENA QUE OS NÚMEROS APAREÇAM EM ORDEM CRESCENTE
   Collections.sort(numeros);
   return numeros; 
     
 }

}    
    




