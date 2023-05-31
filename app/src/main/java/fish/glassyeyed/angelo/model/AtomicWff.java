package fish.glassyeyed.angelo.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AtomicWff extends AbstractWff {
    private final String identifier;

    public AtomicWff(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public Set<String> getAtoms() {
        Set<String> atoms = new HashSet<>();
        atoms.add(this.identifier);
        return atoms;
    }

    @Override
    public String toPrettyString() {
        return this.identifier;
    }
}
