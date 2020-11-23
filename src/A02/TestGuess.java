package A02;

/**
编写猜数字游戏。程序预先生成一个0~9之间的随机整数，用户键盘输入（使用Scanner实现）自己所猜的数字，
如果输入数字和计算机产生的数字相等，则表示猜对了，输出相关信息；否则根据两个数字的大小，输出“猜大了”或者“猜小了”。
如果一直猜错，则程序一直执行，直到猜对为止。
另外，需要统计用户猜数字所用次数，并在结束程序运行前显示该信息。
 */

import java.util.Random;
import java.util.Scanner;

public class TestGuess {

    public void GuessDigital(){
        Random r = new Random();
        int i1 = r.nextInt(10);                         //程序随机生的数字
        Scanner scanner = new Scanner(System.in);
        System.out.println("游戏开始：");
        int num = 0;                                            //比较次数
        while(true){
            System.out.println("请输入一个0-10的整数：");
            int i2 = scanner.nextInt();                         //选手输入猜测数字
            if(i1 != i2){
                num++;
                if(i1 > i2){
                    System.out.println("很遗憾，猜小了，请再试一次");
                }else{
                    System.out.println("很遗憾，猜大了，请再试一次");
                }
                continue;
            }
            if(i1 == i2){
                num++;
                System.out.println("恭喜您！猜测正确！！！");
                break;
            }
        }
        System.out.println("您共猜测"+num+"次");
    }

    public static void main(String[] args){
        TestGuess tg = new TestGuess();
        tg.GuessDigital();
    }
}
