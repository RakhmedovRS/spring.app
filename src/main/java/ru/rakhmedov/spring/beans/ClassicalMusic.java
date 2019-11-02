package ru.rakhmedov.spring.beans;

/**
 * @author RakhmedovRS
 * @created 31-Oct-19
 */
public class ClassicalMusic implements Music
{
	private ClassicalMusic()
	{
	}


	public void init()
	{
		System.out.println("initialization");
	}

	public void destroy()
	{
		System.out.println("destroying");
	}

	public static ClassicalMusic getClassicalMusic()
	{
		return new ClassicalMusic();
	}

	@Override
	public String getSong()
	{
		return "Winter";
	}
}
