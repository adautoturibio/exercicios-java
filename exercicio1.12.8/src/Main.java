import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int sim = 0, nao = 0, i=0, fsim = 0, mnao = 0, m=0, f=0;
        char sexo;
        String resposta;
        float fsimPorcent = 0, mnaoPorcent = 0;

        for (i=0; i<3; i++){

            System.out.print("\nInforme seu sexo: ");
            sexo = reader.nextLine().charAt(0);
            
            System.out.print("Gostou do produto: ");
            resposta = reader.nextLine();

            if (sexo=='M' || sexo=='m'){
                m++;
            } 
            if(sexo=='F' || sexo=='f'){
                f++;
            }

            if (resposta.equals("sim") || resposta.equals("Sim")){
                sim++;
            }
            
            if (resposta.equals("nao") || resposta.equals("Nao")){
                nao++;
            }

            //if ((sexo=='F' || sexo=='f') && (resposta.equals("sim") || resposta.equals("Sim"))) {
            //    fsim++;
            //}
            if (((sexo=='M' || sexo=='m') && (resposta.equals("nao") || resposta.equals("Nao")))) {
                mnao++;
            }

        }

        fsimPorcent = f*fsim/100;
        mnaoPorcent = (m*mnao)/100;

        System.out.println("\nPessoas que responderam sim: "+sim);
        System.out.println("Pessoas que responderam não: "+nao);
        //System.out.println("Porcentagem de mulheres que responderam sim: "+fsimPorcent);
        System.out.println("Porcentagem de homens que responderam não: "+mnaoPorcent);

    }
}