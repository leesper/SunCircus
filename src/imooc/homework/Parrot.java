package imooc.homework;

public class Parrot extends Animal implements IAct {
	private String type;
	
	public Parrot(String name, int age, String type) {
		super(name, age);
		this.type = type;
	}

	@Override
	public String skill() {
		return "擅长模仿";
	}

	@Override
	public void act() {
		System.out.println("表演者：" + getName());
		System.out.println("年龄：" + getAge());
		System.out.println("品种：" + getType());
		System.out.println("技能：" + skill());
		System.out.println("爱好：" + love());
	}

	@Override
	public String love() {
		return "喜欢吃坚果和松子";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
