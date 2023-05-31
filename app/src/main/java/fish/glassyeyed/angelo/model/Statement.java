package fish.glassyeyed.angelo.model;

public class Statement extends AbstractStatement {
    private AbstractWff wff;

    public Statement(AbstractWff wff) {
        this.wff = wff;
    }

    public AbstractWff getWff() {
        return wff;
    }

    public void setWff(AbstractWff wff) {
        this.wff = wff;
    }

    @Override
    public String toPrettyString() {
        return "";
    }
}
