package imooc.homework;

public abstract class Animal {
	private String name;
	private int age;
	
	public abstract void love();

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
}
