package br.senai.jandira.sp.loop;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
       Scanner teclado = new Scanner(System.in);

        String [] carros = {"x1", "fuscas" ,"ferrai", "Uno" };
        System.out.println("--------------------");
        System.out.println(" Bem vindo ");
        System.out.println("---------------------");

        for (int i=0; i< carros.length; i++){
            System.out.println("carros"+(i+1)+":"+ carros[i]);
        }

        System.out.println(" Escolha seu Carro:   ");

        String opcaoUsuario = teclado.nextLine();

        boolean validaCar = false;

        for (int i=0; i< carros.length; i++) {

            if (opcaoUsuario.equalsIgnoreCase(carros[i])) {
                System.out.println("Este veiculo está disponivel :)!!");
                validaCar = true;

            }
        }
        if (!validaCar){
            System.out.println(" Infelizmente este veiculo não está disponivel ): ");

        }


        for (int i= 10; i>0; i--){
            System.out.println(" Socorro ");
       }

        Exemplo for;
        for (int i=0; i<10; i++){
            System.out.println(" Java é Top");
        }


        exemplo Loop doWhile
        boolean testeDo = false;

        do {
            System.out.println(" Amo o senai Jandira");
        }while (testeDo);



    }
}
