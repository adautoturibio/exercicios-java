public class Main {
    public static void main(String[] args) {
        
        double s=0;

        for (int i=1; i<51;i++){
            int numerador =  1000;
            double a1 = numerador/i;
            if (i%2!=0){
                s += a1;
            } else{
                s -= a1;
            }
            numerador -= 3;
        }

        System.out.println("S = "+s);
        
    }   
}      

          
    