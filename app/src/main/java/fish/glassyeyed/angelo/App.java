package fish.glassyeyed.angelo;

import fish.glassyeyed.angelo.antlr.AngeloLexer;
import fish.glassyeyed.angelo.antlr.AngeloParser;
import fish.glassyeyed.angelo.model.AbstractStatement;
import fish.glassyeyed.angelo.model.AtomicWff;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class App {

    public static AbstractStatement parse(String sourceFileName) {
        ParseTree ast = null;
        try {
            CharStream chars = CharStreams.fromFileName(sourceFileName);
            AngeloLexer lexer = new AngeloLexer(chars);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AngeloParser parser = new AngeloParser(tokens);

            ErrorListener.reset();
            parser.removeErrorListeners();
            parser.addErrorListener(new ErrorListener());

            ast = parser.prog_r();
        } catch (Exception ignored) {
        }

        if (ErrorListener.hasError) {
            return new AtomicWff("error");
        }

        ModelGenerator generator = new ModelGenerator();
        return generator.visit(ast);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("USAGE: angelo [FILE]");
            System.exit(0);
        }

        String sourceFileName = args[0];
    }
}
