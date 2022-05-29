package com.ob.finalassessment;

import java.util.Scanner;

public class Student {
	int id;
	String name;
	String dept;
	double marks;
	Scanner scan = new Scanner(System.in);

	public Student() {
		System.out.println("Enter the id of the Student:");
		this.id = scan.nextInt();
		System.out.println("Enter the name of the Student:");
		this.name = scan.next();
		System.out.println("Enter the dept of the Student:");
		this.dept = scan.next();
		System.out.println("Enter the mark of the Student:");
		this.marks = scan.nextDouble();

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", marks=" + marks + "]";
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		Student std = (Student) obj;
		return this.id == std.id;
	}

}
