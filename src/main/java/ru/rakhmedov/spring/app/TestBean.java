package ru.rakhmedov.spring.app;

/**
 * @author RakhmedovRS
 * @created 30-Oct-19
 */
public class TestBean
{
	private String name;

	public TestBean(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
