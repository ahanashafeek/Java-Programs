
interface Pet
{
    String getName();
    void setName(String name);
    void play();
}


// Abstract class
abstract class Animal
{
    protected int legs;

    // Constructor
    protected Animal(int legs)
    {
        this.legs = legs;
    }

    // Abstract methods
    public abstract void walk();
    public abstract void eat();
}


// Spider class
class Spider extends Animal
{
    public Spider()
    {
        super(8);
    }

    @Override
    public void walk()
    {
        System.out.println("Spider is walking with " + legs + " legs.");
    }

    @Override
    public void eat()
    {
        System.out.println("Spider eats insects.");
    }
}


// Cat class
class Cat extends Animal implements Pet
{
    private String name;

    public Cat()
    {
        super(4);
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public void play()
    {
        System.out.println(name + " is playing.");
    }

    @Override
    public void walk()
    {
        System.out.println(name + " is walking with " + legs + " legs.");
    }

    @Override
    public void eat()
    {
        System.out.println(name + " eats cat food.");
    }
}


// Fish class
class Fish extends Animal implements Pet
{
    private String name;

    public Fish()
    {
        super(0);
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public void play()
    {
        System.out.println(name + " is playing.");
    }

    @Override
    public void walk()
    {
        System.out.println(name + " cannot walk.");
    }

    @Override
    public void eat()
    {
        System.out.println(name + " eats fish food.");
    }
}


// Main class
public class Main
{
    public static void main(String[] args)
    {
        // Spider object
        Spider spider = new Spider();
        spider.walk();
        spider.eat();

        System.out.println();

        // Cat object
        Cat cat = new Cat();
        cat.setName("Tom");
        System.out.println("Cat name: " + cat.getName());
        cat.walk();
        cat.eat();
        cat.play();

        System.out.println();

        // Fish object
        Fish fish = new Fish();
        fish.setName("Nemo");
        System.out.println("Fish name: " + fish.getName());
        fish.walk();
        fish.eat();
        fish.play();
    }
}
