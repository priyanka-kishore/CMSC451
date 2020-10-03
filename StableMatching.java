import java.util.ArrayList;
import java.util.HashMap;

public class StableMatching {

    public class Company {
        public ArrayList<String> studentRanks;
        public String name;
        public boolean isEngaged;

        public Company(String name, ArrayList<String> studentRanks) {
            this.name = name;
            this.studentRanks = studentRanks;
            isEngaged = false;
        }
    }

    public class Student {
        public ArrayList<String> companyRanks;
        public String name;
        public boolean isEngaged;

        public Student(String name, ArrayList<String> companyRanks) {
            this.name = name;
            this.companyRanks = companyRanks;
            isEngaged = false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello Stable Matching!");
        
    }

    public HashMap<Student, Company> startGSAlgorithm() {
        HashMap<Student, Company> matches = new HashMap<>();

        return matches;
    } 

}