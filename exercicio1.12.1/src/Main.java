import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in); //criação do objeto para ler teclado

        int idade = 0;
        int nova_idade;
        int n = 0;
        double media = 0;
  
        do{
            System.out.print("Digite a idade de um indivíduo: ");
            nova_idade = reader.nextInt(); //entrada padrão. captura o que foi digitado no eclado pelo usuário
            if (nova_idade != 0){
                idade = idade + nova_idade;
                ++ n; 
                media = idade/n;
            }else{}

        } while (nova_idade != 0);{
            System.out.println("A media de idades é: " +media);
        } 
        reader.close();

    }
}