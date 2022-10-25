import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int mortalidade = 0, nasc = 0, mort = 0, meses = 0, nascM = 0, mesesC = 0;
        String sexo;

        
        System.out.print("Informe o número de crianças nascidas no período: ");
        nasc = reader.nextInt();
        reader.nextInt();



        do {
           
            System.out.println("\n ================ Relatório de crianças mortas ================\n");
            System.out.print("Informe o sexo da criança morta: ");
            sexo = reader.nextLine();

            System.out.println("\nInforme quantos meses viveu a criança: ");
            meses = reader.nextInt();
           
            if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("masculino")) {
                nascM++;
            }

            if (meses <= 24){
                mesesC++;
            }

            mort++;  
        } while (!sexo.equalsIgnoreCase("vazio"));

        mortalidade = mort*nasc/100;

        System.out.println("A porcentagem de crianças mortas é: "+mortalidade);

    }
}