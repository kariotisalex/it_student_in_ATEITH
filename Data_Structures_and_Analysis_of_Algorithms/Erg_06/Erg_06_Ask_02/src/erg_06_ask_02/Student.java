
package erg_06_ask_02;


public class Student {
    private int aMF;
    private String name;
    private String surname;
    private double age;
    private char gender;
    private int arithmosApoysion;
    private double vathmos;

    public Student(int aMF, String name, String surname, double age, char gender, int arithmosApoysion, double vathmos) {
        this.aMF = aMF;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.arithmosApoysion = arithmosApoysion;
        this.vathmos = vathmos;
    }

    public void EmfanisiFoititi(){
        System.out.println("Aριθμός μητρώου φοιτητή: " + aMF);
        System.out.println("Oνομα: " + name);
        System.out.println("Eπίθετο: " + surname);
        System.out.println("Hλικία: " + age);
        System.out.println("Fύλο: " + gender);
        System.out.println("Aριθμός απουσιών στο μάθημα: " + arithmosApoysion);
        System.out.println("Bαθμός: " + vathmos);
        
    }

    public int getaMF() {
        return aMF;
    }

    public void setaMF(int aMF) {
        this.aMF = aMF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getArithmosApoysion() {
        return arithmosApoysion;
    }

    public void setArithmosApoysion(int arithmosApoysion) {
        this.arithmosApoysion = arithmosApoysion;
    }

    public double getVathmos() {
        return vathmos;
    }

    public void setVathmos(double vathmos) {
        this.vathmos = vathmos;
    }    
}
