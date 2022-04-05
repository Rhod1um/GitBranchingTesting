public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("vov");
    }

    @Override
    public boolean eat(String foodtype) {
        return false;
    }

    @Override
    public void mood() {
        System.out.println("angry");
    }

}
