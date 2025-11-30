package com.tca.comparators;

import java.util.Comparator;

import com.tca.entities.Student;

public class PercentageDescendingComparator implements Comparator<Student>
{
    public int compare(Student ob1, Student ob2)
    {
        Double p1 = ob1.getPer();
        Double p2 = ob2.getPer();

        return -p1.compareTo(p2);
    }
}
