package com.ob.finalassessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class TestRecord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		LinkedHashSet<Student> hashset = new LinkedHashSet<Student>();
		try {
		while (true) {
			System.out.println("=============================================================");
			System.out.println("Enter the choice for following operation in Student Record");
			System.out.println(
					"1.AddStudent \n2.Edit Student \n3.Delete Student \n4.List of Students \n5.Get Student \n6.Sort the list of Student \n7.Exit");
			System.out.println("=====Enter the details=====");

			int option = scan.nextInt();
			switch (option) {
			case 1:
				hashset.add(new Student());
//			System.out.println("Student detail is added "+hashset);
				break;
			case 2:
				System.out.println("=====Edit Student=====");
				System.out.println("Enter the ID for edit the student details");
				int editId = scan.nextInt();
				System.out.println("Editing details of student based on: \n1.id \n2.name \n3.dept \n4.marks");
				for (Student stud : hashset) {
					if (stud.id == editId) {
						int changeValue = scan.nextInt();
						switch (changeValue) {
						case 1:
							System.out.println("Enter the new id of the student");
							int duplicate = scan.nextInt();
							int flag =0;
							for (Student std : hashset) {
								if (std.id == duplicate) {
									System.err.println("The id is already exist and enter a new ID");
									flag =1;
									break;
								}
							}
							if (flag == 0) {
								stud.id = duplicate;
							}
							break;
						case 2:
							System.out.println("Enter the new name of the student");
							stud.name = scan.next();
							break;
						case 3:
							System.out.println("Enter the new dept of the student");
							stud.dept = scan.next();
							break;
						case 4:
							System.out.println("Enter the new mark of the student");
							stud.marks = scan.nextDouble();
							break;
						default:
							System.out.println("Enter the valid option....");
							break;
						}
					}
				}
				break;
			case 3:
				System.out.println("=====Delete the Student based on ID=====");
				System.out.println("Enter the DeleteID");
				int deleteID = scan.nextInt();
				for (Student delete : hashset) {
					if (deleteID == delete.id) {
						hashset.remove(delete);
						break;
					}
				}
				break;
			case 4:
				System.out.println("=====List of Students=====");
				for (Student names : hashset) {
					System.out.println(names);
				}
				break;
			case 5:
				System.out.println("=====Get Student based on ID=====");
				System.out.println("Enter the id of the student");
				int getid = scan.nextInt();
				for (Student names : hashset) {
					if (getid == names.id) {
						System.out.println(names);
					}
				}
				
				break;
			case 6:
				System.out.println("=====Sort the list of Students=====");
				System.out.println("Sort the list of students based on \n1.SortById \n2.SortByName \n3.SortByMarks");
				int changeSort = scan.nextInt();
				switch (changeSort) {
				case 1:
					SortById sortbyId = new SortById();
					ArrayList<Student> arraylist1 = new ArrayList<Student>(hashset);
					Collections.sort(arraylist1, sortbyId);
					for (Student sort : arraylist1) {
						System.out.println(sort);
					}
					System.out.println("Sorted based on Id is completed");
					break;
				case 2:
					SortByName sortbyName = new SortByName();
					ArrayList<Student> arraylist2 = new ArrayList<Student>(hashset);
					Collections.sort(arraylist2, sortbyName);
					for (Student sort : arraylist2) {
						System.out.println(sort);
					}
					System.out.println("Sorted based on Name is completed");
					break;
				case 3:
					SortByMarks sortbyMarks = new SortByMarks();
					ArrayList<Student> arraylist3 = new ArrayList<Student>(hashset);
					Collections.sort(arraylist3, sortbyMarks);
					for (Student sort : arraylist3) {
						System.out.println(sort);
					}
					System.out.println("Sorted based on Marks is completed");
					break;
				}
				break;
			case 7:
				System.out.println("=====Exit=====");
				return;
			default:
				System.out.println("-----Enter the valid input-----");

			}

		}
		}catch(Exception e) {
			System.err.println("Enter the given option only.......");
			}
	}
}
