package io.github.bobjoetom.map;

import io.github.bobjoetom.map.tiles.Floor;
import io.github.bobjoetom.map.tiles.Wall;

/**
 * Created by Brenden on 6/30/2016.
 */
public class FirstMap extends Tilemap{
    public void FirstMap(){
        for(int x = 0; x < 20; x++){
            for(int y = 0; y < 20; y++){
                if(y==0||y==19){
                    getMap().add(new Wall(x, y));
                }
                else if((x>0&&x<19)&&(y==0||y==19)){
                    getMap().add(new Floor(x, y));
                }
                else{
                    getMap().add(new Floor(x, y));
                }


            }
        }
    }

}
