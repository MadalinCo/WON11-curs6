

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person person1 = new Person("Ali", 20, true);
        Person person2 = new Person("John", 25, false);
        Person person3 = new Person("Jack", 16, false);

        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        product1.getName();
        product2.getPrice();
        product3.getQuantity();
        product1.getCategory();
        product2.hasStock();
        product3.isCategory("clothes");

    }
}

class Product {
    private String name = "Ptoduct";
    private int price = 10;
    private int quantity = 1;
    private String category = "Clothes";


    public void getName() {
        System.out.println(name);
    }

    public void getPrice() {
        System.out.println(price);
    }

    public void getQuantity() {
        System.out.println(quantity);
    }



    public void getCategory() {
        System.out.println(category);


    }

    public void hasStock() {
        if (quantity != 0) {
            System.out.println("true");
        }

    }

    public void isCategory(String category) {
        if (category == category) {
            System.out.println("true");

        }
    }
}


class Person {
    private String name = "Jhon";
    private int age = 14;
    private boolean married;


    Person(String name, int age, boolean married) {

        System.out.println(name + age + married);
        this.name = name;
        this.age = age;
        married = married;

    }


    public void getName() {
        System.out.println(name);

    }

    public void getAge() {
        System.out.println(age);
    }

    public void getMarried() {
        if (married = false) {
            System.out.println("not married");
        } else if (married = true) {
            System.out.println("maried");
        }
    }
}