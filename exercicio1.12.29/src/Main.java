public class Main {
    public static void main(String[] args) {
        
        double s=0;

        for (int i=10; i<41;i++){
            int numerador =  480;
            double a1 = numerador/i;
            if (i%2==0){
                s += a1;
            } else{
                s -= a1;
            }
            numerador -= 5;
        }
        System.out.println("S = "+s);
        
    }   
}      

          
    