package A02;

/**
 * 产生指定数目个0~100之间的整数作为考试成绩，试着统计各个分数段成绩的个数，以数组的形式返回。
 * 数组的下标为0存贮不及格人数，1存贮60分数段人数，2存贮70分数段人数，3存贮80分数段人数，4存贮90以上分数段人数。
 */

import java.util.Random;
import java.util.Scanner;

public class TestScore {
    public int[][] scoreOf(){
        Random random = new Random();
        System.out.println("请输入学生个数：");
        Scanner scanner = new Scanner(System.in);
        int person = scanner.nextInt();
        int[] num = new int[person];
        for(int i = 0; i < person; i++){
            int i1 = random.nextInt(100);
            num[i] = i1;
        }
        int[][] scoreOf = new int[5][num.length];
        int j = 0, k = 0, l = 0, m = 0, n = 0;
        int count0 = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] < 60){
                scoreOf[0][j] = num[i];
                j++;
                count0++;
            }else if(num[i] >= 60 && num[i] < 70){
                scoreOf[1][k] = num[i];
                k++;
                count1++;
            }else if(num[i] >= 70 && num[i] < 80){
                scoreOf[2][l] = num[i];
                l++;
                count2++;
            }else if(num[i] >= 80 && num[i] < 90){
                scoreOf[3][m] = num[i];
                m++;
                count3++;
            }else if(num[i] >= 90 && num[i] < 100){
                scoreOf[4][n] = num[i];
                n++;
                count4++;
            }
        }
        for(int i = 0; i < 5; i++){
        switch (i) {
                case 0:
                    System.out.println("成绩不及格的人数："+count0);
                    break;
                case 1:
                    System.out.println("成绩在60-70的人数："+count1);
                    break;
                case 2:
                    System.out.println("成绩在70-80的人数："+count2);
                    break;
                case 3:
                    System.out.println("成绩在80-90的人数："+count3);
                    break;
                case 4:
                    System.out.println("成绩在90-100的人数："+count4);
                    break;
            }
        }
        return scoreOf;
    }

    public static void main(String[] args){
        TestScore st = new TestScore();
        st.scoreOf();
//        int[][] score = st.scoreOf();
//        System.out.println("成绩分布人数分布：");
//        for(int i = 0; i < 5; i++){
//            switch (i){
//                case 0:
//                    System.out.println("成绩不及格分别为：");
//                    break;
//                case 1:
//                    System.out.println("成绩在60-70分别为：");
//                    break;
//                case 2:
//                    System.out.println("成绩在70-80分别为：");
//                    break;
//                case 3:
//                    System.out.println("成绩在80-90分别为：");
//                    break;
//                case 4:
//                    System.out.println("成绩在90-100分别为：");
//                    break;
//            }
//            for(int j = 0; j < score[i].length; j++){
//                System.out.print(score[i][j]+"\t");
//            }
//            System.out.println();
//        }
    }
}
