package com.dnn.zapbuild.designpatterns.decorator;

import android.util.Log;

import com.dnn.zapbuild.designpatterns.decorator.models.Shape;

/**
 * Created by zapbuild on 10/12/14.
 */
public class CustomColorShape extends ShapeDecorator {

    String color;
    public CustomColorShape(Shape shape,String color) {
        super(shape);
        this.color=color;
    }

    @Override
    public void draw() {
        super.draw();
        Log.v("SHAPE",String.format("DRAW %s INSIDE",color));
    }
}
