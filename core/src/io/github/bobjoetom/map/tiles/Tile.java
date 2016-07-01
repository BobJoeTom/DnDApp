package io.github.bobjoetom.map.tiles;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Brenden on 6/30/2016.
 */
public class Tile {
    private int x, y;
    private String texturePath;
    private Texture texture;

    public Texture getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = new Texture(texture);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getTexturePath() {
        return texturePath;
    }

    public void setTexturePath(String texturePath) {
        this.texturePath = texturePath;
        setTexture(getTexturePath());
    }


}
