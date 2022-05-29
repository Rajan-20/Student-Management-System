package com.ob.finalassessment;

import java.util.Comparator;

public class SortByMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (int) (o1.marks - o2.marks);
	}

}
