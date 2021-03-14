import Action.Actions;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Runneble[] runnebles = {new Cat("Barsik"), new Human("Ivan"), new Robot("Bender")};
        for (Runneble r : runnebles) {
            r.run();
        }
        Jumpeble[] jumpebles = {new Cat("Barsik"), new Human("Ivan"), new Robot("Bender")};
        for (Jumpeble j : jumpebles) {
            j.jump();
        }
        Wall[] walls = {new Cat("Barsik"), new Human("Ivan"), new Robot("Bender")};
        for (Wall w : walls) {
            w.jump();
        }
        Treadmill[] treadmills = {new Cat("Barsik"), new Human("Ivan"), new Robot("Bender")};
        for (Treadmill t : treadmills) {
            t.run();
        }
    }
}