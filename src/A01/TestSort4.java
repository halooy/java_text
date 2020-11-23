package A01;

import javax.swing.*;

public class TestSort4 {

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
        for(int i = 0; i < array.length; i++){
            JOptionPane.showMessageDialog(null,"排序结果从小到大为"+array[i]);
        }
    }

    public void maxmin(int[] array){
        JOptionPane.showMessageDialog(null,"最大值是："+array[array.length-1]+",最小值是："+array[0]);
    }

    public void average(int[] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        JOptionPane.showMessageDialog(null,"平均值是："+(sum/array.length));
    }

    public static void main(String[] args){

        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            String str = JOptionPane.showInputDialog(null,"请输入"+(i+1)+"个整数：");
            array[i] = Integer.parseInt(str);
        }
        TestSort4 test4 = new TestSort4();
        test4.sort1(array);
        test4.maxmin(array);
        test4.average(array);
    }
}
