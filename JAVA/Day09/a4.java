package JAVA.Day09;

//Coding with the help of AI 

import java.util.Scanner;

public class a4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter student name: ");
		String name = scanner.nextLine();
		System.out.print("Enter roll number: ");
		String rollNumber = scanner.nextLine();

		int[] marks = new int[3];
		for (int index = 0; index < marks.length; index++) {
			marks[index] = readMark(scanner, index + 1);
		}

		Student student = new Student(name, rollNumber, marks[0], marks[1], marks[2]);
		student.printDetails();
		scanner.close();
	}

	private static int readMark(Scanner scanner, int subjectNumber) {
		while (true) {
			System.out.print("Enter marks for subject " + subjectNumber + " (0-100): ");
			if (scanner.hasNextInt()) {
				int mark = scanner.nextInt();
				if (mark >= 0 && mark <= 100) {
					return mark;
				}
			} else {
				scanner.next();
			}
			System.out.println("Please enter a whole number from 0 to 100.");
		}
	}
}

class Student {
	private final String name;
	private final String rollNumber;
	private final int subject1;
	private final int subject2;
	private final int subject3;

	Student(String name, String rollNumber, int subject1, int subject2, int subject3) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}

	private int total() {
		return subject1 + subject2 + subject3;
	}

	private double average() {
		return total() / 3.0;
	}

	private String grade() {
		double average = average();
		if (average >= 90) {
			return "A";
		} else if (average >= 80) {
			return "B";
		} else if (average >= 70) {
			return "C";
		} else if (average >= 60) {
			return "D";
		} else if (average >= 40) {
			return "E";
		}
		return "F";
	}

	void printDetails() {
		System.out.println("\n--- Student Marks Details ---");
		System.out.println("Name: " + name);
		System.out.println("Roll number: " + rollNumber);
		System.out.println("Subject 1: " + subject1);
		System.out.println("Subject 2: " + subject2);
		System.out.println("Subject 3: " + subject3);
		System.out.println("Total: " + total() + "/300");
		System.out.printf("Average: %.2f%%%n", average());
		System.out.println("Grade: " + grade());
	}
}
