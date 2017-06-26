package ziektesim;

public class Persoon { 
    
    public int leeftijd;
        
        int status;
        int resistentiecounter;
        public String Statuss;
        
        public Persoon (int percVaccineerd) {
            int randomGetal= (int) (Math.random()*100);
            if (randomGetal>(100-percVaccineerd)){
                status=2;
            } else {
                status=0;
        }
        resistentiecounter=0;
        
    }
    
    public void maakStatus(int statusGetal){
        status=statusGetal;
    }
    public int getStatus(){
        return status;
    }
    public String print(){
        return "Persoon met status "+status;
    }
}
