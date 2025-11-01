import java.util.Scanner;

public class Exercicio1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double[] temperaturas = new double[12];
            String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                    "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

            double soma = 0;

            for(int i = 0; i < 12; i++){
                System.out.print("Digite a temperatura média de " + meses[i] + ": ");
                temperaturas[i] = sc.nextDouble();
                soma += temperaturas[i];
            }

            double mediaAnual = soma / 12;
            System.out.println("\nMédia Anual: " + mediaAnual);

            System.out.println("\nTemperaturas acima da média anual:");
            for(int i = 0; i < 12; i++){
                if(temperaturas[i] > mediaAnual){
                    System.out.println(meses[i] + ": " + temperaturas[i]);
                }
            }
        }
    }


