import java.util.Scanner;

public class App {
    private static Scanner in = new Scanner(System.in);
    private static String nome, cpf;
    private static double contribuicao, rendimentos;
    private static int idade, dependentes;

    public static void main(String args[]) {
        opcao();
    }

    public static void menu() {
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

    public static void opcao() {
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
                    calculoDaBase();
                    break;
                case 4:
                    System.out.println("\nSaindo do aplicativo...");
                    break;
                default:
                    System.out.println("\nInforme uma opção válida!");
                    break;
            }
        } while (opc != 4);
    }

    public static void decCompleta() {
        System.out.println("------------------- [ DECLARAÇÃO COMPLETA ] -------------------");

        System.out.print("Informe seu nome: ");
        nome = in.next();

        System.out.print("Informe seu CPF: ");
        cpf = in.next();

        System.out.print("Informe sua contribuição previdenciária oficial: ");
        contribuicao = in.nextDouble();

        System.out.print("Informe seu total de rendimentos: ");
        rendimentos = in.nextDouble();

        System.out.print("Informe o número de dependentes: ");
        dependentes = in.nextInt();

        System.out.print("Informe a idade: ");
        idade = in.nextInt();
    }

    public static void decSimplificada() {
        System.out.println("------------------- [ DECLARAÇÃO SIMPLIFICADA ] -------------------");

        System.out.print("Informe seu nome: ");
        nome = in.next();

        System.out.print("Informe seu CPF: ");
        cpf = in.next();

        System.out.print("Informe sua contribuição previdenciária oficial: ");
        contribuicao = in.nextDouble();

        System.out.print("Informe seu total de rendimentos: ");
        rendimentos = in.nextDouble();
    }

    public static void calculoDaBase() {
        double calculoBase = rendimentos - contribuicao;
        calculoBase = 0.95 * calculoBase;

        double imposto = pagaImposto(calculoBase);
        double desconto = aplicarDesconto();
        imposto -= desconto;

        System.out.println("\nO imposto a pagar é R$" + imposto);
    }

    public static double pagaImposto(double calculoBase) {
        double base = calculoBase;
        double imposto = 0;
        if (base <= 12000) {
            imposto = 0;
        } else if (base <= 24000) {
            imposto = (base - 12000) * 0.15;
        } else {
            imposto = (base - 24000) * 0.27 + (12000 * 0.15);
        }

        return imposto;
    }

    public static double aplicarDesconto() {
        double desconto = 0;
        if (idade < 65) {
            if (dependentes <= 2) {
                desconto = 0.02;
            } else if (dependentes >= 3 && dependentes <= 5) {
                desconto = 0.035;
            } else if (dependentes > 5) {
                desconto = 0.05;
            }
        } else {
            if (dependentes <= 2) {
                desconto = 0.03;
            } else if (dependentes >= 3 && dependentes <= 5) {
                desconto = 0.045;
            } else if (dependentes > 5) {
                desconto = 0.06;
            }
        }
        return desconto * rendimentos;
    }
}