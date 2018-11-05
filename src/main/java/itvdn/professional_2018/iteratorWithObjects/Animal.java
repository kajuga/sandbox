package itvdn.professional_2018.iteratorWithObjects;

public class Animal {
    String breed;
    int price;

    public Animal(String breed, int price) {
        this.breed = breed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", price=" + price +
                '}';
    }
}
