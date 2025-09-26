// Superclass
class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Interface
interface Worker {
    void performDuties();
}

// Subclass 1
class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " cooks delicious meals.");
    }
}

// Subclass 2
class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " serves food to customers.");
    }
}

public class RestaurantDemo {
    public static void main(String[] args) {
        Chef c = new Chef("Arjun", 101);
        Waiter w = new Waiter("Ramesh", 201);

        c.performDuties();
        w.performDuties();
    }
}

