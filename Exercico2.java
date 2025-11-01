import java.util.Scanner;

public class Exercico2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String[] perguntas = {
                    "Telefonou para a vítima?",
                    "Esteve no local do crime?",
                    "Mora perto da vítima?",
                    "Devia para a vítima?",
                    "Já trabalhou com a vítima?"
            };

            int respostasPositivas = 0;

            for(String pergunta : perguntas){
                System.out.print(pergunta + " (s/n): ");
                String resposta = sc.next();
                if(resposta.equalsIgnoreCase("s")) {
                    respostasPositivas++;
                }
            }

            System.out.print("\nClassificação: ");

            if(respostasPositivas == 2){
                System.out.println("Suspeita");
            } else if(respostasPositivas == 3 || respostasPositivas == 4){
                System.out.println("Cúmplice");
            } else if(respostasPositivas == 5){
                System.out.println("Assassino");
            } else {
                System.out.println("Inocente");
            }
        }
    }

