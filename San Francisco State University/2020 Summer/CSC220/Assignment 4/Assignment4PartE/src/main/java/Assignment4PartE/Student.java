package Assignment4PartE;

/**
 *
 * Part E
 *
 */

import java.util.*;

public final class Student implements Comparable<Student> {
    private final String firstName;
    private final String lastName;
    private final int ID;
    private final double GPA;
    private final int smallQuestions;
    private final int bigQuestions;
    private static String priority;
    
    public Student(String firstName, String lastName, int ID, double GPA, int smallQuestions, int bigQuestions) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.GPA = GPA;
        this.smallQuestions = smallQuestions;
        this.bigQuestions = bigQuestions;
    }

    public static List<String> getPriorities(){
        List<String> priorities = Arrays.asList("default", "first-name", "last-name", "student-ID", "GPA"
        , "number-of-small-questions", "number-of-big-quetions", "number-of-small-and-big-questions");
        return priorities;
    }
    
    public static void setCompareToPriority(String p){
        priority = p;
    }
   
    @Override
    public int compareTo(Student s) {
        if(priority.equals("first-name"))
            return this.firstName.compareTo(s.firstName);
        if(priority.equals("last-name"))
           return this.lastName.compareTo(s.lastName);
       if(priority.equals("student-ID"))
           return Integer.valueOf(this.ID).compareTo(Integer.valueOf(s.ID));
       if(priority.equals("GPA"))
           return Double.valueOf(this.GPA).compareTo(s.GPA);
       if(priority.equals("number-of-small-questions"))
           return Integer.valueOf(this.smallQuestions).compareTo(s.smallQuestions);
       if(priority.equals("number-of-big-questions"))
           return Integer.valueOf(this.bigQuestions).compareTo(s.bigQuestions);
       if(priority.equals("number-of-small-and-big-questions"))
           return Integer.valueOf(this.smallQuestions + this.bigQuestions).compareTo(s.smallQuestions + s.bigQuestions);
       return 0;
    }
    
    @Override
   public String toString() {
       return "\t\t" + firstName + "\t" + lastName + "\t" + ID + "\t" + String.format("%.2f", GPA) + "\t" + smallQuestions + "\t" + bigQuestions;
   }
}    