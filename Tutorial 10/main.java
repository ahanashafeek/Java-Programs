 
package pack1;

public class Man {
    public String name;
    public int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayMe() {
        System.out.println("Man's Name: " + name + ", Age: " + age);
    }
}


// 2. pack2 package and Woman class
package pack2;

public class Woman {
    public String name;
    public int age;

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayMe() {
        System.out.println("Woman's Name: " + name + ", Age: " + age);
    }
}


// 3. Main execution class
import pack1.Man;
import pack2.Woman;

public class Main {
    public static void main(String[] args) {
        // Creating object for Man
        Man m = new Man("Smith", 40);
        m.displayMe();

        // Creating object for Woman
        Woman w = new Woman("Jane", 35);
        w.displayMe();
    }
}
