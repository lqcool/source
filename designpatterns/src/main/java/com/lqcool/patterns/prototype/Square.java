package com.lqcool.patterns.prototype;

/**
 * @Auther: lqcool
 * @Description:
 */
public class Square extends Shape{
    public Square(){
        this.type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square:: draw() method.");
    }
}
