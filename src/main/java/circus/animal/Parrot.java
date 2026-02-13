package circus.animal;

public class Parrot extends Bird {
    public Parrot() {
        this("Polly");
    }

    public Parrot(String name) {
        this.name = name;
    }

    @Override
    public String speak() {
        return toString() + ". Polly wants a cracker!";
    }

    @Override
    public String toString() {
        return "My name is " + name + ". I am a Parrot!";
    }

    @Override
    public int getValue() {
        return 20;
    }

}
