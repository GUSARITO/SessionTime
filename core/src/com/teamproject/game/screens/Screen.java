package com.teamproject.game.screens;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Roman_Mashenkin on 26.03.2016.
 *
 * This abstract class is template for different state class.
 */
public abstract class Screen {

    protected OrthographicCamera camera;        //It shows some state of game.
    protected GameScreenManager gsm;            //It manages with different states.


    public Screen(GameScreenManager gsm) {
        this.gsm = gsm;
        camera = new OrthographicCamera();
    }

    protected abstract void handleInput();

    public abstract void update(float dt);

    public abstract void render(SpriteBatch sb);

    public abstract void dispose();

}