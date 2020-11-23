package A02;

public class TestCombineMoney02 {
        public static void main(String[] args) {
            int i,j,k;
            int count =0;//  数数用
            boolean isFlag = true ;
            int arr[]= new int [1000];
            for(i =0;i<=5;i++){
                for(j=0;j<=4;j++){
                    for(k=0;k<=8;k++){
                        isFlag = true ;
                        int num = i*1+j*5+k*10 ;

                        for(int l =0;l<count; l++){
                            if(num==arr[l]){
                                isFlag = false;
                                break ;
                            }
                        }
                        if(isFlag){
                            arr[count]=num ;
                            count ++;
                        }
                    }
                }
            }
            System.out.println(count-1);
            outPut (arr);

        }

        public static void outPut(int arr[]) {
            for(int i =0;i<arr.length;i++){
                System.out.println(arr[i]);

            }
        }

}
