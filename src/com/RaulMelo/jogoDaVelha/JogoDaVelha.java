package com.RaulMelo.jogoDaVelha;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        MatrizJogoVelha jogarObj = new MatrizJogoVelha();
        
        
        
        jogarObj.mostrarMenu();
        jogarObj.mostraVelha();
        
         do {
             
             do{
                 
                 System.out.println("Vai jogar [" + jogarObj.simb + "] em qual posição ?");    
                 
                 jogarObj.po = scan.nextInt();
                 
                 jogarObj.R= jogarObj.jogar(jogarObj.simb, jogarObj.po);
                 
                 if (jogarObj.R == false ){
                                         
                     System.out.println("JOGADA INVÁLIDA"); 
                 
                 } 
                 
             }while (!jogarObj.R==true);
             
             jogarObj.mudarJogador();
             
             jogarObj.mostraVelha();
             
         }while(!jogarObj.terminouVelha() == true);
            
        System.out.println("JOGO FINALIZADO !");

   
    }       
            
}
 