package A03;

public class classroom {
    public static void main(String[] args){
        USB mouse = new Mouse();
        USB keyboard = new Keyboard();
        USB headset = new Headset();
        Computer computer = new Computer();
        computer.addUSB(mouse);
        computer.addUSB(keyboard);
        computer.addUSB(headset);
        computer.trunOn();
        computer.trunOff();
    }
}
abstract class USB
{
    abstract void turnon();
    abstract void turnoff();
}
class Mouse extends USB
{
    void turnon()
    {
        System.out.println("mouse is turnon");
    }
    void turnoff()
    {
        System.out.println("mouse is turnoff");
    }
}
class Keyboard extends USB
{
    void turnon()
    {
        System.out.println("keyboard is turnon");
    }
    void turnoff()
    {
        System.out.println("mouse is turnoff");
    }
}
class Headset extends USB
{
    void turnon() {
        System.out.println("headset is turnon");
    }

    void turnoff() {
        System.out.println("headset is turnoff");
    }
}
class Computer
{
    USB[] USBDEV = new USB[3];
    void addUSB(USB usb)
    {
        for(int i=0; i<USBDEV.length; i++)
        {
            if(USBDEV[i] == null)
            {
                USBDEV[i] = usb;
                break;
            }
        }
    }
    void trunOn()
    {
        System.out.println("computer is turnon");
        for(int i=0; i<USBDEV.length; i++)
        {
            if(USBDEV[i] != null)
            {
                USBDEV[i].turnon();
            }
        }
    }
    void trunOff()
    {

        for(int i=0; i<USBDEV.length; i++)
        {
            if(USBDEV[i] != null)
            {
                USBDEV[i].turnoff();
            }
        }
        System.out.println("computer is turnoff");
    }
}

