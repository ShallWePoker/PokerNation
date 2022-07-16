package client.model.Bridge;


public class Spade extends Suit {

    public Spade(Face face) {
        super(face);
    }

    @Override
    public String getName() {
        return "黑桃";
    }
}
