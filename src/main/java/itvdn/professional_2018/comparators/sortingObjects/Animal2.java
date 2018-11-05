package itvdn.professional_2018.comparators.sortingObjects;

public class Animal2 implements Comparable<Animal2> {
    String breed;
    int weight;
    int speed;
    int price;

    Animal2(String breed, int weight, int speed, int price) {
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


    public int compareTo(Animal2 o) {
        int tmp = this.speed - ((Animal2)o).speed;
        if(tmp == 0) {
            return this.price - (((Animal2) o).price);
        } else {
            return tmp;
        }
//        return this.breed.compareTo(((Animal2)o).breed);
    }
}
