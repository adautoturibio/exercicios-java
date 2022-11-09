import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#,##0.00");
        
        double p_res = 0.92;
        double p_com = 0.86;
        double p_ind = 1.79;
        int aux = 0, aux1 = 0, tipo = 0;
        ArrayList<Integer> n_cons = new ArrayList<Integer>();
        ArrayList<Double> res = new ArrayList<Double>();
        ArrayList<Double> com = new ArrayList<Double>();
        ArrayList<Double> ind = new ArrayList<Double>();
        ArrayList<Double> ordem = new ArrayList<Double>();

        for(int i=0; i<100000000; i++){

            System.out.print("\nInforme o numero do consumidor: ");
            aux = reader.nextInt();
            if(aux==0){
                break;
            }
            n_cons.add(aux); 

            System.out.print("Informe a quantidade de kWh consumidos: ");
            aux1 = reader.nextInt();

            System.out.println("[1] Residencial  [2]Comercial  [3] Industrial");
            System.out.print("Informe o tipo de consumidor: ");
            tipo = reader.nextInt();

            switch (tipo) {
                case 1:
                    res.add(aux1*p_res);
                    ordem.add(aux1*p_res);
                case 2:
                    com.add(aux1*p_com);
                    ordem.add(aux1*p_com);
                case 3:
                    ind.add(aux1*p_ind);
                    ordem.add(aux1*p_ind);
            }
            if (tipo!=1 && tipo!=2 && tipo!=3){
                System.out.println("\nCONSUMIDOR INVÁLIDO!");
                System.exit(0);;
            }
        }

        for (int i = 0; i< n_cons.size(); i++) {
            System.out.println("\n-------------------------");
            System.out.print("\nConsumidor: "+n_cons.get(i));
            System.out.println("\nTotal a pagar: "+decimal.format(ordem.get(i)));
        }

        double maior = 0, menor=1000000000;
        for (int i=0; i<ordem.size(); i++) {
            if (ordem.get(i)>maior){
                maior = ordem.get(i);
            }
            if (ordem.get(i)<menor){
                menor = ordem.get(i);
            }

        }
        System.out.println("\nO maior consumo: "+decimal.format(maior));
        System.out.println("O menor consumo: "+decimal.format(menor));

        reader.close();
    }
}