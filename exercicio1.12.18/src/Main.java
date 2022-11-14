import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double tp1=0, tp2=0, tp3=0; // TEMPO PADRÃO
        ArrayList<Integer> numInsc = new ArrayList<Integer>();
        // ARMAZENAMENTO DOS PONTOS POR ETAPA
        ArrayList<Double> pe1 = new ArrayList<Double>();  
        ArrayList<Double> pe2 = new ArrayList<Double>();
        ArrayList<Double> pe3 = new ArrayList<Double>();
        
        System.out.print("Informe o primeiro tempo padrão: ");      //COLETANDO O TEMPO PADRÃO
        tp1 = reader.nextDouble();
        System.out.print("Informe o segundo tempo padrão: ");
        tp2 = reader.nextDouble();
        System.out.print("Informe o terceiro tempo padrão: ");
        tp3 = reader.nextDouble();

        for (int i=0; i<999999999; i++){
            
            int aux=0;
            System.out.println("\n\n-------------INSCRIÇÃO DAS EQUIPES-------------");
            System.out.print("\nInforme o numero de inscrição ou [9999] pra encerrar: ");
            aux = reader.nextInt();
            if(aux==9999){
                break;
            }else{
                numInsc.add(i,aux);
            }

            double tempo=0;
            double delta=0;

            System.out.print("Informe tempo da primeira etapa: ");
            tempo = reader.nextDouble();

            delta=tempo-tp1;
            if (delta<3){
                pe1.add(i, 100.0);
            }

            if (delta<=5 && delta>=3){
                pe1.add(i, 80.0);
            }
            if (delta>5){
                delta = (delta-5)/5;
                double valor=80-delta;
                pe1.add(i, valor);
            }

            System.out.print("Informe o tempo da segunda etapa: ");
            tempo = reader.nextDouble();

            delta=tempo-tp2;
            if (delta<3){
                pe2.add(i, 100.0);
            }

            if (delta<=5 && delta>=3){
                pe2.add(i, 80.0);
            }
            if (delta>5){
                delta = (delta-5)/5;
                double valor=80-delta;
                pe2.add(i, valor);
            }

            System.out.print("Informe o tempo da terceira etapa: ");
            tempo = reader.nextDouble();

            delta=tempo-tp3;
            if (delta<3){
                pe3.add(i, 100.0);
            }

            if (delta<=5 && delta>=3){
                pe3.add(i, 80.0);
            }
            if (delta>5){
                delta = (delta-5)/5;
                double valor=80-delta;
                pe3.add(i, valor);
            }
        }
        System.out.println("\n\n============RELATÓRIO===============");
        for (int i=0; i<numInsc.size(); i++) {
            System.out.println("\nNúmero de incrição: "+numInsc.get(i));
            System.out.println("Etapa 1: "+pe1.get(i)+" pontos.");
            System.out.println("Etapa 2: "+pe2.get(i)+" pontos.");
            System.out.println("Etapa 3: "+pe3.get(i)+" pontos.");
            System.out.println("Total de pontos: "+(pe1.get(i)+pe2.get(i)+pe3.get(i)));
        }   
        reader.close(); 
    }
}      

// com certeza há maneiras mais simples e bonitas de fazer isso, mas não rolou dessa vez
        
         
          
    