package io.github.bobjoetom.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import io.github.bobjoetom.MainClass;

/**
 * Created by Brenden on 6/30/2016.
 */
public class MainMenu extends State{

    private Texture background;
    private Texture playBtn;
    public MainMenu(GameStateManager gsm) {
        super(gsm);
        background = new Texture("BackGround.png");
        playBtn = new Texture("Play-Button.png");
    }

    @Override
    protected void handleInput() {
        if(Gdx.input.justTouched()){
            gsm.push(new Game(gsm));
            dispose();
        }
    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0,0, MainClass.WIDTH, MainClass.HEIGHT);
        sb.draw(playBtn,( MainClass.WIDTH/2)-200,  MainClass.HEIGHT/2, 400, 200);
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        playBtn.dispose();
    }
}
