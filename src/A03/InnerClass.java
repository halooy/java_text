package A03;

public class InnerClass {
    public static void main(String[] args) {
        //先创建外部类对象，外部类对象再创建其内部类成员，再将创建的内部类成员对象作为外部类统一管理的设备
        // TODO Auto-generated method stub
        Computer2 u=new Computer2();
        Computer2.USB m=u.new mouse();
        Computer2.USB k=u.new keyboard();
        Computer2.USB h=u.new Headset();
        Computer2.USB b=u.new Bluetooth();
        u.addUSB(m);
        u.addUSB(k);
        u.addUSB(h);
        u.addUSB(b);
        u.turnon();
        u.turnoff();
    }
}
class Computer2
{
    USB[] USBDEV=new USB[4];
    void addUSB(USB u)
    {
        for(int i=0;i<USBDEV.length;i++)
        {
            if(USBDEV[i]==null)
            {
                USBDEV[i]=u;
                break;
            }
        }
    }
    interface USB
    {
        void turnon();
        void turnoff();
    }
    void turnon()
    {
        System.out.println("打开设备");
        for(int i=0;i<USBDEV.length;i++)
        {
            if(USBDEV[i]!=null)
            {
                USBDEV[i].turnon();;
            }
        }
    }
    void turnoff()
    {
        System.out.println("关闭设备");
        for(int i=0;i<USBDEV.length;i++)
        {
            if(USBDEV[i]!=null)
            {
                USBDEV[i].turnoff();;
            }
        }
    }
    class mouse implements USB
    {
        public void turnon(){System.out.println("鼠标打开");}
        public void turnoff(){System.out.println("鼠标关闭");}
    }
    class keyboard implements USB
    {
        public void turnon(){System.out.println("键盘打开");}
        public void turnoff(){System.out.println("键盘关闭");}
    }
    class Headset implements USB
    {
        public void turnon(){System.out.println("耳麦打开");}
        public void turnoff(){System.out.println("耳麦关闭");}
    }
    class Bluetooth implements USB
    {
        public void turnon(){System.out.println("蓝牙打开");}
        public void turnoff(){System.out.println("蓝牙关闭");}
    }
}
