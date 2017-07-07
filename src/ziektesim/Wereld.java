package ziektesim;

public class Wereld {
    public static int popu;
    public static int[] leeftijd;
    public static int oud;
    Ziekte ziekteA;
    Persoon[] personen;
    
    public static void main (String [] args) {
    //oud=(int) (Math.random()*100);
    Populatie();
    zetLeeftijd();
}
    public Wereld(){
        int percVaccineerd=65;
        Populatie();
        ziekteA=new ziektesim.Ziekte(50, 50, 50);
        personen=new Persoon[popu];
        
        for(int i=0; i<(popu); i++){
            personen[i]=new Persoon(percVaccineerd);
        }
    }
    
    public static int Populatie() {
        popu= 10000;
        return popu;     
 }
    public int print(){
        int statusA=0;
        int statusB=0;
        int statusC=0;
        for(int i=0; i<(popu); i++){
             // System.out.println(i+" "+personen[i].print());
            if (personen[i].getStatus() == 0) {
                statusA++;
            } else if (personen[i].getStatus() == 1) {
                statusB++;
            } else {
                statusC++;
            }  
         }
        
      System.out.println("S : "+statusA+" I : "+statusB+" R : "+statusC);
     return 0;
    }
    public void verspreidZiekte (int numGeinfecteerd){
        int randomInt;
        System.out.println("De volgende personen zijn geïnfecteerd");
        for (int i=0; i<numGeinfecteerd;i++){
            randomInt = (int) (1+(Math.random()*popu));
            if (personen[randomInt].getStatus()==2){
            } else {
                personen[randomInt].maakStatus(1);
            } //System.out.println(randomInt+" "+personen[randomInt].print());
        } print();
    }
    
    public void runBeurt(int numContact){
        for (int i=0;i<popu;i++){
            if (personen[i].getStatus()==1){
                personen[i].resistentiecounter++;
                if (personen[i].resistentiecounter==3){
                    personen[i].maakStatus(2);
                }
            }
        }
        for (int j=0;j<popu;j++){
            if (personen[j].getStatus()==1){
                verspreidZiekte(numContact);
            }
        }
    }
    
    public void probleemCode(){
        Persoon[] Personen = new Persoon[popu];
        int randomNum;
        for (int j=0;j<(popu);j++){
            randomNum= (int) (1+(Math.random()*100));
            if(randomNum<30){
                if ((Personen[j].Statuss).equals("I")){
                    Personen[j].Statuss="R";
                }
            }
        }
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
