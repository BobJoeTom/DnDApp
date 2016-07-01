package io.github.bobjoetom.map.tiles;

/**
 * Created by Brenden on 6/30/2016.
 */
public class Wall extends Tile{
    public Wall(int x, int y){
        setTexturePath("Wall.png");
        setX(x);
        setY(y);
    }
}
