package ru.rakhmedov.spring.beans;

/**
 * @author RakhmedovRS
 * @created 31-Oct-19
 */
public class ClassicalMusic implements Music
{
	@Override
	public String getSong()
	{
		return "Winter";
	}
}
