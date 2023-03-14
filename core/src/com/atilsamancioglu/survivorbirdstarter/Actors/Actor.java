package com.atilsamancioglu.survivorbirdstarter.Actors;

import com.atilsamancioglu.survivorbirdstarter.GraphicsObj.GraphicsObj;
import com.atilsamancioglu.survivorbirdstarter.Tools.Circle;
import com.atilsamancioglu.survivorbirdstarter.Tools.Point2D;
import com.badlogic.gdx.graphics.Texture;

public abstract class Actor extends GraphicsObj {

    public  Point2D position;
    public float speed, radius;
    public Circle bounds;
    public Point2D direction;

    public Actor(Texture img,Point2D position,float speed,float radius){
        super(img);
        this.position=new Point2D(position);
        this.speed=speed;
        this.radius=radius;
        bounds=new Circle(position,radius);
        direction = new Point2D(0,0);

        position.add(direction.getX(),direction.getY());
    }
}
