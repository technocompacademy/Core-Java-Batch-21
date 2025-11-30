package com.tca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.tca.comparators.NameAscendingComparator;
import com.tca.comparators.NameDescendingComparator;
import com.tca.comparators.PercentageAscendingComparator;
import com.tca.comparators.PercentageDescendingComparator;
import com.tca.comparators.RollNumberAscendingComparator;
import com.tca.comparators.RollNumberDescendingComparator;
import com.tca.entities.Student;

public class Demo
{
    public static void main(String[] args) 
    {
       
        Student s1 = new Student(103,"Sachin",80);
        Student s2 = new Student(101,"Vijay", 90);
        Student s3 = new Student(102,"Ajay", 40);
               
        List<Student> L = new ArrayList<>();
        L.add(s1);
        L.add(s2);
        L.add(s3);
        
        System.out.println("List of Students Before Sort : "+ L); 
        
        Collections.sort(L, new RollNumberAscendingComparator());
        System.out.println("Ascending Roll number wise : "+ L); 

        Collections.sort(L, new RollNumberDescendingComparator());
        System.out.println("Descending Roll number wise : "+ L); 

        Collections.sort(L, new NameAscendingComparator());
        System.out.println("Ascending Namewise : "+ L);
        
        Collections.sort(L, new NameDescendingComparator());
        System.out.println("Descending Namewise : "+ L);

        Collections.sort(L, new PercentageAscendingComparator());
        System.out.println("Ascending Perwise : "+ L);

        Collections.sort(L, new PercentageDescendingComparator());
        System.out.println("Descending Perwise : "+ L);

    }
}

