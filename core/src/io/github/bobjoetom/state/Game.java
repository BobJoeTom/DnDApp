package io.github.bobjoetom.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Brenden on 6/30/2016.
 */
public class Game extends State{
    public Game(GameStateManager gsm) {
        super(gsm);
        System.out.print("Hello");
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {
        System.out.print("Hello");
    }

    @Override
    public void render(SpriteBatch sb) {

    }

    @Override
    public void dispose() {

    }
}
