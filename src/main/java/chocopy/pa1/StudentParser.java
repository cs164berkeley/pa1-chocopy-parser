package chocopy.pa1;

import java.io.StringReader;

import java_cup.runtime.ComplexSymbolFactory;

import chocopy.common.astnodes.Program;

/** Interface between driver and parser. */
public class StudentParser {

    /** Return the Program AST resulting from parsing INPUT.  Turn on
     *  parser debugging iff DEBUG. */
    public static Program process(String input, boolean debug) {
        ChocoPyLexer lexer = new ChocoPyLexer(new StringReader(input));
        ChocoPyParser parser =
            new ChocoPyParser(lexer, new ComplexSymbolFactory());
        return parser.parseProgram(debug);
    }
}


