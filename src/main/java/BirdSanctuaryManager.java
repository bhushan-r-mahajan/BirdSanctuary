import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BirdSanctuaryManager {

    Set<Bird> birdList = new HashSet<>();

    public void addBird(Bird bird) {
        birdList.add(bird);
        bird.incrementCount();
    }

    public void removeBird(Bird bird) {
        birdList.remove(bird);
        bird.decrementCount();
    }

    public int getAllCount() {
        return birdList.size();
    }

    public void editBird(Bird bird) {

    }

    public void print() {
        for (Bird bird : birdList) {
            bird.eat();
            if (bird instanceof Flyable) {
                ((Flyable) bird).fly();
            }
            if (bird instanceof Swimmable) {
                Swimmable swimmable = (Swimmable) bird;
                swimmable.swim();
            }
        }
    }
}
