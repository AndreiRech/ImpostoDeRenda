import java.util.Scanner;
public class App {
    private static Scanner in = new Scanner (System.in);
    public static void main(String args[]) {
        opcao();
    }

    public static void menu () {
        String mensagem = """

                ------------------- [ MENU ] -------------------

                Informe o que deseja fazer:

                1. Realizar declaração simplificada;
                2. Realizar declaração completa;
                3. Verificar o imposto a pagar;
                4. Sair.
                """;
        System.out.println(mensagem);
    }

    public static void opcao () {
        int opc = 0;

        do {
            menu();
            opc = in.nextInt();

            switch (opc) {
                case 1:
                    decSimplificada();
                    break;
                case 2:
                    decCompleta();
                    break;
                case 3:
                    recebeImposto();
                    break;
                case 4:
                    System.out.println("\nSaindo do aplicativo...");
                    break;
                default:
                    System.out.println("\nInforme uma opção válida!");
                    break;
            }
        }
        while (opc != 4);
    }

    public static void decCompleta () {
        String nome, cpf;
        int idade, dependentes;
        double contribuicao, rendimentos;

        System.out.println("------------------- [ DECLARAÇÃO COMPLETA ] -------------------");

        System.out.print("Informe seu nome: ");
        nome = in.next();

        System.out.print("Informe seu CPF: ");
        cpf = in.next();

        System.out.print("Informe sua idade: ");
        idade = in.nextInt();

        System.out.print("Informe o número de dependentes: ");
        dependentes = in.nextInt();

        System.out.print("Informe sua contribuição previdenciária oficial: ");
        contribuicao = in.nextDouble();

        System.out.print("Informe seu total de rendimentos: ");
        rendimentos = in.nextDouble();

        calculoDaBase(contribuicao, rendimentos);
    }

    public static void decSimplificada () {
        String nome, cpf;
        double contribuicao, rendimentos;

        System.out.println("------------------- [ DECLARAÇÃO SIMPLIFICADA ] -------------------");
        System.out.print("Informe seu nome: ");
        nome = in.next();

        System.out.print("Informe seu CPF: ");
        cpf = in.next();

        System.out.print("Informe sua contribuição previdenciária oficial: ");
        contribuicao = in.nextDouble();

        System.out.print("Informe seu total de rendimentos");
        rendimentos = in.nextDouble();

        calculoDaBase(contribuicao, rendimentos);
    }

    public static double calculoDaBase(double contribuicao, double rendimentos){
        double calculoBase = rendimentos - contribuicao;
        calculoBase = 0.95*calculoBase;
        return calculoBase;
    }

    public static void recebeImposto () {

    }
}
