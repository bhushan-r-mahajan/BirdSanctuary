import java.util.HashSet;
import java.util.Set;

public class BirdSanctuaryManager {

    Set<Bird> birdList = new HashSet<>();

    private static BirdSanctuaryManager instance;

    public static BirdSanctuaryManager getInstance() {
        if (instance == null) {
            instance = new BirdSanctuaryManager();
        }
        return instance;
    }

    private BirdSanctuaryManager() {
    }

    public void addBird(Bird bird) {
        try{
            if(bird == null){
                throw new CustomException("Bird Entered Null!!");
            } else {
                birdList.add(bird);
                bird.incrementCount();
            }
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    public void removeBird(Bird bird) throws CustomException {
        if(birdList.contains(bird)) {
            birdList.remove(bird);
            bird.decrementCount();
        } else {
            throw new CustomException("Did not find bird!!");
        }
    }

    public int getAllCount() {
        return birdList.size();
    }

    public void printEatable() {
        birdList.stream().forEach(Bird::eat);
    }

    public void printFlyable() {
        birdList.stream().filter(bird-> bird instanceof Flyable).forEach(bird -> ((Flyable) bird).fly());
    }

    public void printSwimmable() {
        birdList.stream().filter(bird-> bird instanceof Swimmable).forEach(bird -> ((Swimmable) bird).swim());
    }
}
