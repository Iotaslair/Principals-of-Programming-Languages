package com.company.Prefix;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class PrefixMain {

    public static void main(String[] args) {
        // write your code here
        String input = "52*84";
        PrefixLexer lexer = new PrefixLexer(CharStreams.fromString(input));
        PrefixParser parser = new PrefixParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.expr();
        PrefixVistorReal<Boolean> visitor = new PrefixVistorReal<>();
        Data value = visitor.visit(tree);
        System.out.println(input + " : " + value);
    }
}
