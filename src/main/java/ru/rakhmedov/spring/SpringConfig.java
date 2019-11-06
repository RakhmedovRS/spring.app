package ru.rakhmedov.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.rakhmedov.spring.beans.*;

import java.util.Arrays;

/**
 * @author RakhmedovRS
 * @created 06-Nov-19
 */
@Configuration
@ComponentScan("ru.rakhmedov.spring.beans")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig
{
	@Bean
	public ClassicalMusic classicalMusic()
	{
		return new ClassicalMusic();
	}

	@Bean
	public RapMusic rapMusic()
	{
		return new RapMusic();
	}

	@Bean
	public RockMusic rockMusic()
	{
		return new RockMusic();
	}

	@Bean
	DanceMusic danceMusic()
	{
		return new DanceMusic();
	}

	@Bean
	public MusicPlayer musicPlayer()
	{
		return new MusicPlayer(Arrays.asList(classicalMusic(), rapMusic(), rockMusic(), danceMusic()));
	}

	@Bean
	public Computer computer()
	{
		return new Computer(musicPlayer());
	}
}
