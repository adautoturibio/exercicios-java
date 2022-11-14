import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        double sal = 1200.00;
        int cor=0, pb=0;
        ArrayList<Integer> numInsc = new ArrayList<Integer>();  
        ArrayList<Double> salLiq = new ArrayList<Double>();  
        ArrayList<Double> salBruto = new ArrayList<Double>();  
        DecimalFormat decimal = new DecimalFormat("#,##0.00"); //FORMATAÇÃO DE CASAS DECIMAIS 
        

        for (int i=0; i<1; i++){

            System.out.print("\nInforme o numero de inscrição: ");
            numInsc.add(i,reader.nextInt());

            System.out.print("Televisores a cores vendidos: ");
            cor = reader.nextInt();
            
            System.out.print("Televisores preto e branco vendidos: ");
            pb = reader.nextInt();

            if (cor>=10){
                cor= cor*100;
            }
            if (cor<10){
                cor = cor*50;
            }

            if (pb>=20){
                pb = pb*40;
            }
            if (pb<20){
                pb = pb*20;
            }

            int comissao = cor+pb;
            salBruto.add(i, comissao+sal); // SALÁRIO BRUTO
            double inps = (sal*8)/100;
            double salFixo = sal-inps; //ESTABELECENDO O SALARIO COM DESCONTO DE 8%

            double sal_com = comissao+salFixo;
            double ip = (sal_com*5)/100; //IMPOSTO DE RENDA DE 5%

            if (sal_com>3000){ // DECONTO DO IMPOSTO DE RENDA
                double aux = sal_com-ip;
                salLiq.add(i, aux);
            }else{
                salLiq.add(i, salFixo+comissao);
            }
        }

        for (int i=0; i<numInsc.size(); i++) {
            System.out.println("\n---------------------------");
            System.out.println("Número de inscrição: "+numInsc.get(i));
            System.out.println("Salário bruto: "+decimal.format(salBruto.get(i)));
            System.out.println("Salário Líquido: "+decimal.format(salLiq.get(i)));
            
        }
        reader.close(); 
    } 
}      

          
    