import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите команду: add/list/exit");
            String input = scanner.next().toUpperCase().trim();

            switch (input) {
                case "ADD":
                    System.out.println("Выберите животное: кошка/собака/утка");
                    String choice = scanner.next();
                    switch (choice) {
                        case "кошка":
                            Animal catAnimal = new Cat();
                            createAnimal(catAnimal, scanner);
                            animals.add(catAnimal);
                            catAnimal.Say();
                            break;
                        case "собака":
                            Animal dogAnimal = new Dog();
                            createAnimal(dogAnimal, scanner);
                            animals.add(dogAnimal);
                            dogAnimal.Say();
                            break;
                        case "утка":
                            Animal duckAnimal = new Duck();
                            createAnimal(duckAnimal, scanner);
                            animals.add(duckAnimal);
                            duckAnimal.Say();
                            break;
                    }
                    break;
                case "LIST":
                    animals.forEach(System.out::println);
                    break;
                case "EXIT":
                    System.out.println("выход");
                    System.exit(1);
            }
        }
    }

    public static void createAnimal(Animal animal, Scanner scanner) {
        System.out.println("Введите имя животного");
        animal.setName(scanner.next());
        System.out.println("Введите возраст животного");
        animal.setAge(scanner.nextInt());
        System.out.println("Введите вес животного");
        animal.setWeight(scanner.nextInt());
        System.out.println("Введите цвет животного");
        animal.setColor(scanner.next());
    }
}
