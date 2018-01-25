package com.java.thread.practice;

public class Person implements Comparable<Person> {

	private String name;
	private int age;
	private String gender;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public int compareTo(Person person) {
		if (this.age > person.getAge())
			return 1;
		else if (this.age < person.getAge())
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return name + "," + age + "," + gender;
	}

}
