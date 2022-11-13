import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<Double> conta = new ArrayList<Double>();
        double balanco=60, balMin=30.0, taxa=4, valor=0;
        int loop = 1, transNum=0, op=0;

        while(loop==1){

            for (int i = 0; i < 10; i++) {

                System.out.println("Balanço mínimo diário: "+balMin+" reais.");
                System.out.println("Taxa  de serviço: "+taxa+"%");
                System.out.println("Quantidade de transações realizadas: "+transNum);
                
                int aux=0;
                System.out.print("\nInforme o numero da conta ou digite [0] para encerrar: ");
                aux = reader.nextInt();
                if (aux==0){ // ENCERRANDO LAÇO CASO RECEBA 0
                    loop=0;
                    break;
                }
                num.add(aux);
                conta.add(i,60.0); // ADICIONADO SALDO DE 60 REAIS PARA CADA CONTA INICIADA

                
                
                    System.out.print("[1]Depósito  [2]Saque  --> "); //OPERAÇÕES
                    op = reader.nextInt();

                    if (op==1){
                        System.out.print("\nInforme o valor: "); //DEPÓSITO
                        valor = reader.nextDouble();
                        conta.add(i,conta.get(i)+valor);
                        transNum++;
                    }
                    if (op==2) {
                        System.out.print("\nInforme o valor: "); //SAQUE
                        valor = reader.nextDouble();
                        conta.add(i,conta.get(i)-valor);
                        transNum++;
                    }


                    System.out.println("\nOPERAÇÃO CONCLUÍDA COM SUCESSO! SAINDO DA CONTA...");
                    System.out.println("-------------------------------------------------");
                }
            }

            for (int i = 0; i < num.size(); i++) {
                System.out.println("\n----------------");
                System.out.println("Numero da conta: "+num.get(i));

                double aux=conta.get(i);
                if (aux<60 && aux>30){
                    balanco = 60-aux;
                    System.out.println("Débito: "+balanco+" reais.");
                    System.out.println("Saldo total: "+aux+" reais.");
                }
                if (aux<30) {
                    balanco = 60-aux;
                    taxa = (taxa*balanco)/100;
                    System.out.println("Débito: "+balanco+" reais.");
                    System.out.println("Taxa de serviço: "+taxa+" reais.");
                    System.out.println("Saldo total: "+(aux-taxa)+" reais.");
                    
                }
                if (aux<1){
                    System.out.println("Não há fundos na conta.");
                }
                if (aux>60){
                    balanco = aux-60;
                    System.out.println("Saldo: "+balanco+" reais.");
                    System.out.println("Saldo total: "+aux+" reais.");
                }
            }
                
            
            reader.close();
        }
         
        
    }
          
    