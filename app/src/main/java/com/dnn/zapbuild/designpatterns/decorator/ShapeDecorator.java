package com.dnn.zapbuild.designpatterns.decorator;

import com.dnn.zapbuild.designpatterns.decorator.models.Shape;

/**
 * Created by zapbuild on 10/12/14.
 */
public class ShapeDecorator implements Shape {

    Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;

    }

    @Override
    public void draw() {
        shape.draw();
    }

}
