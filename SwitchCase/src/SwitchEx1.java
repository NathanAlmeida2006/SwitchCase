import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {

        /*
         * Exercício 1
         * • Crie um novo projeto e adicione o arquivo SwitchEx1.java a ele
         * • Modifique SwitchEx1.java para implementar o seguinte com a instrução switch
         * − O usuário insere o mês como um número
         * − O nome do mês correspondente deve ser exibido
         * − No caso de um mês inválido, a saída deve ser exibida como * “Mês inválido”
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número do mês: ");
        int numeroMes = sc.nextInt();

        exibirNomeDoMes(numeroMes);

        sc.close();
    }

    public static void exibirNomeDoMes(int numeroMes) {
        switch (numeroMes) {
            case 1:
                System.out.println("Janeiro!");
                break;
            case 2:
                System.out.println("Fevereiro!");
                break;
            case 3:
                System.out.println("Março!");
                break;
            case 4:
                System.out.println("Abril!");
                break;
            case 5:
                System.out.println("Maio!");
                break;
            case 6:
                System.out.println("Junho!");
                break;
            case 7:
                System.out.println("Julho!");
                break;
            case 8:
                System.out.println("Agosto!");
                break;
            case 9:
                System.out.println("Setembro!");
                break;
            case 10:
                System.out.println("Outubro!");
                break;
            case 11:
                System.out.println("Novembro!");
                break;
            case 12:
                System.out.println("Dezembro!");
                break;
            default:
                System.out.println("Mês inválido!");
                break;
        }
    }
}