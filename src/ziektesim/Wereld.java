package ziektesim;

import java.util.Scanner;

public class Wereld {
    public static int popu;
    public static int gebC;
    
    public static void main (String [] args) {
    int oud=(int) (Math.random()*100);
    System.out.println(oud);
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
