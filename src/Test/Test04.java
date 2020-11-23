package Test;

import java.util.Scanner;

/**
 * 根据计算机绘图程序设计的需要，给出设计方案
 * 从绘制直线、绘制圆、绘制矩形、绘制扇形等功能需求出发，设计实现对应的父类、子类
 * 体现出重写功能
 * 体现出重载功能
 */
public class Test04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StraightLine sl = new StraightLine();
        Rectangle rec = new Rectangle();
        Circle cir = new Circle();
        Sector sector = new Sector();
        System.out.println("********图形如下********");
        System.out.println("1：直线\t\t\t 2：矩形");
        System.out.println("3：扇形\t\t\t 2：圆");
        boolean flag = true;
        while(flag)
        {
            System.out.println("请选择要绘制的图形：");
            int n = input.nextInt();
            switch (n) {
                case 1:
                    sl.name();
                    System.out.println("请输入两点坐标：");
                    double x1 = input.nextDouble();
                    double y1 = input.nextDouble();
                    double x2 = input.nextDouble();
                    double y2 = input.nextDouble();
                    sl.parameter(x1, y1, x2, y2);
                    break;
                case 2:
                    rec.name();
                    System.out.println("请输入一点坐标以及矩形的宽和高：");
                    double x = input.nextDouble();
                    double y = input.nextDouble();
                    double width = input.nextDouble();
                    double high = input.nextDouble();
                    rec.parameter(x, y, width, high);
                    break;
                case 3:
                    cir.name();
                    System.out.println("请输入一点坐标以及圆的半径：");
                    double x3 = input.nextDouble();
                    double y3 = input.nextDouble();
                    double r = input.nextDouble();
                    cir.parameter(x3, y3, r);
                    break;
                case 4:
                    sector.name();
                    System.out.println("请输入一点坐标以及扇形的半径和角度：");
                    double x4 = input.nextDouble();
                    double y4 = input.nextDouble();
                    double r4 = input.nextDouble();
                    double angle = input.nextDouble();
                    sector.parameter(x4, y4, r4, angle);
                    break;
            }
            System.out.println("绘制结束！");
            System.out.println("输入任意按键继续进行绘制，输入no结束绘制");
            String in = input.next();
            if(in.equals("no"))
                flag = false;
        }
    }
}
abstract class Graphics{
    abstract void name();
    abstract void parameter();
}
class StraightLine extends Graphics{
    void name(){
        System.out.println("绘制直线：");
    }
    void parameter(){

    }
    void parameter(double x1, double y1, double x2, double y2){
        if(x1==x2 && y1==y2){
            System.out.println("两点重合，无法构成直线！");
        }else{
            System.out.println("直线以（"+x1+"，"+y1+"）,（"+x2+"，"+y2+"）两点连线确定");
        }
    }
}
class Rectangle extends Graphics{
    void name(){
        System.out.println("绘制矩形：");
    }
    void parameter(){

    }
    void parameter(double x, double y, double width, double high){
        System.out.println("矩形以（"+x+"，"+y+"）坐标为左顶点，宽为："+width+"高为："+high);
    }
}
class Circle extends Graphics{
    void name(){
        System.out.println("绘制圆：");
    }
    void parameter() {

    }
    void parameter(double x, double y, double r){
        System.out.println("圆以（"+x+"，"+y+"）坐标为圆心，半径为："+r);
    }
}
class Sector extends Graphics{
    void name(){
        System.out.println("绘制扇形：");
    }
    void parameter(){

    }
    void parameter(double x, double y, double r, double angle){
        if(angle>0 && angle < 360) {
            System.out.println("扇形以（"+x+","+y+"）坐标为圆心，半径为："+r+"\t角度为"+angle);
        }else{
            System.out.println("角度超出范围");
        }
    }
}