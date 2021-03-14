public class Human implements Runneble, Jumpeble, Wall, Treadmill{
   private String name;
   public Human(String name){
       this.name = name;

    }

    @Override
    public void run() {
        System.out.println("Human" + name + " run...");
    }

    @Override
    public void jump() {
        System.out.println("Human " + name + " jump...");
    }

    @Override
        public void wall() {
        System.out.println("Human " + name + " прыгнул...");
        }

    @Override
    public Void treadmill() {
        return null;
    }
}

