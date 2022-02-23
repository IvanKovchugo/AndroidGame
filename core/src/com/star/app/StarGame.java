package com.star.app;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class StarGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	float x;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("redbackground2.jpg");
	}

	@Override
	public void render () {
		update();
		ScreenUtils.clear(0.5f, 0.5f , 0.5f, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}

	public void update () {
		x += 1;
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
