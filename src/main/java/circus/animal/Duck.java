package circus.animal;

public class Duck extends Bird {
    public Duck() {
        this("Drake");
    }

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public String speak() {
        return toString() + ". Quack quack!";
    }

    @Override
    public String toString() {
        return "I'm " + name + ". I am a Duck!";
    }

    @Override
    public int getValue() {
        return 10;
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }
}
