package com.company;

import com.company.Prefix.PrefixLexer;
import com.company.Prefix.PrefixParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class PrefixMain {

    public static void main(String[] args) {
        // write your code here
        String input = "and true false";
        PrefixLexer lexer = new PrefixLexer(CharStreams.fromString(input));
        PrefixParser parser = new PrefixParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.expr();
        PrefixVistorReal visitor = new PrefixVistorReal();
        boolean value = (boolean) visitor.visit(tree);
        System.out.println(input + " : " + value);
    }
}
