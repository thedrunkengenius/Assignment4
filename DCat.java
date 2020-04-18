package keith;

public class DCat {

	private String name;
	private int age;
	private String mood;
	private String breed;
	
	public DCat(String name, int age, String mood, String breed) {
		this.name = name;
		this.age = age;
		this.mood = mood;
		this.breed = breed;
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

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = isMood(mood);
	}

	public String getBreed() {
		return breed;
	}
	private String isMood(String mood) {
		String speak=null;
		if(mood.equals("hungry")) {
			speak= "RAWR";
		}else if(mood.equals("sleepy")) {
			speak= "meow";
		}else if(mood.equals("angry")) {
			speak= "hsss";
		}else if(mood.equals("happy")) {
			speak= "purrrr";
		}else if(mood.equals("crazy")) {
			speak= "sdfsghetjst";
		}
		return speak;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", mood=" + mood + ", breed=" + breed + "]";
	}
	
}
