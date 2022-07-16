package client.model.Bridge;

public class Club extends Suit {

    public Club(Face face) {
        super(face);
    }

    @Override
    protected String getName() {
        return "梅花";
    }

}
