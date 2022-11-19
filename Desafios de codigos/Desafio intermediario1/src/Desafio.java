// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        //System.out.println(" ovo ");
        String palavra = leitor.nextLine();

        String novaPalavra = "";
        String[] letras = palavra.split("");
        for (int i = letras.length-1; i >= 0; i--){
            novaPalavra = novaPalavra + letras[i];
        }

        System.out.println(novaPalavra.equals(palavra)?"TRUE":"FALSE");
    }
}
