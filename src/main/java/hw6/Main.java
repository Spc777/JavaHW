package hw6;

public class Main {
    public static void main(String[] args) {
        Animal[] pets = {
                new Dog("Шарик", "белый", 2),
                new Cat("Ричард", "рыжий", 1.5f),
                new Dog("Рекс", "серый", 1),
                new Dog("Бим", "белый", 2.3f),
                new Dog("Джек", "коричневый", 2),
                new Dog("Мухтар", "белый", 2),
                new Cat("Борис", "рыжий", 1.3f),
                new Cat("Ушан", "серый", 1.5f),
                new Cat("Космос", "белый", 1.5f),
        };

        for (Animal x :
                pets) {
            System.out.println(x);
        }

        int runDistance = 242;
        int swimDistance = 3;
        for (Animal a :
                pets) {
            if (a instanceof Dog) {
                if (!a.run(runDistance)) {
                    System.out.println(a.name + " не смог пробежать " + runDistance + " м.");
                } else {
                System.out.println(a.name + " пробежал " + runDistance + " м.");
                }
            }
            if (a instanceof Dog) {
                if (!a.swim(swimDistance)) {
                    System.out.println(a.name + " не смог проплыть " + swimDistance + " м.");
                } else {
                    System.out.println(a.name + " проплыл " + swimDistance + " м.");
                }
            }
        }
        for (Animal a :
                pets) {
            if (a instanceof Cat) {
                if (!a.run(runDistance)) {
                    System.out.println(a.name + " не смог пробежать " + runDistance + " м.");
                } else {
                    System.out.println(a.name + " пробежал " + runDistance + " м.");
                }
            }
            if (a instanceof Cat) {
                if (!a.swim(swimDistance)) {
                    System.out.println(a.name + " Как и большинство котов не умеет плавать.");
                }
            }
        }
    }
}
