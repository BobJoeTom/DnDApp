package io.github.bobjoetom;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import io.github.bobjoetom.state.GameStateManager;
import io.github.bobjoetom.state.MainMenu;

public class MainClass extends ApplicationAdapter {
	public static final float WIDTH = 450;
	public static final float HEIGHT = 800;

	public static final String TITLE = "DnD App";
	private GameStateManager gameStateManager;
	SpriteBatch batch;

	@Override
	public void create () {
		batch = new SpriteBatch();
		gameStateManager = new GameStateManager();
		gameStateManager.push(new MainMenu(gameStateManager));
	}

	@Override
	public void render () {
		gameStateManager.update(Gdx.graphics.getDeltaTime());
		gameStateManager.render(batch);
	}
}
