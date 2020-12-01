package Test;

import java.util.Scanner;

/**
 * 根据三角形应用的实际需要，分析设置的3个角度的合理性
 * 根据三角形计算面积应用的实际需要，分析设置的3个边长的合理性
 * 设计异常类，并对异常进行处理
 * 三角形三边：两边之和大于第三边，两边之差小于第三边
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入三角形的三个边的长度：");
        double sideLength1 = input.nextDouble();
        double sideLength2 = input.nextDouble();
        double sideLength3 = input.nextDouble();
        try{
            RaiseException.raiseExceptionOfside(sideLength1, sideLength2, sideLength3);
        }catch (mException x){
            System.out.println(x.getReason());
        }finally {
            System.out.println();
        }
        System.out.println("请输入三角形的三个角度的大小：");
        double innerAngle1 = input.nextDouble();
        double innerAngle2 = input.nextDouble();
        double innerAngle3 = input.nextDouble();
        try{
            RaiseException.raiseExceptionOfangle(innerAngle1, innerAngle2, innerAngle3);
        }catch (mException x){
            System.out.println(x.getReason());
        }
    }
}
class mException extends Exception{
    String reason;
    public mException(String reason){
        this.reason = reason;
    }
    public String getReason() {
        return reason;
    }
}
class RaiseException{
    public static void raiseExceptionOfside(double sideLength1, double sideLength2,
                                            double sideLength3) throws mException
    {
        if(sideLength1+sideLength2<=sideLength3 || sideLength1+sideLength3<=sideLength2
                || sideLength2+sideLength3<=sideLength1 || sideLength1-sideLength2>=sideLength3
                || sideLength1-sideLength3>=sideLength2 || sideLength2-sideLength3>=sideLength1)
        {
            throw new mException("三角形三边不满足条件 错误！");
        }
    }
    public static void raiseExceptionOfangle(double innerAngle1, double innerAngle2,
                                             double innerAngle3) throws mException
    {
        if(innerAngle1+innerAngle2+innerAngle3!=180)
        {
            throw new mException("三个内角和不等于180度 错误！");
        }
    }
}
