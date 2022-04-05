public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("miav");
        //abstract metode er tilføjet
    }

    @Override
    public boolean eat(String foodtype) {
        return false;
    }
}
