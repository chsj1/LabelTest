package com.example.hellolibgdx;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;

public class MyGame implements ApplicationListener {
	private Stage stage;//定义一个舞台对象
	private BitmapFont font;//定义一个BitmapFont对象
	private LabelStyle style;//定义一个LabelStyle对象
	private Label label;//定义一个Label对象
	
	TextureAtlas atlas;
	TextureRegion bgRegion;//背景图片
	Image bgImage;
	
	@Override
	public void create() {
		atlas = new TextureAtlas(Gdx.files.internal("data/xiaorenbg.atlas"));
		bgRegion = atlas.findRegion("bg");
		bgImage = new Image(bgRegion);
		bgImage.setSize(480, 320);
		
		font = new BitmapFont(Gdx.files.internal("data/font.fnt"),Gdx.files.internal("data/font.png"),false);//file,image,flip(是否翻转)
		style = new LabelStyle(font,font.getColor());//所使用的字符库,和字符的颜色
		//两个参数分别为:要显示的内容,labelstyle
//          label = new Label("hello libGDX",style);//初始化Label对象
          label = new Label("You Win",style);//初始化Label对象
		stage = new Stage(400,320,false);//初始化舞台对象
		label.setPosition(100, 150);//设置Label对象的位置
		label.setFontScale(0.8f);//设置Label中字体的大小
		label.setColor(Color.BLACK);//设置字体的颜色
		stage.addActor(bgImage);//将背景图添加到舞台中
		stage.addActor(label);//将Label对象添加到舞台
		Gdx.input.setInputProcessor(stage);//使用stage对思昂来处理输入输出事件
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub
	}
	@Override
	public void render() {
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		stage.act();
		stage.draw();
	}
	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub
	}
	@Override
	public void resume() {
		// TODO Auto-generated method stub
	}
}