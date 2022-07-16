package client.model.Bridge;

public class Heart extends Suit {

    public Heart(Face face) {
        super(face);
    }

    @Override
    protected String getName() {
        return "红桃";
    }

}
