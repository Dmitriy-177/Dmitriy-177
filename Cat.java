import static java.lang.String.*;

public class Cat implements Runneble, Jumpeble, Wall, Treadmill {
   private String name;
   public Cat(String name){
       this.name = name;
    }
    @Override
    public void run() {
        System.out.println("Cat " + name + " run");
    }

    @Override
    public void jump() {
        System.out.println("Cat " + name + " jump");
    }
    @Override
    public void wall() {
    }
    @Override
    public Void treadmill() {
        return null;
    }
}
