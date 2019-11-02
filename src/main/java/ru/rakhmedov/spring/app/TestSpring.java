package ru.rakhmedov.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.rakhmedov.spring.beans.ClassicalMusic;
import ru.rakhmedov.spring.beans.MusicPlayer;

/**
 * @author RakhmedovRS
 * @created 30-Oct-19
 */
public class TestSpring
{
	public static void main(String[] args)
	{
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml"))
		{
			System.out.println(applicationContext.getBean("classicalMusic", ClassicalMusic.class).getSong());
			applicationContext.getBean("musicPlayer", MusicPlayer.class).playMusic();
		}
	}
}
