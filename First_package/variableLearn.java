package First_package;

public class variableLearn {
	
    int sNo;
    String name;
    static String companyName = "Wipro Pvt Ltd";
    
    void showDetails() {      
        String course = "B.Tech";
        System.out.println("Roll No: " + sNo);
        System.out.println("Name: " + name);
        System.out.println("Company Name: " + companyName);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {

        variableLearn s1 = new variableLearn();
        s1.sNo = 1;
        s1.name = "Ashish Shukla";
        variableLearn s2 = new variableLearn();
        s2.sNo = 2;
        s2.name = "Alok Shukla";
        s1.showDetails();
        s2.showDetails();
    }
}

