package Encapsulation_practice;

public class School {

    public String schoolName = "ABC School";   // public
    protected int totalStudents = 500;         // protected
    String city = "Delhi";                     // default
    private String principal = "Mr. Sharma";   // private

    public void showPublic() {
        System.out.println("Public: " + schoolName);
    }

    protected void showProtected() {
        System.out.println("Protected: " + totalStudents);
    }

    void showDefault() {
        System.out.println("Default: " + city);
    }

    private void showPrivate() {
        System.out.println("Private: " + principal);
    }

    public void accessPrivate() {
        showPrivate(); // indirect access
    }
}
