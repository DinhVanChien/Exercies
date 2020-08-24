package bai4;

public class Student {
	private int id;
	private String name;
	private int age;
	private String classSc;
	private String subject;
	
	public Student(int id, String name, int age, String classSc, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.classSc = classSc;
		this.subject = subject;
	}
	
	public Student() {
		super();
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClassSc() {
		return classSc;
	}
	public void setClassSc(String classSc) {
		this.classSc = classSc;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
