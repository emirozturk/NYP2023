public abstract class Builder extends Unit {
    public Builder() {
        super(100, 3);
    }

    @Override
    public String toString() {
        return "Builder-" + super.toString();
    }
}
