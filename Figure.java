package com.company;

abstract class Figure {
    float x;
    float y;

    Figure(float x, float y){
        this.x=x;
        this.y=y;
    }
    abstract float getPerimetr();
    abstract float getArea();
}

class Rectangle extends Figure{
    float width;
    float height;

    Rectangle(float x, float y, float width, float height){
        super(x,y);
        this.width=width;
        this.height=height;
    }
    float getPerimetr(){
        return width*2+height*2;
    }
    float getArea(){
        return width* height;
    }
}
