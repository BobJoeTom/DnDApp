package io.github.bobjoetom.elements.armor;

import com.badlogic.gdx.graphics.Texture;

import java.lang.Character;

/**
 * Created by Brenden on 6/30/2016.
 */
public abstract class Armor {
    //Speacialty will be with specific armor class
    //Maybe overide the get armor code to get armor and do extra things
    int armor;
    private java.lang.Character user;
    private java.lang.Character attacker;

    private String texturePath;
    private Texture texture;

    public Texture getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = new Texture(texture);
    }

    public String getTexturePath() {
        return texturePath;
    }

    public void setTexturePath(String texturePath) {
        this.texturePath = texturePath;
        setTexture(getTexturePath());
    }

    public Character getUser() {
        return user;
    }

    public void setUser(Character user) {
        this.user = user;
    }

    public Character getAttacker() {
        return attacker;
    }

    public void setAttacker(Character attacker) {
        this.attacker = attacker;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public abstract void speacial();
}
