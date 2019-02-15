package imooc.homework;

public class Clown extends Animal implements IAct {
	private String dress;
	
	public Clown(String name, int age, String dress) {
		super(name, age);
		this.dress = dress;
	}

	public String getDress() {
		return dress;
	}

	public void setDress(String dress) {
		this.dress = dress;
	}

	@Override
	public String skill() {
		return "脚踩高跷，进行杂技魔术表演";
	}

	@Override
	public void act() {
		System.out.println("表演者：" + getName());
		System.out.println("艺龄：" + getAge());
		System.out.println("着装：" + getDress());
		System.out.println("技能：" + skill());
	}

	@Override
	public String love() {
		return "";
	}

}
