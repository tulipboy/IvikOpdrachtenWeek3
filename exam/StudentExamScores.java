package com.ivik.students.exam;

import com.ivik.students.model.Student;
import com.ivik.students.util.SortUtils;
/**
 * Created by Admin on 12-1-2016.
 */
public class StudentExamScores {

    private Student[] students = new Student[6];

    public StudentExamScores(){
        initExamScores();
    }

        private void initExamScores() {
            Student student1 = new Student("ruud", 55.6);
            Student student2 = new Student("arjen", 12.5);
            Student student3 = new Student("frank", 58.6);
            Student student4 = new Student("karel", 19.5);
            Student student5 = new Student("john", 45.6);
            Student student6 = new Student("piet", 35.5);
// voeg toe in students array
                    students = new Student[]{student1,student2 , student3, student4, student5, student6 };
        }



    public void reportStudentScores() {
        SortUtils.sortStudents(students);
        System.out.println("Naam: " + "\t\t" + "Score ");
        System.out.println("------ " + "\t\t" + "----- ");
        for (Student i : students) {
            System.out.println(i.getName() + "\t\t" + i.getScore());
        }
    }

    public static void main(String[] args) {
        new StudentExamScores().reportStudentScores();
    }

}
