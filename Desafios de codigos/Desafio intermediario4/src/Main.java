// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);
        int i, aux;
        //System.out.println("Digite o tamanho do Array: ");
        int N = leitor.nextInt();
        int [] nums = new int[N];

        for (i = 0; i < N; i++)
        {
            //System.out.println("Digite o " + (i+1) +"°" + " número: ");
            nums[i] = leitor.nextInt();
        }

        for (i = 0; i < N; i++)
        {
            if (nums[i] % 2 != 0){

                for (int x = (i+1); x < N; x++)
                {
                    if (nums[x] % 2 == 0) {
                        aux = nums[i];
                        nums[i] = nums[x];
                        nums[x] = aux;
                        x = N;
                    }
                }
            }
        }

        for (i = 0; i < N; i++)
        {
            System.out.println(nums[i]);
        }
    }
}