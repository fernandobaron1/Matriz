/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Random;

/**
 *
 * @author ferna
 */
public class Matriz {

    
    public static void main(String[] args) {
        int contador =0;      
        int[][] matriz = new int[5][10];
        Random aleatorio = new Random();
        
    //Preenche    
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 10; coluna++) {
                matriz [linha] [coluna] = aleatorio.nextInt(501);
                contador++;
            }
        
    }
    //percorro
    for (int linha = 0; linha < 5; linha++) {
        for (int coluna = 0; coluna < 10; coluna++) {
             System.out.print("["+linha+"]"+"["+coluna+"] => "+matriz [linha][coluna]+"\t"); //\n
         
        }
        System.out.println("");  
        
    }
    
     System.out.println("Quantos elementos tem na tabela: "+contador);
    } 
    }
    

