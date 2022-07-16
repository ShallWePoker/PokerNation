package client.model.Bridge;

public abstract class Suit {
    private Face face;

    public Suit(Face face) {
        this.face = face;
    }

    public void show() {
        face.show(this);
    }

    protected abstract String getName();
}

