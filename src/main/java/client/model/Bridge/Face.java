package client.model.Bridge;

public abstract class Face {

    protected abstract String getName();

    public void show(Suit suit) {
        System.out.println(suit.getName() + this.getName());
    }
}
