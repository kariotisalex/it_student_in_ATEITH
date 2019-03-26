
package erg_02_ask_01;

public class Erg_02_Ask_01 {

    public static void main(String[] args) {
        
        Student s1 = new Student(17001, "Aliki", "Giannopoulou", 18, 'f', 0, 5);
        Student s2 = new Student(17002, "Thomas", "Marinos", 18, 'f', 0, 5);
        Student s3 = new Student(17003, "Evridiki", "Xanthopoulou", 18, 'f', 0, 5);
        Student s4 = new Student(17004, "Demetrios", "Floros", 18, 'f', 0, 5);
        Student s5 = new Student(17005, "Vlassis", "Ioannidis", 18, 'f', 0, 5);
        
        
        ArrayStack as = new ArrayStack(5);
        
        as.size();
        
        as.push((Student) s1);
        as.push(s2);
        
        as.isEmpty();
        
        as.isFull();
        
        as.pop();


    }

}
