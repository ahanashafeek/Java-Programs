class Animal {
    String species; // default access

    Animal(String species) {
        this.species = species;
    }

    void displaySpecies() {
        System.out.println("Species: " + species);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Dog");

        // Direct access allowed in same package
        System.out.println("Species: " + a.species);

        a.displaySpecies();
    }
}
