package ziektesim;

public class Wereld {
    public static int popu;
    public static int[] leeftijd;
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
        leeftijd= new int[popu];
        int i=0;
        while (i<popu) {
           oud=(int) (Math.random()*100);
            leeftijd[i]= oud;
           i++;
        }
    }
}
