package com.atilsamancioglu.survivorbirdstarter.Screens;

import com.atilsamancioglu.survivorbirdstarter.SurvivorBird;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Intersector;

import java.util.Random;

public class GameScreen implements Screen {



    SurvivorBird survivorBird;

    public GameScreen(SurvivorBird survivorBird) {
        this.survivorBird = survivorBird;
//        this.survivorBird.batch=new SpriteBatch();
//        this.survivorBird.background=new Texture("background.png");
//        this.survivorBird.bird=new Texture("bird.png");
//        this.survivorBird.birdX=Gdx.graphics.getWidth()/6;
//        this.survivorBird.birdY=Gdx.graphics.getHeight()/2;
//        this.survivorBird.tree=new Texture("tree.png");
//        this.survivorBird.enemy1=new Texture("enemy.png");
//        this.survivorBird.enemy2=new Texture("enemy.png");
//        this.survivorBird.enemy3=new Texture("enemy.png");
//        this.survivorBird.coin=new Texture("coin.png");
//
//
//
//        this.survivorBird.distance=Gdx.graphics.getWidth()/2;
//        this.survivorBird.coinDistance=Gdx.graphics.getWidth();
//        this.survivorBird.random = new Random();
//        this.survivorBird.birdCircle=new Circle();
//        this.survivorBird.enemyCircles1=new Circle[this.survivorBird.numberOfEnemy];
//        this.survivorBird.enemyCircles2=new Circle[this.survivorBird.numberOfEnemy];
//        this.survivorBird.enemyCircles3=new Circle[this.survivorBird.numberOfEnemy];
//        this.survivorBird.shapeRenderer=new ShapeRenderer();
//        this.survivorBird.font=new BitmapFont();
//        this.survivorBird.font.setColor(Color.WHITE);
//        this.survivorBird.font.getData().setScale(4);
//        this.survivorBird.font2=new BitmapFont();
//        this.survivorBird.font2.setColor(Color.BLACK);
//        this.survivorBird.font2.getData().setScale(6);
//
//
//        this.survivorBird.coinCircle = new Circle();
//
//
//        for(int i = 0;i<this.survivorBird.numberOfEnemy ;i++){
//            this.survivorBird.enemyX[i]=Gdx.graphics.getWidth()-this.survivorBird.enemy1.getWidth()/2+i*this.survivorBird.distance;
//
//            this.survivorBird.enemyOffSet1[i] = (this.survivorBird.random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
//            this.survivorBird.enemyOffSet2[i] = (this.survivorBird.random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
//            this.survivorBird.enemyOffSet3[i] = (this.survivorBird.random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
//
//            this.survivorBird.enemyCircles1[i]=new Circle();
//            this.survivorBird.enemyCircles2[i]=new Circle();
//            this.survivorBird.enemyCircles3[i]=new Circle();
//
//        }
//        this.survivorBird.coinX=Gdx.graphics.getWidth()/2+this.survivorBird.coinDistance;
//        this.survivorBird.coinY=(this.survivorBird.random.nextFloat())*(Gdx.graphics.getHeight()-500);

    }

    @Override
    public void show() {


    }

