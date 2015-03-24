package com.dnn.zapbuild.designpatterns.decorator.factory;

import com.dnn.zapbuild.designpatterns.decorator.CustomColorShape;
import com.dnn.zapbuild.designpatterns.decorator.models.Circle;
import com.dnn.zapbuild.designpatterns.decorator.models.Rectangle;
import com.dnn.zapbuild.designpatterns.decorator.models.Shape;

/**
 * Created by zapbuild on 10/12/14.
 */
public class ShapeFactory {

    public static Shape getShape(ShapeType type)
    {
        switch (type)
        {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            default:
                return new Circle();
        }

    }

    public static Shape getShape(Shape shape,String color)
    {
        return new CustomColorShape(shape,color);
    }

    public enum ShapeType
    {
        RECTANGLE,CIRCLE,CUSTOM
    }

}
