package com.atilsamancioglu.survivorbirdstarter.Screens;

import com.atilsamancioglu.survivorbirdstarter.GameSurvivorBird;
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

public class GameGameScreen implements Screen {
    GameSurvivorBird game;


    SpriteBatch batch;
    Texture background;
    Texture tree;
    Texture bird;
    Texture enemy1;
    Texture enemy2;
    Texture enemy3;
    float birdX;
    float birdY;
    int gameState=0;
    float velocity=0;
    float gravity = 0.3f;
    Random random;
    int score=0;
    int scoreEnemy=0;
    BitmapFont font;
    BitmapFont font2;



    Circle birdCircle;
    ShapeRenderer shapeRenderer;



    int numberOfEnemy=3;
    float [] enemyX =new float[numberOfEnemy];
    float distance = 0;
    float enemyVelocity=5;
    float [] enemyOffSet1=new float[numberOfEnemy];
    float [] enemyOffSet2=new float[numberOfEnemy];
    float [] enemyOffSet3=new float[numberOfEnemy];
    Circle[] enemyCircles1;
    Circle[] enemyCircles2;
    Circle[] enemyCircles3;


    Texture coin;
    float coinX;
    float coinY;
    Circle coinCircle;
    float coinDistance;
    float coinVelocity=7;

