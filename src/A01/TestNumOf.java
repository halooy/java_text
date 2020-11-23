package A01;

import java.util.Scanner;

public class TestNumOf {

    public static int numberOfOne(int n){
        int a = n;
        int count = 0;
        while(n != 0){
            count++;
            n = n & (n-1);
        }
        return count;
    }

//    public void numberOfOne2(int n){
//        int count = 0;
//        int flag = 1;
//        int a = n;
//        while(flag <= n){
//            count++;
//            flag = flag<<1;
//        }
//        System.out.println(a+"对应二进制数据中1的个数为："+count);
//    }

//    public static int time3(int n){
//        int a = n;
//        int count=0;
//        while(~n!=0){
//            n|=(n+1);
//            count++;
//        }
//        return count;
//    }
    public static int numberOfZero(int n){
        //统计n的1的个数
        int countOfOne = 0;
        //统计计算的截止数字
        int count = 0;
        //统计0的个数
        int countOfZero = 0;
        int input = n;
        countOfOne = numberOfOne(n);
        while(input != 0){
            if((input & 1) == 1){
                count++;
                if(count == countOfOne){
                    break;
                }
            }else{
                countOfZero++;
            }
            input = input >>1;
        }
        return countOfZero;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int n = scanner.nextInt();
//        TestNumOf test = new TestNumOf();
//        test.numberOfOne2(n);
        System.out.println("对应二进制数据中1的个数为："+numberOfOne(n));
        System.out.println("对应二进制数据中0的个数为："+numberOfZero(n));
    }

}
