package erg_03_ask_01;

public class Erg_03_Ask_01 {

   
    public static void main(String[] args) {
        Student s1 = new Student(18001, "Nikos", "Papadopoulos", 18, 'A', 0, 8);
        Student s2 = new Student(18002, "Petros", "Mitropoylos", 21, 'A', 0, 7);
        Student s3 = new Student(18003, "Manos", "Kisoudis", 20, 'A', 0, 6);
        Student s4 = new Student(18004, "Takis", "Politis", 19, 'A', 0, 5);
        Student s5 = new Student(18005, "Giorgos", "Soutoglou", 20, 'A', 0, 4);
        Student s6 = new Student(18006, "Dimitris", "Adamidis", 19, 'A', 0, 1);
        Student s7 = new Student(18007, "Mitsos", "Belonidis", 20, 'A', 0, 2);
        Student s8 = new Student(18008, "Panagiotis", "Drouzas", 22, 'A', 7, 7);
        Student s9 = new Student(18009, "Anna", "Panagiotopoyloy", 20, 'G', 0, 1);
        Student s10 = new Student(18010, "Aliki", "Dimitriadoy", 19, 'G', 0, 1);
       
        
        ArrayQueue aQ = new ArrayQueue(6);
        
        //System.out.println("last: " + aQ.getLast() + "\nfirst: "+ aQ.getFirst());        
        aQ.add(s1);
        //System.out.println("last: " + aQ.getLast() + "\nfirst: "+ aQ.getFirst());
        aQ.add(s1);
        //System.out.println("last: " + aQ.getLast() + "\nfirst: "+ aQ.getFirst());
        aQ.add(s1);
        //System.out.println("last: " + aQ.getLast() + "\nfirst: "+ aQ.getFirst());
        aQ.add(s1);
        //System.out.println("last: " + aQ.getLast() + "\nfirst: "+ aQ.getFirst());
        aQ.add(s1);
        //System.out.println("last: " + aQ.getLast() + "\nfirst: "+ aQ.getFirst());
        aQ.add(s1);
        //System.out.println("last: " + aQ.getLast() + "\nfirst: "+ aQ.getFirst());
        aQ.add(s1);
        //System.out.println("last: " + aQ.getLast() + "\nfirst: "+ aQ.getFirst());
        
        
        
        System.out.println(aQ.size());
        System.out.println(aQ.isEmpty());
        System.out.println(aQ.isFull());

        System.out.println(aQ.front());
        System.out.println(aQ.remove());
        
        
    }

}
