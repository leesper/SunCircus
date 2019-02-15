package imooc.homework;

public class Bear extends Animal implements IAct {
	
	public Bear(String name, int age) {
		super(name, age);
	}

	@Override
	public String skill() {
		return "挽着花篮，打着雨伞，自立走秀";
	}

	@Override
	public void act() {
		System.out.println("表演者：" + getName());
		System.out.println("年龄：" + getAge() + "岁");
		System.out.println("技能：" + skill());
		System.out.println("爱好：" + love());
	}

	@Override
	public String love() {
		return "喜欢卖萌";
		
	}

}
