package io.github.bobjoetom.map;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.Stack;

import io.github.bobjoetom.elements.Character;
import io.github.bobjoetom.map.tiles.Tile;

/**
 * Created by Brenden on 6/30/2016.
 */
public class Map {
    private int WIDTH;
    private int HEIGHT;
    //Map of tiles
    private ArrayList<Stack> map = new ArrayList<Stack>();//TODO MAYBE A STACK MAP
    private ArrayList<Tile> initMap = new ArrayList<Tile>();

    public void initMap(){
        for(int i = 0; i < (getHEIGHT()*getWIDTH()); i++){
            getMap().add(i, new Stack());
        }
        for(int i = 0; i < getInitMap().size(); i++){
            Tile tile = getInitMap().get(i);
            int x = tile.getX();
            int y = tile.getY();
            getMap().get(i).add(y*getWIDTH()+ x, tile);
        }
    }

    private void render(SpriteBatch sb, Character character){//Character is main point of perspective
            for(int y = character.getY() + 6; y >= character.getY()-6; y--){
                for(int x = character.getX()-4;x<= character.getX()+6;x++){
                    Tile tile = getMap().get(y*getWIDTH()+x).get(0);
                    x = ^
                    y = ^
                    sb.draw(getMap().get(y*getWIDTH()+x).);//STACK TO RENDER AND POSISTION
                }
            }
    }

    public ArrayList<Stack> getMap() {
        return map;
    }

    public void setMap(ArrayList<Stack> map) {
        this.map = map;
    }

    public ArrayList<Tile> getInitMap() {
        return initMap;
    }

    public void setInitMap(ArrayList<Tile> initMap) {
        this.initMap = initMap;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public void setWIDTH(int WIDTH) {
        this.WIDTH = WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public void setHEIGHT(int HEIGHT) {
        this.HEIGHT = HEIGHT;
    }
}
