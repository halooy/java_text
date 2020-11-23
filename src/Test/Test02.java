package Test;

import java.util.Scanner;
/**
 * 学生信息输入
 * 学生成员变量设置三个分别为 ID 姓名 成绩
 * 人员进行输入并最终展示出来
 */
public class Test02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Student st = new Student();
        st.start();
        System.out.println("请输入学生人数：");
        int num = input.nextInt();
        Student[] student = new Student[num];
        for(int i=0; i<student.length; i++)
        {
            student[i] = new Student();
            System.out.println("请输入学生ID：");
            student[i].id = input.next();
            System.out.println("请输入学生姓名：");
            student[i].name = input.next();
            System.out.println("请输入学生成绩：");
            student[i].score = input.nextInt();
        }
        st.over();
        System.out.println();
        st.display();
        for(int i=0; i<student.length; i++)
        {
            System.out.println("ID："+student[i].id+"\t"+"姓名："+student[i].name+"\t"+"成绩："+student[i].score+"\t");
        }
    }
}

class Student{
    String id;
    String name;
    int score;

    public void start(){
        System.out.println("输入开始:");
    }
    public void over(){
       System.out.println("输入完毕!");
    }
    public void display(){
        System.out.println("学生信息：");
    }
}
