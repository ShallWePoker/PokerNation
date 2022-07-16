package client.model.Bridge;

public class Diamond extends Suit {

    public Diamond(Face face) {
        super(face);
    }

    @Override
    protected String getName() {
        return "方块";
    }

}
