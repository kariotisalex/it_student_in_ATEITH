
package erg_06_ask_01;

public class Erg_06_Ask_01 {

    public static void main(String[] args) {
        
        Student s1 = new Student(17001, "Aliki", "Giannopoulou", 18, 'f', 0, 5);
        Student s2 = new Student(17002, "Thomas", "Marinos", 18, 'f', 0, 5);
        Student s3 = new Student(17003, "Evridiki", "Xanthopoulou", 18, 'f', 0, 5);
        Student s4 = new Student(17004, "Demetrios", "Floros", 18, 'f', 0, 5);
        Student s5 = new Student(17005, "Vlassis", "Ioannidis", 18, 'f', 0, 5);
        
        DoubleLinkedList dll = new DoubleLinkedList();
        
        dll.insertLast(s1);
        dll.insertLast(s1);

        
        
        

    }

}
