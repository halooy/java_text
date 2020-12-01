package Test;

import java.util.Scanner;

/**
 * 定义船的序号、名称、价格、载人量、载重量、船型
 *
 */
public class Test03 {
    public static void main(String[] args){
        Ships[] ship = {
                new name(),
                new passengerShip(1, "泰坦尼克号", 20000, 2000, 0,0),
                new passengerShip(2, "渔船"+"\t\t", 1000, 20, 0, 0),
                new cruiseShip(3, "邮轮"+"\t\t", 5000, 0, 100, 1),
                new cruiseShip(4, "货运船"+"\t", 6000, 0, 300, 1),};
        Scanner input = new Scanner(System.in);
        int shipOfID = 0;                                   //序号
        double sumprice = 0;                                //消费钱数
        int shipOfPeople = 0;                               //载人量
        int shipOfWeight = 0;                               //载货量
        int count = 0;
        String namesOfPassengerShip = "";
        String namesOfCruiseShip = "";

        Users user = new Users();
        System.out.println("请输入您的姓名：");
        user.setName(input.next());
        System.out.println("请输入您的年龄：");
        user.setAge(input.nextInt());
        if(user.getage() >= 18)
        {
            System.out.println("欢迎您"+user.getName()+"先生");
            System.out.println(" 您是否要使用租船系统 1是 0否");
            int a = input.nextInt();
            if(a == 1){
                for(Ships cr:ship){
                    cr.show();
                }
                System.out.println("请您选择要租船的数量");
                int b = input.nextInt();
                int ID[] = new int[b];
                for(int i = 1; i <= ID.length; i++) {
                    System.out.println("请您输入第" + i + "辆船的序号");
                    shipOfID = input.nextInt();
                    if (ship[shipOfID].type == 0) {
                        shipOfPeople = shipOfPeople + ship[shipOfID].people;//people
                        sumprice = sumprice + ship[shipOfID].price;//price
                        namesOfPassengerShip = namesOfPassengerShip + ship[shipOfID].name+ ",";//name
                    }
                    if (ship[shipOfID].type == 1) {
                        shipOfWeight = shipOfWeight + ship[shipOfID].weight;//weigth
                        sumprice = sumprice + ship[shipOfID].price;//price
                        namesOfCruiseShip = namesOfCruiseShip + ship[shipOfID].name + ",";//name
                    }
                }
                System.out.println("请输入租船天数");
                count = input.nextInt();
                System.out.println("您的账单详情如下：");
                System.out.println("********可以载人的船有********");
                System.out.println(namesOfPassengerShip+"共载人"+shipOfPeople+"人");
                System.out.println("********可以载货的船有********");
                System.out.println(namesOfCruiseShip+"共载"+shipOfWeight+"吨");
                System.out.println("共计消费"+count*sumprice+"元");

            }else{
                System.out.println("系统关闭！");
            }
        }else{
            System.out.println("未成年人无法使用！");
        }
    }
}

class Users
{
    private String name = "halo";
    private int age = 18;
    public Users(){

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getage()
    {
        return age;
    }

}
abstract class Ships
{
    public int id;
    public String name;
    public double price;
    public int people;
    public int weight;
    public int type;

    public Ships(){

    }
    public Ships(int id, String name, double price, int people, int weight, int type){
        this.id = id;
        this.name = name;
        this.price = price;
        this.people = people;
        this.weight = weight;
        this.type = type;
    }
    public abstract void show();
}
class passengerShip extends Ships
{
    public passengerShip(int id, String name, double price, int people,int weight, int type)
    {
        super(id,name,price,people,weight,type);
    }
    public void show(){
        System.out.println(id+"\t"+name+"\t"+price+"元/天  "+"\t载人:"+people+"人");
    }
}
class cruiseShip extends Ships
{
    public cruiseShip(int id, String name, double price, int people,int weight, int type)
    {
        super(id,name,price,people,weight,type);
    }
    public void show(){
        System.out.println(id+"\t"+name+"\t"+price+"元/天 "+"\t\t载货"+weight+"吨");
    }
}
class name extends Ships{

    public void show(){
        System.out.println("序号"+"\t名称"+"\t价格"+"\t载人"+"\t载物");
    }

}
/**
 *  **++cpp POINT
 *      cpp--->{c+3, c+2, c-1, c}
 *      *++cpp--->c+2
 *      **++cpp--->POINT
 *
 *
 */
