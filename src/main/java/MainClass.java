public class MainClass {

    public static void main (String[] args) {

        BirdSanctuaryManager birdSanctuaryManager = new BirdSanctuaryManager();

        Parrot parrot = new Parrot("p");
        Parrot parrot1 = new Parrot("p1");
        Parrot parrot2 = new Parrot("p2");
        Parrot parrot3 = new Parrot("p3");
        Parrot parrot4 = new Parrot("p4");
        Duck duck = new Duck("d");
        Duck duck1 = new Duck("d1");
        Duck duck2 = new Duck("d2");
        Penguin penguin = new Penguin("pe");
        Penguin penguin1 = new Penguin("pe1");
        Penguin penguin2 = new Penguin("pe2");
        Crow crow = new Crow("c");
        Crow crow1 = new Crow("c1");
        Crow crow2 = new Crow("c2");
        Crow crow3 = new Crow("c3");


        System.out.println("Welcome to Bird Sanctuary!!");

        birdSanctuaryManager.addBird(parrot);
        birdSanctuaryManager.addBird(parrot1);
        birdSanctuaryManager.addBird(parrot2);
        birdSanctuaryManager.addBird(parrot3);
        birdSanctuaryManager.addBird(parrot4);
        birdSanctuaryManager.addBird(duck);
        birdSanctuaryManager.addBird(duck1);
        birdSanctuaryManager.addBird(duck2);
        birdSanctuaryManager.addBird(penguin);
        birdSanctuaryManager.addBird(penguin1);
        birdSanctuaryManager.addBird(penguin2);
        birdSanctuaryManager.addBird(crow);
        birdSanctuaryManager.addBird(crow1);
        birdSanctuaryManager.addBird(crow2);
        birdSanctuaryManager.addBird(crow3);

        birdSanctuaryManager.print();

        System.out.println("Number of Parrots are: " + parrot.getCount());
        System.out.println("Number of Penguins are: " + penguin1.getCount());
        System.out.println("Number of Ducks are: " + duck1.getCount());
        System.out.println("Number of Crows are: " + crow.getCount());
        System.out.println("Total Birds = " + birdSanctuaryManager.getAllCount());

        birdSanctuaryManager.removeBird(parrot);
        birdSanctuaryManager.removeBird(duck);
        birdSanctuaryManager.removeBird(crow);

        System.out.println("Number of Parrots are: " + parrot.getCount());
        System.out.println("Number of Penguins are: " + penguin1.getCount());
        System.out.println("Number of Ducks are: " + duck1.getCount());
        System.out.println("Number of Crows are: " + crow.getCount());
        System.out.println("Total Birds = " + birdSanctuaryManager.getAllCount());

    }
}
