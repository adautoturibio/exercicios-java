import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<Double> t20 = new ArrayList<Double>();
        ArrayList<Double> t30 = new ArrayList<Double>();
        ArrayList<Double> t40 = new ArrayList<Double>();
        ArrayList<Double> t50 = new ArrayList<Double>();
        ArrayList<Double> t60 = new ArrayList<Double>();
        ArrayList<Double> t70 = new ArrayList<Double>();
        ArrayList<Double> t80 = new ArrayList<Double>();
        ArrayList<Integer> marcoA = new ArrayList<Integer>();
        ArrayList<Integer> marcoB = new ArrayList<Integer>();
        int cA=0, cB=0;

        for (int i = 0; i<9000000; i++){

            System.out.print("\nInforme o km da cidade A: ");
            cA = reader.nextInt();
            
            System.out.print("Informe o km da cidade B: ");
            cB = reader.nextInt();

            if (cA == cB){
                break;
            }
            marcoA.add(cA);
            marcoB.add(cB);

            int e = cB-cA;

            for (int v=20; v<81; v+=10){
                
                double t = e/v;
                
                if (v==20){
                    t20.add(t);
                }  
                if (v==30){
                    t30.add(t);
                }  
                if (v==40){
                    t40.add(t);
                }  
                if (v==50){
                    t50.add(t);
                }  
                if (v==60){
                    t60.add(t);
                }  
                if (v==70){
                    t70.add(t);
                }  
                if (v==80){
                    t80.add(t);
                }  
            }
        }

        for (int i=0; i<marcoA.size(); i++){
            System.out.println("---------------------------------------");
            if (t20.get(i)>2){
                System.out.println("\nCidade A: "+marcoA.get(i));
                System.out.println("Cidade B: "+marcoB.get(i));
                System.out.println("Velocidade 20Km/h");
                System.out.println("Tempo: "+t20.get(i)+" horas");
            }
            if (t30.get(i)>2){
                System.out.println("\nCidade A: "+marcoA.get(i));
                System.out.println("Cidade B: "+marcoB.get(i));
                System.out.println("Velocidade 30Km/h");
                System.out.println("Tempo: "+t30.get(i)+" horas");
            }
            if (t40.get(i)>2){
                System.out.println("\nCidade A: "+marcoA.get(i));
                System.out.println("Cidade B: "+marcoB.get(i));
                System.out.println("Velocidade 40Km/h");
                System.out.println("Tempo: "+t40.get(i)+" horas");
            }
            if (t50.get(i)>2){
                System.out.println("\nCidade A: "+marcoA.get(i));
                System.out.println("Cidade B: "+marcoB.get(i));
                System.out.println("Velocidade 50Km/h");
                System.out.println("Tempo: "+t50.get(i)+" horas");
            }
            if (t60.get(i)>2){
                System.out.println("\nCidade A: "+marcoA.get(i));
                System.out.println("Cidade B: "+marcoB.get(i));
                System.out.println("Velocidade 60Km/h");
                System.out.println("Tempo: "+t60.get(i)+" horas");
            }
            if (t70.get(i)>2){
                System.out.println("\nCidade A: "+marcoA.get(i));
                System.out.println("Cidade B: "+marcoB.get(i));
                System.out.println("Velocidade 70Km/h");
                System.out.println("Tempo: "+t70.get(i)+" horas");
            }
            if (t80.get(i)>2){
                System.out.println("\nCidade A: "+marcoA.get(i));
                System.out.println("Cidade B: "+marcoB.get(i));
                System.out.println("Velocidade 80Km/h");
                System.out.println("Tempo: "+t80.get(i)+" horas");
            }
        }   

        reader.close();
    }
}