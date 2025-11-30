package com.tca.comparators;

import java.util.Comparator;

import com.tca.entities.Student;

public class RollNumberAscendingComparator implements Comparator<Student>
{
    public int compare(Student ob1, Student ob2)
    {
        Integer i1 = ob1.getRno();
        Integer i2 = ob2.getRno();

        return i1.compareTo(i2);
    }
}
