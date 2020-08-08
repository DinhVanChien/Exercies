package object;

import java.lang.reflect.Field;

/**
 * 
 * @author Đinh Văn Chiến
 *
 */

public class Student {
	
	public String name;
	public int age;
	public String subject;
	public String school;
	
	public Student(String name, int age, String subject, String school) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
		this.school = school;
	}
	
	public Student() {
	}
	
	/**
	 * 
	 * @param properties là 1 thuộc tính của object
	 * @return vd "name" : "Dinh Van Chien"
	 */
	public String convertProperties(String nameProperties, String valueProperties) {
		StringBuilder stringBuilder = new StringBuilder();
		   stringBuilder.append('"').append(nameProperties).append('"')
		   .append(" : ").append('"').append(valueProperties).append('"').append(",\n\t\t");
		   return stringBuilder.toString();
	}
	
	/**
	 * 
	 * @param student là object muốn convert sang format Json
	 * @return format Json
	 */
	public String convertObjetStudenToJson(Student student) {
		StringBuilder strJson = new StringBuilder();
		strJson.append("{\n\t").append('"').append("Student")
			.append('"').append(" : {\n\t\t")
			.append(convertProperties("name", student.name))
			.append(convertProperties("age", student.age+""))
			.append(convertProperties("subject", student.subject))
			.append(convertProperties("school", student.school))
			.append("}\n}");
		return strJson.toString();
	}
}
