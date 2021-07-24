package com.matheuscordeiro.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String args[]){

        Map<String, String> students = new HashMap<>();

        students.put("Name", "João");
        students.put("Age", "17");
        students.put("average", "8.5");
        students.put("Class", "3a");

        System.out.println(students);

        System.out.println(students.keySet());

        List<Map<String, String>> listStudents = new ArrayList<>();

        listStudents.add(students);

        Map<String, String> students2 = new HashMap<>();

        students2.put("Name", "Maria");
        students2.put("Age", "18");
        students2.put("Average", "8.9");
        students2.put("Class", "3b");

        listStudents.add(students2);

        System.out.println(listStudents);

        System.out.println(students.containsKey("Name"));
    }

}
