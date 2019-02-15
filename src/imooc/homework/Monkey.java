package imooc.homework;

public class Monkey extends Animal implements IAct{
	private String type;
	
	public Monkey(String name, int age, String type) {
		super(name, age);
		this.type = type;
	}

	@Override
	public String skill() {
		return "骑独轮车过独木桥";
	}

	@Override
	public void act() {
		System.out.println("表演者：" + getName());
		System.out.println("年龄：" + getAge());
		System.out.println("品种：" + getType());
		System.out.println("技能：" + skill());
		System.out.println("爱好：" + love());
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String love() {
		return "喜欢模仿人的动作和表情";
	}
}
