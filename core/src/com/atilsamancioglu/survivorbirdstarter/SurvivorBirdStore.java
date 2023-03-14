package com.atilsamancioglu.survivorbirdstarter;

import com.atilsamancioglu.survivorbirdstarter.Screens.GameScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Circle;

import java.util.Random;

public class SurvivorBirdStore extends Game {
//    public SpriteBatch batch;
//    public Texture background;
//    public Texture tree;
//    public Texture bird;
//    public Texture enemy1;
//    public Texture enemy2;
//    public Texture enemy3;
//    public float birdX;
//    public float birdY;
//    public int gameState=0;
//    public float velocity=0;
//    public float gravity = 0.5f;
//    public Random random;
//    public int score=0;
//    public int scoreEnemy=0;
//    public BitmapFont font;
//    public BitmapFont font2;
//
//
//
//    public Circle birdCircle;
//    public ShapeRenderer shapeRenderer;
//
//
//
//    public int numberOfEnemy=3;
//    public float [] enemyX =new float[numberOfEnemy];
//    public float distance = 0;
//    public float enemyVelocity=5;
//    public float [] enemyOffSet1=new float[numberOfEnemy];
//    public float [] enemyOffSet2=new float[numberOfEnemy];
//    public float [] enemyOffSet3=new float[numberOfEnemy];
//    public Circle[] enemyCircles1;
//    public Circle[] enemyCircles2;
//    public Circle[] enemyCircles3;
//
//
//    public Texture coin;
//    public float coinX;
//    public float coinY;
//    public 	Circle coinCircle;
//    public float coinDistance;
//    public float coinVelocity=7;



    @Override
    public void create () {


//        batch=new SpriteBatch();
//        background=new Texture("background.png");
//        bird=new Texture("bird.png");
//        birdX= Gdx.graphics.getWidth()/6;
//        birdY=Gdx.graphics.getHeight()/2;
//        tree=new Texture("tree.png");
//        enemy1=new Texture("enemy.png");
//        enemy2=new Texture("enemy.png");
//        enemy3=new Texture("enemy.png");
//        coin=new Texture("coin.png");
//
//
//
//        distance=Gdx.graphics.getWidth()/2;
//        coinDistance=Gdx.graphics.getWidth();
//        random = new Random();
//        birdCircle=new Circle();
//        enemyCircles1=new Circle[numberOfEnemy];
//        enemyCircles2=new Circle[numberOfEnemy];
//        enemyCircles3=new Circle[numberOfEnemy];
//        shapeRenderer=new ShapeRenderer();
//        font=new BitmapFont();
//        font.setColor(Color.WHITE);
//        font.getData().setScale(4);
//        font2=new BitmapFont();
//        font2.setColor(Color.BLACK);
//        font2.getData().setScale(6);
//
//
//        coinCircle = new Circle();
//
//
//        for(int i = 0;i<numberOfEnemy ;i++){
//            enemyX[i]=Gdx.graphics.getWidth()-enemy1.getWidth()/2+i*distance;
//
//            enemyOffSet1[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
//            enemyOffSet2[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
//            enemyOffSet3[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
//
//            enemyCircles1[i]=new Circle();
//            enemyCircles2[i]=new Circle();
//            enemyCircles3[i]=new Circle();
//
//        }
//        coinX=Gdx.graphics.getWidth()/2+coinDistance;
//        coinY=(random.nextFloat())*(Gdx.graphics.getHeight()-500);
//
//

    }

