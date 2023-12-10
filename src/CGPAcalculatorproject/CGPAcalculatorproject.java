/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CGPAcalculatorproject;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CGPAcalculatorproject {

    /**
     * @param args the command line arguments
     */
    public String getGrade(double score) {
        String grade = "";
        if (score >= 70 && score <= 100) {
            grade = "A";
        } else if (score >= 60 && score <= 69) {
            grade = "B";
        } else if (score >= 50 && score <= 59) {
            grade = "C";
        } else if (score >= 40 && score <= 49) {
            grade = "D";
        } else{
            grade = "F";
        }
        return grade;
    }
    
    public int getPoint(String grade) {
        int point = 0;
        switch (grade) {
            case "A":
                point = 5;
                break;
            case "B":
                point = 4;
                break;
            case "C":
                point = 3;
                break;
            case "D":
                point = 2;
                break;
            case "F":
                point = 1;
                break;
        }
        return point;
    }
    
 public void displayRecord(String courseCode, int courseUnit, int score, String grade) {

        System.out.printf("|%-15s|%-15s|%-12s|%-10s|\n", courseCode, courseUnit, score, grade);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("GPA CALCULATOR");

        Scanner i = new Scanner(System.in);
        
        //-------------first course------------------

        System.out.println("Enter Course 1: ");
        String course1 = i.nextLine();
       

        System.out.println("Enter " + course1 + " grade: ");
        int gradeUnit1 = i.nextInt();

        System.out.println("Enter " + course1 + " score: ");
        int score1 = i.nextInt();
        i.nextLine();

        //-------------second course------------------------
        
        System.out.println("Enter Course 2: ");
        String course2 = i.nextLine();

        System.out.println("Enter " + course2 + " grade: ");
        int gradeUnit2 = i.nextInt();

        System.out.println("Enter " + course2 + " score: ");
        int score2 = i.nextInt();

        i.nextLine();
        //------------third course--------------------------
        
        System.out.println("Enter Course 3: ");
        String course3 = i.nextLine();

        System.out.println("Enter " + course3 + " grade: ");
        int gradeUnit3 = i.nextInt();

        System.out.println("Enter " + course3 + " score: ");
        int score3 = i.nextInt();

        i.nextLine();

        //--------fourth course------------------------------
        
        System.out.println("Enter Course 4: ");
        String course4 = i.nextLine();
        

        System.out.println("Enter " + course4 + " grade: ");
        int gradeUnit4 = i.nextInt();

        System.out.println("Enter " + course4 + " score: ");
        int score4 = i.nextInt();

        i.nextLine();

        //-------------fifth course--------------------------
        
        System.out.println("Enter Course 5: ");
        String course5 = i.nextLine();

        System.out.println("Enter " + course5 + " grade: ");
        int gradeUnit5 = i.nextInt();

        System.out.println("Enter " + course5 + " score: ");
        int score5 = i.nextInt();

        i.nextLine();

        CGPAcalculatorproject st = new CGPAcalculatorproject();
        
        //GRADES

        String grade1 = st.getGrade(score1);
        String grade2 = st.getGrade(score2);
        String grade3 = st.getGrade(score3);
        String grade4 = st.getGrade(score4);
        String grade5 = st.getGrade(score5);
        
        //POINTS

        int point1 = st.getPoint(grade1);
        int point2 = st.getPoint(grade2);
        int point3 = st.getPoint(grade3);
        int point4 = st.getPoint(grade4);
        int point5 = st.getPoint(grade5);
        
        //TOTAL GRADE UNIT
        
        int totalGradeUnit=point1+point2+point3+point4+point5;
        
        //TOTAL QUALITY POINT
        
        int totalQualityPoint = gradeUnit1*point1;
            totalQualityPoint += gradeUnit2*point2;
            totalQualityPoint += gradeUnit3*point3;
            totalQualityPoint += gradeUnit4*point4;
            totalQualityPoint += gradeUnit5*point5;
            
        double cgpa =(double)totalQualityPoint/totalGradeUnit;
        
        
            
        System.out.println("|---------------|---------------|------------|----------|");
        System.out.printf("|%-15s|%-15s|%-12s|%-10s|\n", "COURSE & CODE", "COURSE UNIT", "SCORE", " GRADE");
        System.out.println("|---------------|---------------|------------|----------|");
        
            
            
        st.displayRecord(course1, gradeUnit1, score1, grade1);
        st.displayRecord(course2, gradeUnit2, score2, grade2);
        st.displayRecord(course3, gradeUnit3, score3, grade3);
        st.displayRecord(course4, gradeUnit4, score4, grade4);
        st.displayRecord(course5, gradeUnit5, score5, grade5);
        
        System.out.printf("CGPA is: %.2f%n", cgpa);
        


            
            
            
                    
    }

}
