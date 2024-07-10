public class Dog extends Animal {
    public Dog (){
        super("Dog");
    }
    
    @Override
    public void eat(){
        System.out.println("I'm eating bone");
    }

    @Override
    public void makeSound (){
        System.out.println("Gau Gau");
    }
}
