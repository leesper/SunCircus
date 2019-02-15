package imooc.homework;

public class Lion extends Animal implements IAct {
	private String color;
	private String sex;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Lion(String name, int age, String color, String sex) {
		super(name, age);
		this.color = color;
		this.sex = sex;
	}

	@Override
	public String skill() {
		return "擅长钻火圈";
	}

	@Override
	public void act() {
		System.out.println("表演者：" + getName());
		System.out.println("年龄：" + getAge());
		System.out.println("性别：" + getSex());
		System.out.println("毛色：" + getColor());
		System.out.println("技能：" + skill());
		System.out.println("爱好：" + love());
	}

	@Override
	public String love() {
		return "喜欢吃各种肉类";
	}

}
