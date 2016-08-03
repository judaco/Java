package graphicshape;

/**
 * Created by eladlavi on 31/07/2016.
 */
public class Square extends Rectangle {

    public Square(int side){
        super(side, side);
    }

    public void setSide(int side){
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public void setWidth(int width) {
        setSide(width);
    }

    @Override
    public void setHeight(int height) {
        setSide(height);
    }

}