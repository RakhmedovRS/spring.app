package ru.rakhmedov.spring.beans;

import org.springframework.stereotype.Component;

/**
 * @author RakhmedovRS
 * @created 31-Oct-19
 */
@Component("rockMusic")
public class RockMusic implements Music
{
	@Override
	public String getSong()
	{
		return "Show must go on";
	}
}
