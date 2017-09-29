package stupid.model;

public class ThirdStupid
{
	private String name;
	private int age;

	public ThirdStupid(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// Getters
	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	// Setters
	public void setName(String name)
	{
		this.name = name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String toString()
	{
		String description = "This is made to test name as " + name + " and age as " + age + ".";
		return description;		
	}
}
