public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        System.out.println(cat.eat("Viskas"));
        System.out.println(dog.eat("Wild Nature"));

        //gul tag - hvor man er
        //grøn tag - branches
        //lilla tag - online

    }
}
