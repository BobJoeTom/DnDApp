package io.github.bobjoetom.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


import io.github.bobjoetom.elements.Character;
import io.github.bobjoetom.map.FirstMap;
import io.github.bobjoetom.map.TileMap;

/**
 * Created by Brenden on 6/30/2016.
 */
public class Game extends State{
    Character player1;
    TileMap theMap = new FirstMap();
    public Game(GameStateManager gsm) {
        super(gsm);
        //SPAGHETTI CODE***********************************************************************************************
        player1= new Character();
        player1.setName("Bob");
        player1.setX(1);
        player1.setY(1);
        player1.setTexturePath("Player1");
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
    /*
    Render All Seeable Tiles on the map from main chracter
    Render All Characters/Items/ Enemies
    Render UI
     */
        //Render the MAPPPP I SAY****** SPHAGHETTI CODESSSS, in conjuction with screen


    }

    @Override
    public void dispose() {

    }
}
