package A02;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 我的兜里有1元面值钱币n张，5元面值的m张，10元面值的k张，用这些钱中的一张或者若干张，能够组合出来多少种可以付出的钱数？
 */
public class TestCombineMoney {
    /**
     * 根据序列取
     * @param array
     * @param sequence
     * @return
     */
//    public int getSumBySequence(int[] array,int[] sequence){
//        Set<Integer> res = new HashSet<>();
//        int sum=0;
//        for(int i:sequence){
//            sum+=array[i];
//        }
//        return sum;
//    }
//    public int combine(int[] array){
//        List<int[]> allList = new LinkedList<>();
//        return 0;
//    }

    private ArrayList<ArrayList<Integer>> getSubArray(int[] arr,int length) {
        Set<Integer> res = new HashSet<>();
        ArrayList<ArrayList<Integer>> bList=new ArrayList<>();
        int mark=0;
        int nEnd=1<<length;
        boolean bNullset=false;
        for (mark=0;mark<nEnd;mark++) {
            ArrayList<Integer> aList=new ArrayList<>();
            bNullset=true;
            for (int i=0;i<length;i++) {
                if (((1<<i)&mark)!=0) {
                    bNullset=false;
                    aList.add(arr[i]);
                }
            }
//            int s = aList.stream().mapToInt(p->p).sum();
            int sum = 0;
            for (Integer integer : aList) {
                sum +=integer;
            }
            if(sum > 0){
                res.add(sum);
            }
//            bList.add(aList);
        }
        System.out.println("组合一共:"+res.size());
        return bList;
    }
    public static void main(String[] args){
        Set<Integer> res = new HashSet<>();
        int[] array = new int[]{1,1,1,1,1,5,5,5,5,10,10,10,10,10,10,10,10};
        TestCombineMoney st = new TestCombineMoney();
        ArrayList<ArrayList<Integer>> subArray = st.getSubArray(array, array.length);
//        AtomicInteger count = new AtomicInteger();

//        subArray.stream().forEach(k->{
//            long count1 = k.stream().mapToInt(p->p).sum();
//            if(count1 > 0){
//                res.add((int)count1);
//            }
//            count.getAndIncrement();
//        });
//        System.out.println("==================");
//        System.out.println("次数："+count);
//        System.out.println("组合一共："+res.size()+"种");

    }
}
