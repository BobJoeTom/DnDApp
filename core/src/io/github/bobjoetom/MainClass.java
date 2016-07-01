package io.github.bobjoetom;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import io.github.bobjoetom.state.GameStateManager;
import io.github.bobjoetom.state.MainMenu;

public class MainClass extends ApplicationAdapter {
	public static final int WIDTH = 480;
	public static final int HEIGHT = 800;

	public static final String TITLE = "DnD App";
	private GameStateManager gameStateManager;
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		gameStateManager = new GameStateManager();
		gameStateManager.push(new MainMenu(gameStateManager));
	}

	@Override
	public void render () {
		gameStateManager.update(Gdx.graphics.getDeltaTime());
		gameStateManager.render(batch);
	}
}
