import java.util.Scanner;

public class ProdutoFacade {

    private Produto produto;

    public ProdutoFacade() {
        this.produto = new Produto();
    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int resp = 9;
        
        while (resp != 0) {
            System.out.println(" \n \n O que deseja fazer? 1-Cadastrar produto / 2 - Consultar valor / 3 - Consultar valor com imposto / 0 - Sair \n \n ");
            resp = scan.nextInt();
            if (resp == 1) {
                
                System.out.println("Digite o codigo do produto");
                int codprod = scan.nextInt();
                System.out.println("Digite o nome do produto");
                scan.nextLine();
                String nomprod = scan.nextLine();
                System.out.println("Digite o valor do produto");
                float valprod = scan.nextFloat();
                System.out.println("Digite a porcentagem de ICMS sobre esse produto");
                float perimp = scan.nextFloat();

                Produto.cadastrarProduto(codprod, nomprod, valprod, perimp);
            }

            if (resp == 2) {
                System.out.println("Qual produto deseja buscar? \n");
                int produto = scan.nextInt();
                Produto.buscarValorSemImposto(produto);
            }

            if (resp == 3) {
                System.out.println("Qual produto deseja buscar? \n");
                int produto = scan.nextInt();
                Produto.buscarValorComImposto(produto);
            }
        }
        scan.close();
    }
}
