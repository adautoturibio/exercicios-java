public class Main {

    public static void main(String[] args) {

    int despesa=200, vendas=120;
    float ingresso=5;
    float lucro =(ingresso*vendas)-despesa;;

    for(;ingresso>0.5;){
        System.out.println("\n------------------------------");
        System.out.println("--Preço do ingresso: "+ingresso);
        System.out.println("--Ingressos vendidos: "+vendas);
        System.out.println("--Lucro: "+lucro);

        vendas+=26;
        ingresso-=0.5;
        lucro+=26*ingresso;
    }
        
    }
}       
        
         
          
    