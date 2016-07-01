package io.github.bobjoetom.map;

import java.util.ArrayList;

import io.github.bobjoetom.map.tiles.Tile;

/**
 * Created by Brenden on 6/30/2016.
 */
public class Tilemap {
    //Map of tiles
    private ArrayList<Tile> map = new ArrayList<Tile>();

    public ArrayList<Tile> getMap() {
        return map;
    }

    public void setMap(ArrayList<Tile> map) {
        this.map = map;
    }
}
