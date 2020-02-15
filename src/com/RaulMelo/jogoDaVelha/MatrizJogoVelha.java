package com.RaulMelo.jogoDaVelha;

public class MatrizJogoVelha {

    

    String[][] jogoVelha = new String[3][3];

    int L, C, cont, po, num;

    String simb = "X";

    boolean R = false;
    
    public void mostrarMenu(){
        
        for(L=0;L<=2;L++){
            for(C=0;C<=2;C++){
             
                cont+=1;

                jogoVelha[L][C] = Integer.toString(cont);
            }
        }
    }

    public void mostraVelha() {

        System.out.println("+----+----+----+");

        for (L = 0; L <= 2; L++) {
            for (C = 0; C <= 2; C++) {

                System.out.print("|   " + jogoVelha[L][C]);
            }
            System.out.print("|");
            System.out.println("");
            System.out.println("+----+----+----+");
        }

    }

    public  void mudarJogador() {

        if (simb.equals("X")) {

            simb = "O";
        } else {
            simb = "X";
        }

    }

   public boolean jogar(String S, int P) {

        boolean mudou = false;
        

        for ( L = 0; L <= 2; L++) {
            for ( C = 0; C <= 2; C++) {

                if (jogoVelha[L][C].equals(Integer.toString(P))) {

                    jogoVelha[L][C] = S;

                    mudou = true;
                }

            }
        }
        return mudou;
    }

    public boolean terminouVelha() {

        boolean terminou = false;
        int jogada = 0;

        // jogo em linha 
        for ( L = 0; L <= 2; L++) {
            for ( C = 0; C <= 2; C++) {
                
                
                if (jogoVelha[L][0].equals(jogoVelha[L][1]) && jogoVelha[L][1].equals(jogoVelha[L][2])) {

                    terminou = true;
                }
                if (jogoVelha[0][C].equals(jogoVelha[1][C]) && jogoVelha[1][C].equals(jogoVelha[2][C])) {

                    terminou = true;

                }
                
            }
        }

        if (jogoVelha[0][0].equals(jogoVelha[1][1]) && jogoVelha[1][1].equals(jogoVelha[2][2])) {

            terminou = true;
        }
        if (jogoVelha[0][2].equals(jogoVelha[1][1]) && jogoVelha[1][1].equals(jogoVelha[2][0])) {

            terminou = true;
        }
        for ( L = 0; L <= 2; L++) {
            for ( C = 0; C <= 2; C++) {

                if (jogoVelha[L][C].equals("X") || jogoVelha[L][C].equals("O")) {

                    jogada += 1;
                }
                
                
                
                if (jogada >=9) {
                    terminou = true;
                }
                
            }

        }
        return terminou;

    }
}
