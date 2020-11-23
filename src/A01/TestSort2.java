package A01;

import java.io.DataInputStream;
import java.io.IOException;


public class TestSort2 {

    public void sort1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("排序结果从小到大为");
        for(int i = 0; i < array.length; i++){
            System.out.print(+array[i]);
        }
        System.out.println();
    }

    public void maxmin(int[] array){
        System.out.println("最大值是："+array[array.length-1]+",最小值是："+array[0]);
    }

    public void average(int[] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("平均值是："+(sum/array.length));
    }

    public static void main(String[] args)throws IOException{
        DataInputStream din = new DataInputStream(System.in);
        int[] array = new int[3];
        System.out.println("输入三个整数：");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(din.readLine());
        }
        TestSort2 test2 = new TestSort2();
        test2.sort1(array);
        test2.maxmin(array);
        test2.average(array);
    }
}


