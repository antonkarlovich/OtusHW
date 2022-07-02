

public class Animal {
    private String name;
    private int age;
    private int weight;
    private String color;


    public void Say() {
        System.out.println("Я говорю");
    }

    public void Go() {
        System.out.println("Я иду");
    }

    public void Drink() {
        System.out.println("Я пью");
    }

    public void Eat() {
        System.out.println("Я ем");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String setYear(int age) {
        String result;
        if (age % 10 == 1 || age == 1) {
            result = "год";
        }else if (age % 10 > 1 && age < 5) {
            result = "года";
        }else {
            result = "лет";
        }
        return result;
    }


    @Override
    public String toString() {
        return "Привет! меня зовут " +
                 name +
                ", мне " + age + " " + setYear(age) +
                ", я вешу - " + weight +
                " кг, мой цвет - " + color;
    }
}