    public GameGameScreen(GameSurvivorBird game) {
        this.game = game;


        batch=new SpriteBatch();
        background=new Texture("background.png");
        bird=new Texture("bird.png");
        birdX= Gdx.graphics.getWidth()/6;
        birdY=Gdx.graphics.getHeight()/2;
        tree=new Texture("tree.png");
        enemy1=new Texture("enemy.png");
        enemy2=new Texture("enemy.png");
        enemy3=new Texture("enemy.png");
        coin=new Texture("coin.png");



        distance=Gdx.graphics.getWidth()/2;
        coinDistance=Gdx.graphics.getWidth();
        random = new Random();
        birdCircle=new Circle();
        enemyCircles1=new Circle[numberOfEnemy];
        enemyCircles2=new Circle[numberOfEnemy];
        enemyCircles3=new Circle[numberOfEnemy];
        shapeRenderer=new ShapeRenderer();
        font=new BitmapFont();
        font.setColor(Color.WHITE);
        font.getData().setScale(4);
        font2=new BitmapFont();
        font2.setColor(Color.BLACK);
        font2.getData().setScale(6);


        coinCircle = new Circle();


        for(int i = 0;i<numberOfEnemy ;i++){
            enemyX[i]=Gdx.graphics.getWidth()-enemy1.getWidth()/2+i*distance;

            enemyOffSet1[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
            enemyOffSet2[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
            enemyOffSet3[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);

            enemyCircles1[i]=new Circle();
            enemyCircles2[i]=new Circle();
            enemyCircles3[i]=new Circle();

        }
        coinX=Gdx.graphics.getWidth()/2+coinDistance;
        coinY=(random.nextFloat())*(Gdx.graphics.getHeight()-500);
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

        for(int i = 0;i<numberOfEnemy;i++){
            if(Intersector.overlaps(enemyCircles1[i],enemyCircles2[i])||Intersector.overlaps(enemyCircles1[i],enemyCircles3[i])||Intersector.overlaps(enemyCircles2[i],enemyCircles3[i])){
                enemyOffSet1[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
                enemyOffSet2[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
                enemyOffSet3[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
            }
        }
        batch.begin();
        batch.draw(background,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
//		batch.draw(tree,500,170,Gdx.graphics.getWidth()/5,Gdx.graphics.getHeight()/2);

        if(gameState==1){


            if(enemyX[scoreEnemy] < Gdx.graphics.getWidth()/6){
                if(enemyVelocity<=20){
                    enemyVelocity+=0.2;
                }
                score++;
                if(scoreEnemy<numberOfEnemy-1){
                    scoreEnemy++;
                }else{
                    scoreEnemy=0;
                }
            }


            batch.draw(coin,coinX,coinY,Gdx.graphics.getWidth()/20,Gdx.graphics.getHeight()/10);

            if(coinX+Gdx.graphics.getWidth()/20<0){
                coinX=coinX+coinDistance+200;
                coinY=(random.nextFloat())*(Gdx.graphics.getHeight()-500);
            }else{
                coinX-=coinVelocity;
            }

            for(int i = 0; i<numberOfEnemy;i++){

                if(enemyX[i]<0){
                    enemyX[i]+=numberOfEnemy*distance;

                    enemyOffSet1[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
                    enemyOffSet2[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
                    enemyOffSet3[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);

                } else {
                    enemyX[i]-=enemyVelocity;
                }

                batch.draw(enemy1,enemyX[i],Gdx.graphics.getHeight()/2+enemyOffSet1[i],Gdx.graphics.getWidth()/15,Gdx.graphics.getHeight()/10);
                batch.draw(enemy2,enemyX[i],Gdx.graphics.getHeight()/2+enemyOffSet2[i],Gdx.graphics.getWidth()/15,Gdx.graphics.getHeight()/10);
                batch.draw(enemy3,enemyX[i],Gdx.graphics.getHeight()/2+enemyOffSet3[i],Gdx.graphics.getWidth()/15,Gdx.graphics.getHeight()/10);

                enemyCircles1[i]=new Circle(enemyX[i]+Gdx.graphics.getWidth()/30,Gdx.graphics.getHeight()/2+enemyOffSet1[i]+Gdx.graphics.getHeight()/20,Gdx.graphics.getWidth()/45);
                enemyCircles2[i]=new Circle(enemyX[i]+Gdx.graphics.getWidth()/30,Gdx.graphics.getHeight()/2+enemyOffSet2[i]+Gdx.graphics.getHeight()/20,Gdx.graphics.getWidth()/45);
                enemyCircles3[i]=new Circle(enemyX[i]+Gdx.graphics.getWidth()/30,Gdx.graphics.getHeight()/2+enemyOffSet3[i]+Gdx.graphics.getHeight()/20,Gdx.graphics.getWidth()/45);


            }


            coinCircle=new Circle(coinX+Gdx.graphics.getWidth()/37,Gdx.graphics.getHeight()/20+coinY,Gdx.graphics.getWidth()/58);


            if(Gdx.input.justTouched()){
                velocity=-8;
            }


            if(birdY>=Gdx.graphics.getHeight()-Gdx.graphics.getHeight()/20) {
                gameState = 2;
            }

            if(birdY>=0) {
                velocity += gravity;
                birdY = birdY - velocity;
            } else {
                gameState=2;
            }


        } else if(gameState==0) {
            if(Gdx.input.justTouched()){
                gameState=1;
            }
        } else if (gameState==2) {

            font2.draw(batch,"Game Over! Tap to play again!",Gdx.graphics.getWidth()/2-600,2*Gdx.graphics.getHeight()/3);

            if(Gdx.input.justTouched()){
                gameState=1;

                birdY=Gdx.graphics.getHeight()/2;

                coinX=Gdx.graphics.getWidth()/2+coinDistance;
                coinY=(random.nextFloat())*(Gdx.graphics.getHeight()-500);

                for(int i = 0;i<numberOfEnemy ;i++){
                    enemyX[i]=Gdx.graphics.getWidth()-enemy1.getWidth()/2+i*distance;

                    enemyOffSet1[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
                    enemyOffSet2[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);
                    enemyOffSet3[i] = (random.nextFloat()-0.5f)*(Gdx.graphics.getHeight()-400);


                    enemyCircles1[i]=new Circle();
                    enemyCircles2[i]=new Circle();
                    enemyCircles3[i]=new Circle();

                }

                velocity=0;
                enemyVelocity=5;
                score=0;
                scoreEnemy=0;

            }
        }


        batch.draw(bird,birdX,birdY,Gdx.graphics.getWidth()/15,Gdx.graphics.getHeight()/10);

        font.draw(batch,String.valueOf(score),100,300);

        batch.end();

        birdCircle.set(birdX+Gdx.graphics.getWidth()/30, birdY+Gdx.graphics.getHeight()/20,Gdx.graphics.getWidth()/45);
//		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
//		shapeRenderer.setColor(Color.BLACK);
//		shapeRenderer.circle(coinCircle.x,coinCircle.y,coinCircle.radius);
//		shapeRenderer.circle(birdCircle.x,birdCircle.y,birdCircle.radius);


        for(int i = 0;i<numberOfEnemy;i++){

//			shapeRenderer.circle(enemyX[i]+Gdx.graphics.getWidth()/30,Gdx.graphics.getHeight()/2+enemyOffSet1[i]+Gdx.graphics.getHeight()/20,Gdx.graphics.getWidth()/45);
//			shapeRenderer.circle(enemyX[i]+Gdx.graphics.getWidth()/30,Gdx.graphics.getHeight()/2+enemyOffSet2[i]+Gdx.graphics.getHeight()/20,Gdx.graphics.getWidth()/45);
//			shapeRenderer.circle(enemyX[i]+Gdx.graphics.getWidth()/30,Gdx.graphics.getHeight()/2+enemyOffSet3[i]+Gdx.graphics.getHeight()/20,Gdx.graphics.getWidth()/45);
            if(Intersector.overlaps(birdCircle,enemyCircles1[i])||Intersector.overlaps(birdCircle,enemyCircles2[i])||Intersector.overlaps(birdCircle,enemyCircles3[i])){
                gameState=2;
            }

        }
        if(Intersector.overlaps(birdCircle,coinCircle)){
            score+=10;
            coinX=Gdx.graphics.getWidth()/2+coinDistance;
            coinY=(random.nextFloat())*(Gdx.graphics.getHeight()-500);

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
