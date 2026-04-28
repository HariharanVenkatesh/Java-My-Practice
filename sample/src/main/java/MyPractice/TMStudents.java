package MyPractice;

import java.util.*;

// TreeMap Example

class Students {
    int rollno;
    String studentName, studentAddress;


    public Students(int rollno, String studentName, String studentAddress) {
        this.rollno = rollno;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public String toString() {
        return rollno + " " + studentName + " " + studentAddress;
    }
}

class SortByRoll implements Comparator<Students> {
    public int compare(Students a, Students b) {
        return a.rollno - b.rollno;
    }
}

public class TMStudents {
    public static void main(String[] args) {

        TreeMap<Students, Integer> stm = new TreeMap<>(new SortByRoll());

        stm.put(new Students(101, "Hariharan", "Ooty"), 1);
        stm.put(new Students(103, "Ashwin", "kandhal"), 2);
        stm.put(new Students(102, "Caleb", "Coimbatore"), 3);

        System.out.println("Sorted by Roll no: " + stm);
    }
}