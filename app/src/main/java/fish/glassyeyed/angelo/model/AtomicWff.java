package fish.glassyeyed.angelo.model;

import java.util.ArrayList;
import java.util.List;

public class AtomicWff extends AbstractWff {
    private final String identifier;

    public AtomicWff(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public List<String> getAtoms() {
        List<String> atoms = new ArrayList<>();
        atoms.add(this.identifier);
        return atoms;
    }

    @Override
    public String prettyPrint() {
        return this.identifier;
    }
}
