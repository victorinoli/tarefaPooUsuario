import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int contador = 0;
        Usuario[] usuarios = new Usuario[3];

        int sair = 0;

        Scanner sc = new Scanner(System.in);

        while(sair == 0) {

            System.out.printf("O que deseja fazer %n" +
                               "1 para cadastrar novo usuario%n" +
                               "2 para fazer busca por cpf%n" +
                               "0 para sair do programa\n");

            int selecionador = sc.nextInt();

            switch (selecionador) {

                case 1:

                    contador++;

                    System.out.print("\nDigite o nome do usuario: ");
                    String nome = sc.next();

                    System.out.print("\nDigite o cpf do usuario: ");
                    String cpf = sc.next();

                    System.out.print("\nDigite o email do usuario: ");
                    String email = sc.next();

                    usuarios[contador - 1] = new Usuario(nome, email, cpf);

                    break;

                case 2:
                    System.out.print("\nDigite o cpf do usuario: ");
                    String cpf2 = sc.next();

                    for(int i = 0; i < contador; i++) {
                        usuarios[i].pesquisa(cpf2);
                    }
                    break;

                case 0:
                    sair = 1;
                    break;

                default:
                    System.out.println("entrada invalida");
            }

        }

    }
}