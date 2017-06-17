import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TableHandlerMain {
   public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input:
      ANTLRInputStream input = new ANTLRInputStream(System.in);
        // create a lexer that feeds off of input CharStream:
      TableHandlerLexer lexer = new TableHandlerLexer(input);
        // create a buffer of tokens pulled from the lexer:
      CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer:
      TableHandlerParser parser = new TableHandlerParser(tokens);
        // begin parsing at main rule:
      ParseTree tree = parser.main();
      if (parser.getNumberOfSyntaxErrors() == 0) {
           // print LISP-style tree:
         // System.out.println(tree.toStringTree(parser));
           // listeners:
         ParseTreeWalker walker = new ParseTreeWalker();
         TableListener listener0 = new TableListener();
         walker.walk(listener0, tree);
           // visitors:
         TableVisitor visitor0 = new TableVisitor();
         visitor0.visit(tree);
      }
   }
}
