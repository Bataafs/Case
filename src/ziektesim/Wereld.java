package ziektesim;

public class Wereld {
    public static int popu;
    public static int oud;
    
    public static void main (String [] args) {
    //oud=(int) (Math.random()*100);
    Populatie();
        zetLeeftijd();
}
    public static int Populatie() {
        popu= 10000;
        return popu;
    
        
        
 }
    
    
    public static void zetLeeftijd(){
                int[] leeftijd;
        leeftijd= new int[popu];
        int i=0;
         System.out.println(i+"bla"+popu);
        while (i<popu) {
           oud=(int) (Math.random()*100);
            leeftijd[i]= oud;
           System.out.println("leeftijd : "+oud);
           
           
           i++;
        }
    }
}
