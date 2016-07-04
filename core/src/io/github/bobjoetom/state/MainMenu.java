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
    boolean touched = false;
    int yPosistion1 = 0;
    int yPosistion2 = 0;

    public MainMenu(GameStateManager gsm) {
        super(gsm);
        background = new Texture("BackGround.png");
        playBtn = new Texture("Play-Button.png");
    }

    @Override
    protected void handleInput() {
        if(Gdx.input.justTouched()&& touched == false){
            yPosistion1 = Gdx.input.getY();
            touched = true;
        }
        if(Gdx.input.isTouched() == false){
            touched = false;
        }
        if(Gdx.input.isTouched() && touched){
            yPosistion2 = Gdx.input.getY();
            if(yPosistion2-yPosistion1>200){
                gsm.push(new Game(gsm));
                dispose();
            }
        }
        /*

        */
        System.out.println(touched);
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        //TODO Will Render the MainUI
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
