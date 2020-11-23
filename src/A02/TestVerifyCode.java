package A02;

/**
各类网页上面的动态生成的验证码，有纯粹数字的，有字母数字混合的，有大小写字母和数字混合的，它们究竟是怎么产生的？
请研究其中的奥秘，设计函数，实现动态验证码的生成和显示。
 */

import java.util.Random;

public class TestVerifyCode {
    public static String verigyCode(){
        Random random = new Random();
        String str = "";
        for(int i = 0; i < 6; i++){
            int key = random.nextInt(3);
            switch (key){
                case 0:
                    int code1 = random.nextInt(10);
                    str += code1;
                    break;
                case 1:
                    char code2 = (char)(random.nextInt(26) + 65);
                    str += code2;
                    break;
                case 2:
                    char code3 = (char)(random.nextInt(26) + 97);
                    str += code3;
                    break;
            }
        }
        return str;
    }
    public static void main(String[] args){
        System.out.println("随机验证码："+verigyCode());
    }
}
