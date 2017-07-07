/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ziektesim;

/**
 *
 * @author 010561
 */
public class Epidemie {

    public static void main(String[] args) {

        Wereld wereld = new Wereld();   
        int a;
        wereld.verspreidZiekte(10);
        for (int i=0;i<20;i++){
            System.out.println("Turn : "+i);
            a=wereld.print();
            wereld.runBeurt(4);
        }
        
        a=wereld.print();
        System.out.println("KLAAR");

        
        
        
        
    }
}