package com.ivik.students.util;

import com.ivik.students.exam.StudentExamScores;
import com.ivik.students.model.Student;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.util.Arrays;

import java.util.Arrays;

/**
 * Created by Admin on 11-1-2016.
 */
public class SortUtils {

    public static void sortStudents(Student[] students){
        boolean sorted = false;
        while (!sorted){
            sorted = true;
        for(int i = 0; i < students.length -1; i++) {

            if (students[i].getScore() > students[i++].getScore()) {

                Student omdraaien = students[i];
                students[i] = students[i++];
                students[i++] = omdraaien;
                sorted = true;
            }
        }
        }
    }
}
