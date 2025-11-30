package com.tca.comparators;

import java.util.Comparator;

import com.tca.entities.Student;

public class NameAscendingComparator implements Comparator<Student>
{
    public int compare(Student ob1, Student ob2)
    {
       String name1 = ob1.getName();
       String name2 = ob2.getName();

       return name1.compareTo(name2); 
    }
}
