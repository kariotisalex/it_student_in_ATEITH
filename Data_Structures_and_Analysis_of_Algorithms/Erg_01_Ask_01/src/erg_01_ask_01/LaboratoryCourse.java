package erg_01_ask_01;

public class LaboratoryCourse {
    private String nameOfLab;
    private Lab[] aListOfLabs;
    //private int realNumberOfLabs = 0;
    
    
    public LaboratoryCourse(String nameOfLab, int rangeOfLabs) {
        this.nameOfLab = nameOfLab;
        aListOfLabs = new Lab[(rangeOfLabs - 1)];
    }
    
//Εκτυπωνει τον συνολικο αριθμο των φοιτητων που παρακολουθουν το μαθημα
    public Student[] plithosFoititon(){
        
    //Δηλωση προσωρινων μεταβλητων και αρχικοποιηση
      //Μεταβλητη που θα καθορίσει το μέγεθος του επιστρεφόμενου πινακα
        int sizeOfArray = 0;
        
    //Συνολικο πληθος φοιτητων απο ολα τα εργαστηρια 
    //του μαθηματος για την δημιουργία θεσεων του πινακα
        for(int i = 0; i < aListOfLabs.length ;i++){
            sizeOfArray += aListOfLabs[i].getRealNumberOfStundents();
        }
        
    //Επιστρεφόμενος πινακας
        Student[] returnList = new Student[sizeOfArray];
        
    //Δηλωση προσωρινων μεταβλητων
        //Μεταβλητη για να γεμίσει ο επιστρεφομενος πινακας ομοιομορφα
        int tempCounter = 0;
        //Προσωρινος πίνακας φοιτητων για τον ευκολο χειρισμό του κληθέντος πίνακα φοιτητων
        Student[] tempList;
        
    //Οι λίστες των φοιτητων απο ολα τα εργαστήρια αθροιζονται σε μια λιστα 
        for(int i = 0; i < aListOfLabs.length;i++){
        //Μεταβιβαση κάθε λίστας φοιτητων σε προσωρινο πινακα
            tempList = aListOfLabs[i].getaListOfStudent();
        //Καθε πίνακας φοιτητων γεμιζει το μεγάλο επιστρεφόμενο πίνακα
            for(int y = 0; y < tempList.length; y++){
                returnList[tempCounter] = tempList[y];
                tempCounter++;
            }
        }
    //Επιστρέφει τον μεγάλο πίνακα των φοιτητων
        return returnList;
    }
    
//Μεθοδος που εκτυπωνει στην οθονη τους φοιτητες που πετυχαν ή απετυχαν
    public void petyxanApetyxan(){
        System.out.println(" Οι φοιτητες που απετυχαν ειναι: ");
    //Χρησιμοποιουνται οι μεθοδοι που ηδη υπαρχουν και επιστρεφουν την λιστα των επιτυχοντων και αυτων που απετυχαν της κλασης Lab
        for(int i = 0; i < aListOfLabs.length; i++){
            for(int y = 0; y < aListOfLabs[i].Apotyximenoi().length; y++)
                System.out.println(aListOfLabs[i].Apotyximenoi()[y].getName() + aListOfLabs[i].Apotyximenoi()[y].getSurname());
        }
        
        System.out.println(" Οι φοιτητες που πετυχαν ειναι: ");
        for(int i = 0; i < aListOfLabs.length; i++){
            for(int y = 0; y < aListOfLabs[i].Epytuxontes().length; y++)
                System.out.println(aListOfLabs[i].Epytuxontes()[y].getName() + aListOfLabs[i].Epytuxontes()[y].getSurname());
            }
        }
    
    
    public void posostoEpityxias(){
             //Δηλωση προσωρινων μεταβλητων και αρχικοποιηση
        int size = 0;
        int apotyximenoi = 0;
        int epityximenoi = 0;
        
     //Συνολικο πληθος φοιτητων απο ολα τα εργαστηρια 
        for(int i = 0; i < aListOfLabs.length ;i++){
            size += aListOfLabs[i].getRealNumberOfStundents();
        }
        for(int i = 0; i < aListOfLabs.length; i++){
            for(int y = 0; y < aListOfLabs[i].Apotyximenoi().length; y++)
                apotyximenoi++;
        }
        
        for(int i = 0; i < aListOfLabs.length; i++)
            for(int y = 0; y < aListOfLabs[i].Epytuxontes().length; y++)
                epityximenoi++;
        
        System.out.println("Το ποσοστο επιτυχίας ειναι: " + epityximenoi / size + " %");
        System.out.println("Το ποσοστο αποτυχίας ειναι: " + apotyximenoi / size + " %");
    }
        
        
        
    
}

                
                
        
    
        
    
