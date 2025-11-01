import java.util.Scanner;

public class Exercicio4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] contadores = new int[9]; // 9 faixas salário

            while(true){
                System.out.print("Digite o valor das vendas brutas (ou -1 para sair): ");
                double vendas = sc.nextDouble();
                if(vendas == -1) break;

                double salario = 200 + (0.09 * vendas);

                int indice = (int)(salario / 100) - 2;
                if(indice >= 0 && indice <= 7) {
                    contadores[indice]++;
                } else {
                    contadores[8]++;
                }
            }

            System.out.println("\nFaixas salariais:");
            System.out.println("$200 - $299: " + contadores[0]);
            System.out.println("$300 - $399: " + contadores[1]);
            System.out.println("$400 - $499: " + contadores[2]);
            System.out.println("$500 - $599: " + contadores[3]);
            System.out.println("$600 - $699: " + contadores[4]);
            System.out.println("$700 - $799: " + contadores[5]);
            System.out.println("$800 - $899: " + contadores[6]);
            System.out.println("$900 - $999: " + contadores[7]);
            System.out.println("$1000 ou mais: " + contadores[8]);
        }
    }

