
package erg_01_ask_01;

public class Lab {
     private String name;
     private Student[] aListOfStudent;
     private int realNumberOfStundents = 0;
     

    public Lab(String name) {
        this.name = name;
        aListOfStudent = new Student[25];
    }
     
//Εισαγωγη φοιτητων σε λιστα του μαθηματος
    public void EisagwgiFoititwn(Student aStudent){
        aListOfStudent[realNumberOfStundents] = aStudent;
        realNumberOfStundents++;
    }
    
//Διαγραφη φοιτητων απο την λιστα του μαθηματος
    public boolean DiagrafiFoititi(Student aStudent){
        for(int i = 0; i <= realNumberOfStundents; i++){
            if(aListOfStudent[i].equals(aStudent)){
                aListOfStudent[i] = aListOfStudent[realNumberOfStundents];
                realNumberOfStundents -= 1;
                return true;
            }
        }
        return false;
    }
    
//Αναζητηση φοιτητη
    public boolean AnazitisiFoititi(int aMF){
        for(int i = 0; i <= realNumberOfStundents; i++){
            if(aListOfStudent[i].getaMF() == aMF){
                return true;
            }
        }
     return false;
    }
    
    //Εκτύπωση παρουσιολογίου
    public void EktypwshParousiologioy(){
        for(int i = 0; i <= realNumberOfStundents; i++){
            System.out.println("Ονοματεπώνυμο: " + aListOfStudent[i].getName() + " " + aListOfStudent[i].getSurname());
            System.out.println("AEM: " + aListOfStudent[i].getaMF());
            System.out.println("------------------");
        }
    }
    
//Βρισκει και επιστρεφει το πληθος των φοιτητων που πετυχαν στο μαθημα
    public Student[] Epytuxontes(){
        int holder = 0;
        
        //ευρεση θέσεων επιστρεφόμενου πινακα
        for(int i = 0; i < realNumberOfStundents; i++){
            if(aListOfStudent[i].getVathmos() >= 5){
                holder += 1;
            }
        }
        //Δημιουργια του πινακα με τους επιτυχοντες φοιτητες
        Student[] epitFoit = new Student[holder];
        int arrayCapacity = 0;
        
        for(int i = 0; i < realNumberOfStundents; i++){
            if(aListOfStudent[i].getVathmos() >= 5){
                epitFoit[arrayCapacity] = aListOfStudent[i];
                arrayCapacity++;
            }
        }
        return epitFoit;
    }
//Βρισκει και επιστρεφει το πληθος των φοιτητων που απετυχαν στο μαθημα
    public Student[] Apotyximenoi(){
        int holder = 0;
        
        //ευρεση θέσεων επιστρεφόμενου πινακα
        for(int i = 0; i < realNumberOfStundents; i++){
            if(aListOfStudent[i].getVathmos() < 5){
                holder += 1;
            }
        }
        //Δημιουργια του πινακα με τους φοιτητες που απετυχαν
        Student[] apotFoit = new Student[holder];
        int arrayCapacity = 0;
        
        for(int i = 0; i < realNumberOfStundents; i++){
            if(aListOfStudent[i].getVathmos() < 5){
                apotFoit[arrayCapacity] = aListOfStudent[i];
                arrayCapacity++;
            }
        }
        return apotFoit;
    }
    
//Βρισκει τον μεσο ορο της βαθμολογιας
    public int mesosOros(){
        int holder = 0;
        
        for(int i = 0; i < realNumberOfStundents; i++){
            holder += aListOfStudent[i].getVathmos();
        }
        return (  holder / (realNumberOfStundents + 1)  );
        
    }  

    public int getRealNumberOfStundents() {
        return realNumberOfStundents;
    }

    public Student[] getaListOfStudent() {
        return aListOfStudent;
    }
        
        
    
}