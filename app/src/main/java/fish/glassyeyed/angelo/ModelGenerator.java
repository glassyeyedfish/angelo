package fish.glassyeyed.angelo;

import fish.glassyeyed.angelo.antlr.AngeloBaseVisitor;
import fish.glassyeyed.angelo.antlr.AngeloParser;
import fish.glassyeyed.angelo.model.*;

import java.util.ArrayList;
import java.util.List;

public class ModelGenerator extends AngeloBaseVisitor<AbstractStatement> {
    @Override
    public Program visitProgram(AngeloParser.ProgramContext ctx) {
        List<Statement> statements = new ArrayList<>();

        for (AngeloParser.Stmt_rContext s: ctx.stmt_r()) {
            statements.add((Statement) this.visit(s));
        }

        return new Program(statements);
    }

    @Override
    public Statement visitStatement(AngeloParser.StatementContext ctx) {
        return new Statement((AbstractWff) this.visit(ctx.wff_r()));
    }

    @Override
    public AtomicWff visitAtomicWff(AngeloParser.AtomicWffContext ctx) {
        return new AtomicWff(ctx.ID().getText());
    }

    @Override
    public NegWff visitNegWff(AngeloParser.NegWffContext ctx) {
        return new NegWff((AbstractWff) this.visit(ctx.wff_r()));
    }

    @Override
    public ImpWff visitImpWff(AngeloParser.ImpWffContext ctx) {
        return new ImpWff(
                (AbstractWff) this.visit(ctx.wff_r(0)),
                (AbstractWff) this.visit(ctx.wff_r(1)));
    }
}
