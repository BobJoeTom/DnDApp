package io.github.bobjoetom.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import io.github.bobjoetom.MainClass;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width= Math.round(MainClass.WIDTH);
		config.height=  Math.round(MainClass.HEIGHT);
		config.title= MainClass.TITLE;
		new LwjglApplication(new MainClass(), config);
	}
}
