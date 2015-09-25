package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Martin on 24/09/15.
 */
public class MarioPolling {
    private Texture mario;
    private Vector2 posMario;

    public MarioPolling(){
        mario =  new Texture(Gdx.files.internal("mario.png"));
        posMario = new Vector2(100,150);
    }

    public void update(){
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            posMario.x +=10;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            posMario.x -=10;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.UP)){
            posMario.y +=10;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
            posMario.y -=10;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.SPACE)){

        }
    }
    public Vector2 getPosition(){return posMario;}
    public Texture getTexture(){return mario;}
}
