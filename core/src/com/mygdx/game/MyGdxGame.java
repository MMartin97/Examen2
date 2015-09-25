package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class MyGdxGame extends ApplicationAdapter {

    private MarioPolling mario;
    private SpriteBatch batch;
    SpriteBatch batch2;
    Texture fondo,cloud,cloud2,cloud3,cloud4, nave, pers1,pers2,pers3;
    int altura, anchura;
    Music musica;

    @Override
    public void create () {

        mario = new MarioPolling();
        batch = new SpriteBatch();




        fondo = new Texture("colegio.jpg");
        cloud = new Texture("nube.png");
        cloud2 = new Texture("nube.png");
        cloud3 = new Texture("nube.png");
        cloud4 = new Texture("nube.png");

        altura = Gdx.graphics.getWidth();
        anchura = Gdx.graphics.getHeight();
        musica = Gdx.audio.newMusic(Gdx.files.internal("midi.wav"));
        musica.play();






    }

    @Override
    public void render () {

        mario.update();

        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        //String messageMario = "Mario esta :("+mario.getPosition().x+","+mario.getPosition().y+")";

        batch.begin();




        batch.draw(fondo, 0, 0, altura, anchura);

        batch.draw(cloud, 0, 300);
        batch.draw(cloud2, 150, 300);
        batch.draw(cloud3, 300, 300);
        batch.draw(cloud4, 405, 300);
        batch.draw(mario.getTexture(), mario.getPosition().x, mario.getPosition().y, 75, 75);

        batch.end();



    }
    public void	 dispose(){
        batch.dispose();
        mario.getTexture().dispose();
    }
}