    @Override
    public void render () {
//		for(int i = 0;i<numberOfEnemy;i++){
//			if(Intersector.overlaps(enemyCircles1[i],enemyCircles2[i])||Intersector.overlaps(enemyCircles1[i],enemyCircles3[i])||Intersector.overlaps(enemyCircles2[i],enemyCircles3[i])){
//				enemyOffSet1[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
//				enemyOffSet2[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
//				enemyOffSet3[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
//			}
//		}
//		batch.begin();
//		batch.draw(background,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
////		batch.draw(tree,500,170,Gdx.graphics.getWidth()/5,Gdx.graphics.getHeight()/2);
//
//		if(gameState==1){
//
//
//			if(enemyX[scoreEnemy] < Gdx.graphics.getWidth()/6){
//				if(enemyVelocity<=20){
//					enemyVelocity+=0.2;
//				}
//				score++;
//				if(scoreEnemy<numberOfEnemy-1){
//					scoreEnemy++;
//				}else{
//					scoreEnemy=0;
//				}
//			}
//
//
//			batch.draw(coin,coinX,coinY,Gdx.graphics.getWidth()/20,Gdx.graphics.getHeight()/10);
//
//			if(coinX+Gdx.graphics.getWidth()/20<0){
//				coinX=coinX+coinDistance+200;
//				coinY=(random.nextFloat())*(Gdx.graphics.getHeight()-500);
//			}else{
//				coinX-=coinVelocity;
//			}
//
//			for(int i = 0; i<numberOfEnemy;i++){
//
//				if(enemyX[i]<0){
//					enemyX[i]+=numberOfEnemy*distance;
//
//					enemyOffSet1[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
//					enemyOffSet2[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
//					enemyOffSet3[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
//
//				} else {
//					enemyX[i]-=enemyVelocity;
//				}
//
//				batch.draw(enemy1,enemyX[i],Gdx.graphics.getHeight()/2+enemyOffSet1[i],Gdx.graphics.getWidth()/15,Gdx.graphics.getHeight()/10);
//				batch.draw(enemy2,enemyX[i],Gdx.graphics.getHeight()/2+enemyOffSet2[i],Gdx.graphics.getWidth()/15,Gdx.graphics.getHeight()/10);
//				batch.draw(enemy3,enemyX[i],Gdx.graphics.getHeight()/2+enemyOffSet3[i],Gdx.graphics.getWidth()/15,Gdx.graphics.getHeight()/10);
//
//				enemyCircles1[i]=new Circle(enemyX[i]+Gdx.graphics.getWidth()/30,Gdx.graphics.getHeight()/2+enemyOffSet1[i]+Gdx.graphics.getHeight()/20,Gdx.graphics.getWidth()/45);
//				enemyCircles2[i]=new Circle(enemyX[i]+Gdx.graphics.getWidth()/30,Gdx.graphics.getHeight()/2+enemyOffSet2[i]+Gdx.graphics.getHeight()/20,Gdx.graphics.getWidth()/45);
//				enemyCircles3[i]=new Circle(enemyX[i]+Gdx.graphics.getWidth()/30,Gdx.graphics.getHeight()/2+enemyOffSet3[i]+Gdx.graphics.getHeight()/20,Gdx.graphics.getWidth()/45);
//
//
//			}
//
//
//			coinCircle=new Circle(coinX+Gdx.graphics.getWidth()/37,Gdx.graphics.getHeight()/20+coinY,Gdx.graphics.getWidth()/58);
//
//
//			if(Gdx.input.justTouched()){
//				velocity=-9;
//			}
//
//
//			if(birdY>=Gdx.graphics.getHeight()-Gdx.graphics.getHeight()/20) {
//				gameState = 2;
//			}
//
//			if(birdY>=0) {
//				velocity += gravity;
//				birdY = birdY - velocity;
//			} else {
//				gameState=2;
//			}
//
//
//		} else if(gameState==0) {
//			if(Gdx.input.justTouched()){
//				gameState=1;
//			}
//		} else if (gameState==2) {
//
//			font2.draw(batch,"Game Over! Tap to play again!",Gdx.graphics.getWidth()/2-600,2*Gdx.graphics.getHeight()/3);
//
//			if(Gdx.input.justTouched()){
//				gameState=1;
//
//				birdY=Gdx.graphics.getHeight()/2;
//
//				coinX=Gdx.graphics.getWidth()/2+coinDistance;
//				coinY=(random.nextFloat())*(Gdx.graphics.getHeight()-500);
//
//				for(int i = 0;i<numberOfEnemy ;i++){
//					enemyX[i]=Gdx.graphics.getWidth()-enemy1.getWidth()/2+i*distance;
//
//					enemyOffSet1[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
//					enemyOffSet2[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
//					enemyOffSet3[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
//
//
//					enemyCircles1[i]=new Circle();
//					enemyCircles2[i]=new Circle();
//					enemyCircles3[i]=new Circle();
//
//				}
//
//				velocity=0;
//				enemyVelocity=5;
//				score=0;
//				scoreEnemy=0;
//
//			}
//		}
//
//
//		batch.draw(bird,birdX,birdY,Gdx.graphics.getWidth()/15,Gdx.graphics.getHeight()/10);
//
//		font.draw(batch,String.valueOf(score),100,300);
//
//		batch.end();
//
//		birdCircle.set(birdX+Gdx.graphics.getWidth()/30, birdY+Gdx.graphics.getHeight()/20,Gdx.graphics.getWidth()/45);
////		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
////		shapeRenderer.setColor(Color.BLACK);
////		shapeRenderer.circle(coinCircle.x,coinCircle.y,coinCircle.radius);
////		shapeRenderer.circle(birdCircle.x,birdCircle.y,birdCircle.radius);
//
//
//		for(int i = 0;i<numberOfEnemy;i++){
//
////			shapeRenderer.circle(enemyX[i]+Gdx.graphics.getWidth()/30,Gdx.graphics.getHeight()/2+enemyOffSet1[i]+Gdx.graphics.getHeight()/20,Gdx.graphics.getWidth()/45);
////			shapeRenderer.circle(enemyX[i]+Gdx.graphics.getWidth()/30,Gdx.graphics.getHeight()/2+enemyOffSet2[i]+Gdx.graphics.getHeight()/20,Gdx.graphics.getWidth()/45);
////			shapeRenderer.circle(enemyX[i]+Gdx.graphics.getWidth()/30,Gdx.graphics.getHeight()/2+enemyOffSet3[i]+Gdx.graphics.getHeight()/20,Gdx.graphics.getWidth()/45);
//			if(Intersector.overlaps(birdCircle,enemyCircles1[i])||Intersector.overlaps(birdCircle,enemyCircles2[i])||Intersector.overlaps(birdCircle,enemyCircles3[i])){
//				gameState=2;
//			}
//
//		}
//		if(Intersector.overlaps(birdCircle,coinCircle)){
//			score+=10;
//			coinX=Gdx.graphics.getWidth()/2+coinDistance;
//			coinY=(random.nextFloat())*(Gdx.graphics.getHeight()-500);
//
//		}
//
//
//
//
//
//
//
//
//
//
////		shapeRenderer.end();
    }

    @Override
    public void dispose () {

    }

}
