package hello;

import java.sql.Connection;
import java.sql.Date;

public class HelloWorld implements Hello {
	private Connection conn;
	private Date date;
	private int age;
	private String name;
	private String job;
	private boolean gender;
	private double salary;
		
	public HelloWorld(String name, String job, boolean gender, double salary) {
		super();
		this.name = name;
		this.job = job;
		this.gender = gender;
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "HelloWorld [age=" + age + ", name=" + name + ", job=" + job + ", gender=" + gender + ", salary="
				+ salary + "]";
	}

	public static void main(String[] args) {
		System.out.println("¾È³ç Ã¤±ÔÅÂ!");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
		}
	}
}
