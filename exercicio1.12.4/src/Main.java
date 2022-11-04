import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in); //criação do objeto para ler teclado
        
        String nome;
        float pc = 0;
        float pv = 0;
        int i = 1;
        float lucro = 0, lucroTotal = 0, compraTotal = 0, vendaTotal = 0;
        int l1 = 0, l2 = 0, l3 = 0;


        for (i=1; i<9999;){
            System.out.print("\nInforme o nome do produto: ");
            nome = reader.next();

            System.out.print("Informe o preço de compra do produto: ");
            pc = reader.nextFloat();

            System.out.print("Informe o preço de venda do produto: ");
            pv = reader.nextFloat();

            System.out.print("\n[1] para continuar | [0] para encerrar ");
            i = reader.nextInt();

            vendaTotal += pv;
            compraTotal += pc;
            lucroTotal += (pv-pc);
            lucro = ((pv-pc)/pv)*100;

            if (lucro<10){
                l1++;
            }
            if (lucro>=10 && lucro <=20){
                l2++;
            }
            if (lucro > 20){
                l3++;
            }
           
            if(i == 0){
                break;
            }
            if (i == 1){}
        }

        System.out.println("\n------------------------------------");
        System.out.println("\nValor total de compra: "+compraTotal);
        System.out.println("Valor total de vendas: "+vendaTotal);
        System.out.println("Valor total de lucro: "+lucroTotal);

        System.out.println("\nProdutos com <10% de lucro: "+l1);
        System.out.println("Produtos entre 10% e 20% de lucro: "+l2);
        System.out.println("Produtos com >20% de lucro: "+l3);

        reader.close();
    }
}