import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        float massaI = 0;
        float massaF = 0;
        int hr=0, min=0, seg=0;

        System.out.print("Informe a masssa inicial do material, em gramas: ");
        massaI = reader.nextFloat();
        massaF = massaI;

        do{
            massaF = massaF/2;
            seg += 50;
        } while (massaF>0.5);

        min = seg/60;
        hr = min/60;


        if (min<0){
            min=0;
        }
        if (hr<0){
            hr=0;
        }

        do{
            if (seg>60){
                seg = Math.round(seg/60);
            }
        } while(seg>60);
        do{
            if (min>60){
                min = Math.round(min/60);
            }
        } while(min>60);
        
        System.out.println("Massa inicial: "+massaI);
        System.out.println("Massa final: "+massaF);
        System.out.println("Tempo: "+hr+" horas, "+min+" minutos e "+seg+" segundos.");
        
        reader.close();
    }
}

