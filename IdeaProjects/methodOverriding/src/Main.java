
class TV
{
    public void switchON(){ System.out.println("TV is Switched ON"); }

    public void changeChannel() { System.out.println("TV Channel is Changed "); }

}

class SmartTV extends TV
{
    @Override
    public void switchON(){ System.out.println("Smart TV is Switched ON"); }

    @Override
    public void changeChannel() { System.out.println("SmartTV Channel is Changed "); }

    public void browse(){ System.out.println("Smart Tv Browsing"); }

}

public class Main
{

    public static void main(String[] args)
    {
        TV t=new SmartTV(); //dekh bhai yaha sub class bulaye so as a object toh jo sub class ke functions hai wahi print honge.
                                //dono classes me same methods rahe toh best, warna video dekh firse

        t.switchON();
        t.changeChannel();

    }

}