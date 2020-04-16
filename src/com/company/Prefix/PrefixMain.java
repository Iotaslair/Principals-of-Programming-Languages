package com.company.Prefix;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class PrefixMain {

    public static void main(String[] args) {
        // write your code here
        String input = "(x = 5( " +
                "(x * (x = 10 " +
                "((x * 2)) ) ) ))";
        PrefixLexer lexer = new PrefixLexer(CharStreams.fromString(input));
        PrefixParser parser = new PrefixParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.expr();
        PrefixVistorReal visitor = new PrefixVistorReal();
        Data value = visitor.visit(tree);
        System.out.println(input + " : " + value);
    }
}
