package fish.glassyeyed.angelo.model;

public class AtomicWff extends AbstractWff {
    private final String identifier;

    public AtomicWff(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String prettyPrint() {
        return this.identifier;
    }
}
