import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Double> notas = new ArrayList<>();
            double nota, soma = 0;

            while(true){
                System.out.print("Digite uma nota (ou -1 para encerrar): ");
                nota = sc.nextDouble();
                if(nota == -1) break;
                notas.add(nota);
                soma += nota;
            }

            System.out.println("\nQuantidade de valores lidos: " + notas.size());
            System.out.println("Valores na ordem informada: " + notas);

            System.out.println("\nValores na ordem inversa:");
            for(int i = notas.size()-1; i >= 0; i--){
                System.out.println(notas.get(i));
            }

            double media = soma / notas.size();
            System.out.println("\nSoma das notas: " + soma);
            System.out.println("Média das notas: " + media);

            int acimaMedia = 0;
            int abaixoSete = 0;

            for(double n : notas){
                if(n > media) acimaMedia++;
                if(n < 7) abaixoSete++;
            }

            System.out.println("Quantidade acima da média: " + acimaMedia);
            System.out.println("Quantidade abaixo de 7: " + abaixoSete);

            System.out.println("\nPrograma Encerrado.");
        }
    }

