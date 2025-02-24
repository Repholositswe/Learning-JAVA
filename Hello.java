class Computer
{
    public void playMusic()
    {
        System.out.println("Music Playing..");
    }

    public String getMeAPen(int cost)
    {
        if(cost >= 10)
            return "Pen";
        else
            return "Nothing";
    }
}

public class Hello
{
public static void main(String a[])
{
    Computer myComputer = new Computer();
    myComputer.playMusic();
    String str = myComputer.getMeAPen(10);

    System.out.println(str);
}
}