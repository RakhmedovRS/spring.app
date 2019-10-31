package ru.rakhmedov.spring.beans;

/**
 * @author RakhmedovRS
 * @created 31-Oct-19
 */
public class RockMusic implements Music
{
	@Override
	public String getSong()
	{
		return "Show must go on";
	}
}
