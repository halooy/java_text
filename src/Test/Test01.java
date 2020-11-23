package Test;
import java.util.Scanner;

/**
 * 利用至少2种不同形式的循环语句完成99乘法表的打印输出；格式为矩形
 * 利用break、continue实现下三角形状99乘法表的打印输出；
 * 编程实现矩阵的基本数学运算（加减乘除）
 */
public class Test01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Test01 test = new Test01();
        test.form1();
        test.form2();
        test.form3();
        double[][] matrix1 = test.Matrix1();                        //创建矩阵1
        double[][] matrix2 = test.Matrix2();                        //创建矩阵2
        System.out.println("请输入矩阵要进行的运算符号：");
        char calculate = scanner.next().charAt(0);
        switch (calculate)
        {
            case '+':
                test.Add(matrix1, matrix2);                              //矩阵的加法运算
                break;
            case '-':
                test.Sub(matrix1,matrix2);                               //矩阵的减法运算
                break;
            case '*':
                test.Mul(matrix1, matrix2);                              //矩阵的乘法运算
                break;
            case '／':
                test.Div(matrix1,matrix2);                               //矩阵的除法运算
                break;
        }
    }
    //for循环完成99乘法表的打印输出
    public void form1(){
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    //while循环完成99乘法表的打印输出
    public void form2(){
        int i = 1;
        while(i <= 9){
            int j = 1;
            while (j <= 9){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
                j++;
            }
            i++;
            System.out.println();
        }
        System.out.println();
    }
    //利用break实现下三角形状99乘法表的打印输出
    public void form3(){
        int i = 1;
        while(true){
            int j = 1;
            while (true){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
                j++;
                if(j == (i+1))
                    break;
            }
            i++;
            System.out.println();
            if(i == 10)
                break;
        }
        System.out.println();
    }

    //编程实现矩阵的基本数学运算（加减乘除）
    /**
     * 构造一个二维数组来存放矩阵参数
     * matrix[row][col]   row为行，col为列。
     * 矩阵的加法、减法只能两个行列相同的矩阵相运算。
     * 矩阵的乘法：A*B=C，C的行数取决于A，列数取决于B。
     * 矩阵的除法：A／B=A*B^（-1） 实则求B的逆矩阵，再与A相乘。注意：除数求逆矩阵
     */
    public double[][] Matrix1()
    {
        Scanner input = new Scanner(System.in);
        int row1, col1;
        System.out.println("请输入矩阵的行数和列数：");
        row1 = input.nextInt();
        col1 = input.nextInt();
        double[][] matrix1 = new double[row1][col1];
        for(int i = 0; i < matrix1.length; i++){
            System.out.println("请输入第"+(i+1)+"行数据");
            for(int j = 0; j < matrix1[i].length; j++){
                matrix1[i][j] = input.nextDouble();
            }
        }

        System.out.println("矩阵1为：");
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[i].length; j++){
                System.out.print(matrix1[i][j]+"\t"+"\t");
            }
            System.out.println();
        }
        return matrix1;
    }
    public double [][] Matrix2()
    {
        Scanner input = new Scanner(System.in);
        int row2, col2;
        System.out.println("请输入矩阵2的行数和列数：");
        row2 = input.nextInt();
        col2 = input.nextInt();
        double[][] matrix2 = new double[row2][col2];
        for(int i = 0; i < matrix2.length; i++){
            System.out.println("请输入第"+(i+1)+"行数据");
            for(int j = 0; j < matrix2[i].length; j++){
                matrix2[i][j] = input.nextDouble();
            }
        }

        System.out.println("矩阵2为：");
        for(int i = 0; i < matrix2.length; i++){
            for(int j = 0; j < matrix2[i].length; j++){
                System.out.print(matrix2[i][j]+"\t"+"\t");
            }
            System.out.println();
        }
        return matrix2;
    }
    public void Add(double[][] matrix1, double[][] matrix2)
    {
        double[][] matrixOfAdd = new double[matrix1.length][matrix1[0].length];
        if(matrix1.length == matrix2.length){
            for(int i = 0; i < matrix1.length; i++){
                if(matrix1[i].length == matrix2[i].length){
                    for(int j = 0; j < matrix1[i].length; j++){
                        matrixOfAdd[i][j] = matrix1[i][j] + matrix2[i][j];
                    }
                }else{
                    System.out.println("请输入两个行列相同的矩阵。");
                    break;
                }
            }
        }else{
            System.out.println("请输入两个行列相同的矩阵。");
        }
        System.out.println("矩阵加法运算结果：");
        for(int i = 0; i < matrixOfAdd.length; i++){
            for(int j = 0; j < matrixOfAdd[i].length; j++){
                System.out.print(matrixOfAdd[i][j]+"\t"+"\t");
            }
            System.out.println();
        }
    }
    public void Sub(double[][] matrix1, double[][] matrix2)
    {
        double[][] matrixOfSub = new double[matrix1.length][matrix1[0].length];
        if(matrix1.length == matrix2.length){
            for(int i = 0; i < matrix1.length; i++){
                if(matrix1[i].length == matrix2[i].length){
                    for(int j = 0; j < matrix1[i].length; j++){
                        matrixOfSub[i][j] = matrix1[i][j] - matrix2[i][j];
                    }
                }else{
                    System.out.println("请输入两个行列相同的矩阵。");
                    break;
                }
            }
        }else{
            System.out.println("请输入两个行列相同的矩阵。");
        }
        System.out.println("矩阵减法运算结果：");
        for(int i = 0; i < matrixOfSub.length; i++){
            for(int j = 0; j < matrixOfSub[i].length; j++){
                System.out.print(matrixOfSub[i][j]+"\t"+"\t");
            }
            System.out.println();
        }
    }
    public void Mul(double[][] matrix1, double[][] matrix2)
    {
        double[][] matrixOfMul = new double[matrix1.length][matrix2[0].length];
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix2[0].length; j++){
                for(int k = 0; k < matrix1[0].length; k++){
                    matrixOfMul[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("矩阵乘法运算结果：");
        for(int i = 0; i < matrixOfMul.length; i++){
            for(int j = 0; j < matrixOfMul[i].length; j++){
                System.out.print(matrixOfMul[i][j]+"\t"+"\t");
            }
            System.out.println();
        }
    }
    public void Div(double[][] matrix1, double[][] matrix2)
    {
        //求B的逆矩阵
        //num为矩阵前的系数1／（ad-bc）
        double num = 1 / (matrix2[1][1]*matrix2[0][0] - matrix2[0][1]*matrix2[1][0]);
        for(int i = 0; i < matrix2.length; i++)
        {
            for(int j = 0; j < matrix2[i].length; j++)
            {
                matrix2[i][j] = num * matrix2[i][j];
                if(matrix2[i][j]==matrix2[0][1] || matrix2[i][j]==matrix2[1][0])
                {
                    matrix2[i][j] = matrix2[i][j]*(-1);
                }
            }
        }
        System.out.println("matrix2的逆矩阵：");
        for(int i=0; i<matrix2.length; i++)
        {
            for(int j=0; j<matrix2[i].length; j++)
            {
                System.out.print(matrix2[i][j]+"\t"+"\t");
            }
            System.out.println();
        }
        //matrix1 与 matrix2的逆矩阵相乘
        double[][] matrixOfDiv = new double[matrix1.length][matrix2[0].length];
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix2[0].length; j++){
                for(int k = 0; k < matrix1[0].length; k++){
                    matrixOfDiv[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("矩阵除法运算结果：");
        for(int i = 0; i < matrixOfDiv.length; i++){
            for(int j = 0; j < matrixOfDiv[i].length; j++){
                System.out.print(matrixOfDiv[i][j]+"\t"+"\t");
            }
            System.out.println();
        }
    }
}
/**
 * 问题1
 * 实现二维数组 matrixOfAdd 的长度和 matrix1 的长度相等
 * 如何动态定义二维数组长度
 * double[][] matrixOfAdd = new double[matrix1.length][];
 * 出现问题：
 * 创建矩阵时出现Exception in thread "main" java.lang.NullPointerException空指针异常
 * 解决方法：
 * double[][] matrixOfAdd = new double[matrix1.length][matrix1[0].length];
 * 矩阵每行元素个数相等，可以用第一行的元素个数来定义矩阵列数
 * 问题收获：
 * 对于二维数组 arr[i][j] 来说，i的位置必须赋值，而j的位置可以赋值，也可以空着不赋值
 * 但不赋值系统自动赋初值为空值NULL，赋值后初值为0。所以之前报错空指针异常。
 *
 * 问题2
 * 三阶矩阵如果进行初等行变换，三行进行加减运算直至原矩阵变为单位矩阵，则右方为逆矩阵。
 * 判断条件为是否等于单位矩阵
 * 但进行不定值的加减运算使之成为单位矩阵不会实现。
 *
 * 问题3
 * 二阶逆矩阵的求法运行结果出现错误。
 * 错误1：
 * 系数与矩阵相乘时第二列元素结果异常
 * 分析：
 * 浮点数存在误差，矩阵运算后取近似。
 * 三阶矩阵需要先解决数学问题。
 *
 */