    @Override
    public void render(float delta) {

        for(int i = 0;i<survivorBird.numberOfEnemy;i++){
            if(Intersector.overlaps(survivorBird.enemyCircles1[i],survivorBird.enemyCircles2[i])||Intersector.overlaps(survivorBird.enemyCircles1[i],survivorBird.enemyCircles3[i])||Intersector.overlaps(survivorBird.enemyCircles2[i],survivorBird.enemyCircles3[i])){
                survivorBird.enemyOffSet1[i] = (survivorBird.random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
                survivorBird.enemyOffSet2[i] = (survivorBird.random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
                survivorBird.enemyOffSet3[i] = (survivorBird.random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
            }
        }
        survivorBird.batch.begin();
        survivorBird.batch.draw(survivorBird.background,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
//		batch.draw(tree,500,170,Gdx.graphics.getWidth()/5,Gdx.graphics.getHeight()/2);

        if(survivorBird.gameState==1){


            if(survivorBird.enemyX[survivorBird.scoreEnemy] < Gdx.graphics.getWidth()/6){
                if(survivorBird.enemyVelocity<=20){
                    survivorBird.enemyVelocity+=0.2;
                }
                survivorBird.score++;
                if(survivorBird.scoreEnemy<survivorBird.numberOfEnemy-1){
                    survivorBird.scoreEnemy++;
                }else{
                    survivorBird.scoreEnemy=0;
                }
            }


            survivorBird.batch.draw(survivorBird.coin,survivorBird.coinX,survivorBird.coinY,Gdx.graphics.getWidth()/20,Gdx.graphics.getHeight()/10);

            if(survivorBird.coinX+Gdx.graphics.getWidth()/20<0){
                survivorBird.coinX=survivorBird.coinX+survivorBird.coinDistance+200;
                survivorBird.coinY=(survivorBird.random.nextFloat())*(Gdx.graphics.getHeight()-500);
            }else{
                survivorBird.coinX-=survivorBird.coinVelocity;
            }

            for(int i = 0; i<survivorBird.numberOfEnemy;i++){

                if(survivorBird.enemyX[i]<0){
                    survivorBird.enemyX[i]+=survivorBird.numberOfEnemy*survivorBird.distance;

                    survivorBird.enemyOffSet1[i] = (survivorBird.random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
                    survivorBird.enemyOffSet2[i] = (survivorBird.random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
                    survivorBird.enemyOffSet3[i] = (survivorBird.random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);

                } else {
                    survivorBird.enemyX[i]-=survivorBird.enemyVelocity;
                }

                survivorBird. batch.draw(survivorBird.enemy1,survivorBird.enemyX[i],Gdx.graphics.getHeight()/2+survivorBird.enemyOffSet1[i],Gdx.graphics.getWidth()/15,Gdx.graphics.getHeight()/10);
                survivorBird.batch.draw(survivorBird.enemy2,survivorBird.enemyX[i],Gdx.graphics.getHeight()/2+survivorBird.enemyOffSet2[i],Gdx.graphics.getWidth()/15,Gdx.graphics.getHeight()/10);
                survivorBird.batch.draw(survivorBird.enemy3,survivorBird.enemyX[i],Gdx.graphics.getHeight()/2+survivorBird.enemyOffSet3[i],Gdx.graphics.getWidth()/15,Gdx.graphics.getHeight()/10);

                survivorBird.enemyCircles1[i]=new Circle(survivorBird.enemyX[i]+Gdx.graphics.getWidth()/30,Gdx.graphics.getHeight()/2+survivorBird.enemyOffSet1[i]+Gdx.graphics.getHeight()/20,Gdx.graphics.getWidth()/45);
                survivorBird.enemyCircles2[i]=new Circle(survivorBird.enemyX[i]+Gdx.graphics.getWidth()/30,Gdx.graphics.getHeight()/2+survivorBird.enemyOffSet2[i]+Gdx.graphics.getHeight()/20,Gdx.graphics.getWidth()/45);
                survivorBird.enemyCircles3[i]=new Circle(survivorBird.enemyX[i]+Gdx.graphics.getWidth()/30,Gdx.graphics.getHeight()/2+survivorBird.enemyOffSet3[i]+Gdx.graphics.getHeight()/20,Gdx.graphics.getWidth()/45);


            }


            survivorBird.coinCircle=new Circle(survivorBird.coinX+Gdx.graphics.getWidth()/37,Gdx.graphics.getHeight()/20+survivorBird.coinY,Gdx.graphics.getWidth()/58);


            if(Gdx.input.justTouched()){
                survivorBird.velocity=-7;



            }


            if(survivorBird.birdY>=Gdx.graphics.getHeight()-Gdx.graphics.getHeight()/20) {
                survivorBird.gameState = 2;
            }

            if(survivorBird.birdY>=0) {
                survivorBird.velocity += survivorBird.gravity;
                survivorBird.birdY = survivorBird.birdY - survivorBird.velocity;
            } else {
                survivorBird.gameState=2;
            }


        } else if(survivorBird.gameState==0) {
            if(Gdx.input.justTouched()){
                survivorBird.gameState=1;
            }
        } else if (survivorBird.gameState==2) {

            survivorBird.font2.draw(survivorBird.batch,"Game Over! Tap to play again!",Gdx.graphics.getWidth()/2-600,2*Gdx.graphics.getHeight()/3);

            if(Gdx.input.justTouched()){
                survivorBird.gameState=1;

                survivorBird.birdY=Gdx.graphics.getHeight()/2;

                survivorBird.coinX=Gdx.graphics.getWidth()/2+survivorBird.coinDistance;
                survivorBird.coinY=(survivorBird.random.nextFloat())*(Gdx.graphics.getHeight()-500);

                for(int i = 0;i<survivorBird.numberOfEnemy ;i++){
                    survivorBird.enemyX[i]=Gdx.graphics.getWidth()-survivorBird.enemy1.getWidth()/2+i*survivorBird.distance;

                    survivorBird.enemyOffSet1[i] = (survivorBird.random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
                    survivorBird.enemyOffSet2[i] = (survivorBird.random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
                    survivorBird.enemyOffSet3[i] = (survivorBird.random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);


                    survivorBird.enemyCircles1[i]=new Circle();
                    survivorBird.enemyCircles2[i]=new Circle();
                    survivorBird.enemyCircles3[i]=new Circle();

                }

                survivorBird.velocity=0;
                survivorBird.enemyVelocity=5;
                survivorBird.score=0;
                survivorBird.scoreEnemy=0;

            }
        }


        survivorBird.batch.draw(survivorBird.bird,survivorBird.birdX,survivorBird.birdY,Gdx.graphics.getWidth()/15,Gdx.graphics.getHeight()/10);

        survivorBird.font.draw(survivorBird.batch,String.valueOf(survivorBird.score),100,300);

        survivorBird.batch.end();

        survivorBird.birdCircle.set(survivorBird.birdX+Gdx.graphics.getWidth()/30, survivorBird.birdY+Gdx.graphics.getHeight()/20,Gdx.graphics.getWidth()/45);
//		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
//		shapeRenderer.setColor(Color.BLACK);
//		shapeRenderer.circle(coinCircle.x,coinCircle.y,coinCircle.radius);
//		shapeRenderer.circle(birdCircle.x,birdCircle.y,birdCircle.radius);


        for(int i = 0;i<survivorBird.numberOfEnemy;i++){

//			shapeRenderer.circle(enemyX[i]+Gdx.graphics.getWidth()/30,Gdx.graphics.getHeight()/2+enemyOffSet1[i]+Gdx.graphics.getHeight()/20,Gdx.graphics.getWidth()/45);
//			shapeRenderer.circle(enemyX[i]+Gdx.graphics.getWidth()/30,Gdx.graphics.getHeight()/2+enemyOffSet2[i]+Gdx.graphics.getHeight()/20,Gdx.graphics.getWidth()/45);
//			shapeRenderer.circle(enemyX[i]+Gdx.graphics.getWidth()/30,Gdx.graphics.getHeight()/2+enemyOffSet3[i]+Gdx.graphics.getHeight()/20,Gdx.graphics.getWidth()/45);
            if(Intersector.overlaps(survivorBird.birdCircle,survivorBird.enemyCircles1[i])||Intersector.overlaps(survivorBird.birdCircle,survivorBird.enemyCircles2[i])||Intersector.overlaps(survivorBird.birdCircle,survivorBird.enemyCircles3[i])){
                survivorBird.gameState=2;
            }

        }
        if(Intersector.overlaps(survivorBird.birdCircle,survivorBird.coinCircle)){
            survivorBird.score+=10;
            survivorBird.coinX=Gdx.graphics.getWidth()/2+survivorBird.coinDistance;
            survivorBird.coinY=(survivorBird.random.nextFloat())*(Gdx.graphics.getHeight()-500);

        }










//		shapeRenderer.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
