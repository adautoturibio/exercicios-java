import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int canal=0, pessoas=0, total=0, c4=0, c5=0, c7=0, c12=0;

        System.out.println("============= Pesquisa de audiência de TV =============");

        do {
           

            System.out.print("\nA TV está ligada?[s/n]: ");
            char tv = reader.next().charAt(0);

            if(tv == 's'){

                System.out.printf("Quantas pessoas estão assistindo TV: ");
                pessoas = reader.nextInt();
                total = pessoas + total;

                System.out.print("Qual canal: ");
                canal = reader.nextInt();


                switch (canal) {
                    case 4:
                        c4 = pessoas;
                    case 5:
                        c5 = pessoas;
                    case 7:
                        c7 = pessoas;
                    case 12:
                        c12 = pessoas;
                }


            } if (tv == 'n'){}
            if (tv!='s' && tv!='n'){
                System.out.println("\nResposta inválida!");
                break;
            }

        } while (canal!=0);

        c4 = c4*100/total;
        c4 = c5*100/total;
        c4 = c7*100/total;
        c4 = c12*100/total;
        

        System.out.println("\nCanal 4: "+c4+"%");
        System.out.println("\nCanal 5: "+c5+"%");
        System.out.println("\nCanal 7: "+c7+"%");
        System.out.println("\nCanal 12: "+c12+"%");
        
        reader.close();

    }
}