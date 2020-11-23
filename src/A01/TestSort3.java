package A01;

public class TestSort3 {

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

    public static void main(String[] args){
        int[] array = new int[3];
       for(int i = 0; i < args.length; i++){
           array[i] = Integer.parseInt(args[i]);
       }
        TestSort3 test3 = new TestSort3();
        test3.sort1(array);
        test3.maxmin(array);
        test3.average(array);
    }
}
