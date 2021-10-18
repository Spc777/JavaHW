public class HomeWorkApp {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Boris", 10),
                new Cat("Kokos", 15),
                new Cat("Tuzik", 25),
                new Cat("Ushan", 5),
                new Cat("Plombir", 1)
        };

        Plate plate = new Plate(30);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }

        plate.addFood(50);
        plate.info();
    }
}
