public class App{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);

        System.out.println("Deseja fazer:\n1-Declaração completa\n2-Declaração simplificada");
        int opcao  in.nextInt();
        switch (opcao){
            case 1: System.out.println("Informe seu nome: ");
                String nome = in.nextLine();
                System.out.println("Informe seu CPF: ");
                int cpf = in.nextInt();
                System.out.println("Informe sua idade: ");
                int idade = in.nextInt();
                System.out.println("Informe o número de dependentes: ");
                int dependentes = in.nextInt();
                System.out.println("Informe sua contribuição previdenciária oficial: ");
                int contribuicao = in.nextInt();
                System.out.println("Informe seu total de rendimentos");
                int rendimentos = in.nextInt();
            case 2: String nome = in.nextLine();
                System.out.println("Informe seu CPF: ");
                int cpf = in.nextInt();
                System.out.println("Informe sua contribuição previdenciária oficial: ");
                int contribuicao = in.nextInt();
                System.out.println("Informe seu total de rendimentos");
                int rendimentos = in.nextInt();
        }

    }


}