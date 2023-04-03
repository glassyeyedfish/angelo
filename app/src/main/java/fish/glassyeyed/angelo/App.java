package fish.glassyeyed.angelo;

import fish.glassyeyed.angelo.antlr.AngeloLexer;
import fish.glassyeyed.angelo.antlr.AngeloParser;
import fish.glassyeyed.angelo.model.AbstractWff;
import fish.glassyeyed.angelo.model.AtomicWff;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Scanner;

public class App {

    public static AbstractWff parse(String input) {
        ParseTree ast = null;
        try {
            CharStream chars = CharStreams.fromString(input);
            AngeloLexer lexer = new AngeloLexer(chars);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AngeloParser parser = new AngeloParser(tokens);

            parser.removeErrorListeners();
            parser.addErrorListener(new ErrorListener());

            ast = parser.prog_r();
        } catch (Exception ignored) {
        }

        if (ErrorListener.hasError) {
            return new AtomicWff("error");
        }

        WffGenerator generator = new WffGenerator();
        return generator.visit(ast);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // REPL
        while (true) {
            // READ
            System.out.print("> ");
            String input = scanner.nextLine();

            // EVALUATE
            AbstractWff wff = parse(input);

            // PRINT
            System.out.println("You entered: " + wff.prettyPrint());

            // LOOP
        }
    }
}
