public class Main {
    public static void main(String[] args) {
        
        double s=0;

        for (int i=1; i<11;i++){
            double aux = i*i;
            double a1 = i/aux;
            if (i%2!=0){
                s += a1;
            } else{
                s -= a1;
            }
        }

        System.out.println("S = "+s);
        
    }   
}      

          
    