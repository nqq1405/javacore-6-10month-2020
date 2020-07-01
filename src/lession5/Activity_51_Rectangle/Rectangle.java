package lession5.Activity_51_Rectangle;

import java.util.Scanner;

public class Rectangle {
    private float width;
    private float height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public float chuvi(float width,float height ){
        return (width + height)/2;
    }

    public float dientich(float width,float height ){
        return width*height;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap width: "); width = sc.nextFloat();
        System.out.println("Nhap height: "); height = sc.nextFloat();
    }
    public boolean kt_hinh_vuong(Rectangle re){
        if(re.width == re.height){
            return true;
        }
        return false;
    }
}
