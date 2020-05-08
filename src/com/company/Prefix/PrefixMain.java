package com.company.Prefix;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class PrefixMain {

    public static void main(String[] args) {

        String input = "5";
//        It looks like 'and' broke along the way. I think it's not because the boolean operators
//        are at the bottom of the grammar file
//        String input = "and (true) true";
//        String input = "or (true) false";
//        String input = "not false";

        //below should return true
//        String input = "or (not not true) not false";

//        String input = "(5 + 4)";
//        String input = "(5 - 3)";
//        String input = "(5 * 10)";

//        String input = "(x = 5 (x))";
//        String input = "(x = 5 ((x * 10)))";

        //it looks like if statements broke
//        String input = "if ( true ) " +
//                " { " +
//                    "true" +
//                " } ";
//        String input = "if ( true ) " +
//                "{ " +
//                    "true " +
//                "} else { " +
//                    "false " +
//                "}";

//        I'm pretty sure all of the problems with my language are from ambiguity because
//        when I wrote all the functions they worked

//        String input = "(def functionname passedIn ( (4 + passedIn) call functionname 8))";

//        I didn't get around to recursive functions in time







        PrefixLexer lexer = new PrefixLexer(CharStreams.fromString(input));
        PrefixParser parser = new PrefixParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.expr();
        PrefixVistorReal visitor = new PrefixVistorReal();
        Data value = visitor.visit(tree);
        System.out.println(input + " : " + value);
    }
}
