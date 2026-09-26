package JAVA.Day09;

//Coding with the help of AI 

public class a5 {
	public static void main(String[] args) {
		Student student = new Student(101, "Aarav", 88);
		System.out.println(student);
	}

	static class Student {
		private int id;
		private String name;
		private int marks;

		Student(int id, String name, int marks) {
			this.id = id;
			this.name = name;
			this.marks = marks;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}

		@Override
		public String toString() {
			return "Student{id=" + id + ", name='" + name + "', marks=" + marks + "}";
		}
	}
}
