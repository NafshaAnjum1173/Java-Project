
package Constructor1;


public class Cat {
    private final String name;
    private final int age;
    public Cat() {
        this.name = "Groli";
        this.age = 3;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        Cat myCat = new Cat();
        System.out.println("Cat's Name: " + myCat.getName());
        System.out.println("Cat's Age: " + myCat.getAge());
    }
    
}

    
