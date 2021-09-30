package com.company;

public class Main {

    public static void main(String[] args) {
        Person chelik = new Person( "Виноградов", "Евгений", 20) ;
        System.out.println(chelik );
        Lecturer rudchenko = new Lecturer("Rudchenko","Pavel", 25, "AD", 12000);
        Student chudak = new Student("Chudak","Yaroaslav", 18, "AD-201",23121);
        ClassRoom classRoom = new ClassRoom();

        classRoom.addPupil(chelik);
        classRoom.addPupil(rudchenko);
        classRoom.addPupil(chudak);
        System.out.println(classRoom);
    }
}
