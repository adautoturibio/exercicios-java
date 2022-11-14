import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> mulheres = new ArrayList<Integer>();
        int loop = 1,  numInsc=0, idade=0,m=0, m45=0, menorIdade=500;
        char sexo, exp;

        while(loop==1){


            System.out.print("\nInforme o numero de inscrição ou 0 para encerrar: ");
            numInsc = reader.nextInt();
            if (numInsc==0){ // ENCERRANDO LAÇO CASO RECEBA 0
                loop=0;
                break;
            }
            System.out.print("Informe sua idade: ");
            idade = reader.nextInt();
            System.out.print("Informe seu sexo (m/f): ");
            sexo = reader.next().charAt(0);
            
            if (sexo=='m'){
                m++;
            }
            
            if (idade>45 && sexo =='m'){
                m45++;
            }
            System.out.print("Tem experiência (s/n)? ");
            exp = reader.next().charAt(0);
            if(idade<35 && sexo=='f' && exp =='s' ){
                mulheres.add(numInsc);
            }

            if (sexo=='f' && exp=='s' && idade<menorIdade){
                menorIdade=idade;
            }
        }

        // PREVENÇÕES CASO AS CONDIÇÕES NÃO SEJAM ATENDIDAS
        if (m45!=0){ 
            System.out.println("\nIdade média dos homens com mais de 45 anos: "+((m45*100)/m)); //IMPRIMINDO JA CALCULANDO A MEDIA
        }else{
            System.out.println("\nNão há homens com mais de 45 anos inscritos.");
        }
        if(menorIdade!=500){ // 500 PORQUE FOI O VALOR INICIAL DEFINIDO PARA menorIdade
            System.out.println("Menor idade entre mulheres que já tem experiência no serviço: "+menorIdade+" anos");
        } else{
            System.out.println("Não há mulheres com experiencia no serviço.");
        }
        if (mulheres.isEmpty()==true){
            System.out.println("Não há mulheres com menos de 35 anos e com experiência.");
        }else{
            System.out.println("Número de inscrição de mulheres que têm idade inferior a 35 anos e com experiência no serviço: ");
             for (int i = 0; i < mulheres.size(); i++){
                System.out.println(mulheres.get(i));
            }
        }

        reader.close(); 
    }
}       
        
         
          
    