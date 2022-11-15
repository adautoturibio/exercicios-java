import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int d, m, a, s;
        double diaSemana;
        String mes;
        String dia = new String();
        

        for(int i=0; i<50; i++){
            System.out.print("\nDia: ");
            d = reader.nextInt();
            System.out.print("Mês: ");
            m = reader.nextInt();
            System.out.print("Os dois primeiros algarismos do ano: ");
            a = reader.nextInt();
            System.out.print("Os dois últimos algarismos do ano: ");
            s = reader.nextInt();

            diaSemana =  (((2.6*m-0.2)/1)+d+a+(a/4)+(s/4)-2*s)%7;
            int diaInt = (int)diaSemana;

            switch (m) {
                case 11:
                    mes = "Janeiro";
                    break;
                case 12:
                    mes = "Fevereiro";
                    break;
                case 1:
                    mes = "Março";
                    break;
                case 2:
                    mes = "Abril";
                    break;
                case 3:
                    mes = "Maio";
                    break;
                case 4:
                    mes = "Junho";
                    break;
                case 5:
                    mes = "Julho";
                    break;
                case 6:
                    mes = "Agosto";
                    break;
                case 7:
                    mes = "Setembro";
                    break;
                case 8:
                    mes = "Outubro";
                    break;
                case 9:
                    mes = "Novembro";
                    break;
                case 10:
                    mes = "Dezembro";
                    break;
            }

            switch (diaInt) {
                case 0:
                    dia = "Domingo";
                    break;
                case 1:
                    dia = "Segunda";
                    break;
                case 2:
                    dia = "Terça";
                    break;
                case 3:
                    dia = "Quarta";
                    break;
                case 4:
                    dia = "Quinta";
                    break;
                case 5:
                    dia = "Sexta";
                    break;
                case 6:
                    dia = "Sábado";
                    break;
            }

            System.out.print("Data: "+d+" "+m+" "+a+""+s);
            System.out.printf("\nDia da semana: "+dia);
            
        }
        
        reader.close(); 
    } 
}      

          
    