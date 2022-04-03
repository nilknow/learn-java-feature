package patternmatch;

public class Main {
    public static void main(String[] args) {
        Animal animal = (Animal)new Duck();
        if (animal instanceof Duck duck) {
            System.out.println("type pattern match works");
        }
    }
}
