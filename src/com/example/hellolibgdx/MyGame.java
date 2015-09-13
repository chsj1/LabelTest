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
	private Stage stage;//����һ����̨����
	private BitmapFont font;//����һ��BitmapFont����
	private LabelStyle style;//����һ��LabelStyle����
	private Label label;//����һ��Label����
	
	TextureAtlas atlas;
	TextureRegion bgRegion;//����ͼƬ
	Image bgImage;
	
	@Override
	public void create() {
		atlas = new TextureAtlas(Gdx.files.internal("data/xiaorenbg.atlas"));
		bgRegion = atlas.findRegion("bg");
		bgImage = new Image(bgRegion);
		bgImage.setSize(480, 320);
		
		font = new BitmapFont(Gdx.files.internal("data/font.fnt"),Gdx.files.internal("data/font.png"),false);//file,image,flip(�Ƿ�ת)
		style = new LabelStyle(font,font.getColor());//��ʹ�õ��ַ���,���ַ�����ɫ
		//���������ֱ�Ϊ:Ҫ��ʾ������,labelstyle
//          label = new Label("hello libGDX",style);//��ʼ��Label����
          label = new Label("You Win",style);//��ʼ��Label����
		stage = new Stage(400,320,false);//��ʼ����̨����
		label.setPosition(100, 150);//����Label�����λ��
		label.setFontScale(0.8f);//����Label������Ĵ�С
		label.setColor(Color.BLACK);//�����������ɫ
		stage.addActor(bgImage);//������ͼ��ӵ���̨��
		stage.addActor(label);//��Label������ӵ���̨
		Gdx.input.setInputProcessor(stage);//ʹ��stage��˼����������������¼�
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