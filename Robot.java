public class Robot implements Runneble, Jumpeble, Wall, Treadmill{
   private String name;
   public Robot(String name){
       this.name = name;

    }
    @Override
    public void run() {
        System.out.println("Robot " + name + " run...");
    }
    @Override
    public Void treadmill() {
        System.out.println("Robot " + name + " смог ...");
        return null;
    }
    @Override
    public void jump() {
        System.out.println("Robot " + name + " can`t jump");
    }
    @Override
    public void wall(){
        System.out.println("Robot " + name + " can`t jump wall");
    }

}
