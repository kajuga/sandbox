package itvdn.professional_2018.comparators.interface_comparatot_with_anonimous;

public class Animal {
    String breed;
    int weight;
    int speed;
    int price;

    public Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
