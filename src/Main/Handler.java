package Main;

import java.awt.*;
import java.util.LinkedList;

// loops through objects in game and updates and renders them to the screen
public class Handler {

    LinkedList<GameObject> object = new LinkedList<GameObject>();

    public void tick(){

        // looping through every game object
        for(int i=0; i<object.size(); i++){
            GameObject tempObject = object.get(i);
            tempObject.tick();
        }
    }

    public void render(Graphics g){

        for(int i=0; i<object.size(); i++) {
            GameObject tempObject = object.get(i);
            tempObject.render(g);
        }
    }

    public void addObject(GameObject obj){
        this.object.add(obj);
    }

    public void removeObject(GameObject obj){
        this.object.remove(obj);
    }

}
