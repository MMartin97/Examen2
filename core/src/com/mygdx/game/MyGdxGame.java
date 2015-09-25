package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class MyGdxGame extends ApplicationAdapter {
    SpriteBatch batch;
    Texture fondo,cloud,cloud2,cloud3,cloud4, nave, pers1,pers2,pers3;
    int altura, anchura;
    Music musica;

    @Override
    public void create () {
        batch = new SpriteBatch();
        fondo = new Texture("colegio.jpg");
        cloud = new Texture("nube.png");
        cloud2 = new Texture("nube.png");
        cloud3 = new Texture("nube.png");
        cloud4 = new Texture("nube.png");
        nave = new Texture("space.png");
        pers1= new Texture("pj1.png");
        pers2= new Texture("pj2.png");
        pers3= new Texture("pj3.png");
        altura = Gdx.graphics.getWidth();
        anchura = Gdx.graphics.getHeight();
        musica = Gdx.audio.newMusic(Gdx.files.internal("midi.wav"));
        musica.play();





    }

    @Override
    public void render () {

        batch.begin();
        batch.draw(fondo, 0, 0, altura, anchura);

        batch.draw(cloud, 0, 300);
        batch.draw(cloud2, 150, 300);
        batch.draw(cloud3, 300, 300);
        batch.draw(cloud4, 405, 300);
        batch.draw(nave, 0, 200);
        batch.draw(pers1, 150, 0);
        batch.draw(pers2, 0, 0);
        batch.draw(pers3, 280, 0);

        batch.end();

    }
}
