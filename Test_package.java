package College;


import College.Encapsulation_practice;

class Student extends College {

    void display() {

        System.out.println(schoolName);     // ✔ public
        System.out.println(totalStudents); // ✔ protected

        // System.out.println(city);       ❌ default (not accessible)
        // System.out.println(principal);  ❌ private

        showPublic();        // ✔
        showProtected();     // ✔

        // showDefault();    ❌
        // showPrivate();    ❌

        accessPrivate();     // ✔ indirect
    }
}

public class Test_package {

    public static void main(String[] args) {

        Student s = new Student();
        s.display();

        System.out.println("-----");

        School obj = new School();

        System.out.println(obj.schoolName); // ✔ public

        // obj.totalStudents ❌ protected (no subclass here)
        // obj.city ❌ default
        // obj.principal ❌ private

        obj.showPublic();  // ✔
        obj.accessPrivate(); // ✔ indirect
    }
}
public class Test_package {

}
