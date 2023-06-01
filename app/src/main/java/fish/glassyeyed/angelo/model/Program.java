package fish.glassyeyed.angelo.model;

import java.util.List;

public class Program extends AbstractStatement {
    private List<Statement> statements;

    public Program(List<Statement> statements) {
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String toPrettyString() {
        StringBuilder sb = new StringBuilder();

        for (Statement s: statements) {
            sb.append(s.toPrettyString());
        }

        return sb.toString();
    }
}
