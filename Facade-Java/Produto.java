import java.util.HashMap;
import java.util.Map;

public class Produto{
    private int codProduto;
    private String nomeProduto;
    private float valorProduto;
    private float valorIcms;
    private static Map<Integer, Produto> produtos = new HashMap<>();

    public Produto(){};

    public Produto (int codProduto, String nomeProduto, float valorProduto, float valorIcms){
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.valorIcms = valorIcms;
    }

    public int getcod(){
        return this.codProduto;
    }

    public String getNome(){
        return this.nomeProduto;
    }

    public float getValor(){
        return this.valorProduto;
    }

    public float getIcms(){
        return this.valorIcms;
    }

    public static void cadastrarProduto(int codProduto, String nomeProduto, float valorProduto, float valorIcms) {
        Produto produto = new Produto(codProduto, nomeProduto, valorProduto, valorIcms);
        produtos.put(codProduto, produto);
        exibeMensagem(true);
        //System.out.println("Produto cadastrado com sucesso: " + nomeProduto);
    }

    public static void buscarValorSemImposto(int codProduto){
        Produto prod = produtos.get(codProduto);
        int codProd = prod.getcod();
        String nomeprod = prod.getNome();
        float valProd = prod.getValor();
        System.out.println(" \n **-------------------------------------------** \n");
        System.out.println(" \n O valor do produto " + codProd + " - " + nomeprod + " com ICMS é de: R$ " + valProd);
        System.out.println("\n **-------------------------------------------** \n");
    };

    public static void buscarValorComImposto(int codProduto){
        Produto prod = produtos.get(codProduto);
        int codProd = prod.getcod();
        String nomeprod = prod.getNome();
        float valProd = prod.getValor();
        float valImp = prod.getIcms();
        System.out.println(" \n **-------------------------------------------** \n");
        System.out.println(" \n O valor do produto " + codProd + " - " + nomeprod + " sem imposto é de: R$ " + valProd * ((valImp/100)+1));
        System.out.println("\n **-------------------------------------------** \n");
    };

    public static void exibeMensagem(boolean cadastro) {
        String mensagem = "";

        if (cadastro == true) {
            mensagem = "\n Produto cadastrado com sucesso \n";
        } 
        else{
            mensagem = "\n Produto não cadastrado. Tente novamente! \n ";
        }
        
        System.out.println(mensagem);
    }

    public static void main(String[] args) throws Exception {
        
    }
}


// Scanner scan = new Scanner(System.in);
        // int resp = 9;
        
        // while (resp != 0) {
        //     System.out.println(" \n \n O que deseja fazer? 1-Cadastrar produto / 2 - Consultar valor / 3 - Consultar valor com imposto / 0 - Sair \n \n ");
        //     resp = scan.nextInt();
        //     if (resp == 1) {
                
        //         System.out.println("Digite o codigo do produto");
        //         int codprod = scan.nextInt();
        //         System.out.println("Digite o nome do produto");
        //         scan.nextLine();
        //         String nomprod = scan.nextLine();
        //         System.out.println("Digite o valor do produto");
        //         float valprod = scan.nextFloat();
        //         System.out.println("Digite a porcentagem de ICMS sobre esse produto");
        //         float perimp = scan.nextFloat();

        //         cadastrarProduto(codprod, nomprod, valprod, perimp);
        //     }

        //     if (resp == 2) {
        //         System.out.println("Qual produto deseja buscar? \n");
        //         int produto = scan.nextInt();
        //         buscarValorSemImposto(produto);
        //     }

        //     if (resp == 3) {
        //         System.out.println("Qual produto deseja buscar? \n");
        //         int produto = scan.nextInt();
        //         buscarValorComImposto(produto);
        //     }
        // }
        // scan.close();