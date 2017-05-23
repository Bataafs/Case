package ziektesim;

import java.util.Scanner;

public class Wereld {
    public static int popu;
    public static int gebC;
    
    public static void main (String [] args) {
    
}
    public static int Populatie() {
        popu= (10000*gebC);
        return popu;
    
}
    public static int GebCijfer() {
    Scanner input = new Scanner(System.in);
    gebC=input.nextInt();
    return gebC;
    }
}
