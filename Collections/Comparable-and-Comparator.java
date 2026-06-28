import java.lang.reflect.Array;
import java.util.*

public class Car implements Comparator<Car>{
    String carName;
    String carType;

    Car(){

    }
    Car(String name, String type){
        this.carName = name;
        this.carType = type;
    }

    @Overrider
    public int compare(Car o1, Car o2){
        return o1.carName.compareTo(o2.carName);
    }
}

// function to compare 2 objects
public class CarNameComparator implements Comparator<Car> {
    @Overrider
    public int compare(Car o1, Car o2){
        return o2.carName.compareTo(o1.carName);
    }
}

public class Main{
    public static void main(String[] args) {
        // Case 1 : Primitive collection sorting

        Integer a[] = {6,4,1,9,2,11};
        // both was sort the array in increasing order
        Arrays.sort(a);
        Arrays.sort(a, (Integer val1, Integer val2) -> val1 - val2);
        // sort the array in decreasing order
        Arrays.sort(a, (Integer val1, Integer val2) -> val2 - val1);

        // Case 2: Object collection sorting
        Car[] carArray = new Car[3];
        carArray[0] = new Car("SUV", "PETROL");
        carArray[1] = new Car("SEDAN", "DIESEL");
        carArray[2] = new Car("HATCHBACK", "CNG");

        // sort object via car name
        Arrays.sort(carArray, (Car obj1, Car obj2) -> obj1.carName.compareTo(obj2.carName));

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("SUV", "PETROL"));
        cars.add(new Car("SEDAN", "DIESEL"));
        cars.add(new Car("HATCHBACK", "CNG"));

        // sort object via car name in descentding order of ASCII char
        Collections.sort(cars, (Car obj1, Car obj2) -> obj2.carName.compareTo(obj1.carName));

        // using comparator for mutlipurpose sorting
        Collections.sort(cars, new CarNameComparator());

        // using comparator implement inside the same class
        Collections.sort(cars, new Car());
    }
}