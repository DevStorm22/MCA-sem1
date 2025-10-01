class Student
{
	int rollNo;
	String name;
	double marks1, marks2;
	Student()
	{
		System.out.println("Default Contructor");
		rollNo = 0;
		name = "STUDENT NAME";
		marks1 = marks2 = 0;
	}
	Student(int rollNo, String name, double marks1, double marks2)
	{
		System.out.println("Paramaterized Contructor");
		this.rollNo = rollNo;
		this.name = name;	
		this.marks1 = marks1;
		this.marks2 = marks2;
	}
	Student(Student s)
	{
		System.out.println("Copy Constructor");
		this.rollNo = s.rollNo;
		this.name = s.name;
		this.marks1 = s.marks1;
		this.marks2 = s.marks2;
	}
	void printMarkSheet()
	{
		System.out.println("========Marksheet========");
		System.out.println("Roll No.: " + rollNo);
		System.out.println("Name: " + name);
		System.out.println("Marks1: " + marks1);
		System.out.println("Marks2: " + marks2);
		System.out.println("Total marks: " + (marks1 + marks2));
		System.out.println("Percentages: " + ((marks1 + marks2) / 200) * 100);
	}
	public static void main(String[] args)
	{
		Student s1 = new Student();
		Student s2 = new Student(84, "Kaushik Musale", 78, 56);
		Student s3 = new Student(s2);
		s1.printMarkSheet();
		s2.printMarkSheet();
		s3.printMarkSheet();
	}
}