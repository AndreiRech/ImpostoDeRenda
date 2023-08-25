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
        while (opc != 3);
    }

    public static void decCompleta () {
        String nome;
        int cpf, idade, dependentes;
        double contribuicao, rendimentos;

        System.out.println("Informe seu nome: ");
        nome = in.nextLine();

        System.out.println("Informe seu CPF: ");
        cpf = in.nextInt();

        System.out.println("Informe sua idade: ");
        idade = in.nextInt();

        System.out.println("Informe o número de dependentes: ");
        dependentes = in.nextInt();

        System.out.println("Informe sua contribuição previdenciária oficial: ");
        contribuicao = in.nextDouble();

        System.out.println("Informe seu total de rendimentos");
        rendimentos = in.nextDouble();

        calculoDaBase(contribuicao, rendimentos);
    }

    public static void decSimplificada () {
        String nome;
        int cpf;
        double contribuicao, rendimentos;

        System.out.println("Informe seu nome: ");
        nome = in.nextLine();

        System.out.println("Informe seu CPF: ");
        cpf = in.nextInt();

        System.out.println("Informe sua contribuição previdenciária oficial: ");
        contribuicao = in.nextDouble();

        System.out.println("Informe seu total de rendimentos");
        rendimentos = in.nextDouble();

        calculoDaBase(contribuicao, rendimentos);
    }
}
