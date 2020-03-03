package com.company;

import com.company.Boolang.BoolangLexer;
import com.company.Boolang.BoolangParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class PrefixMain {
    public static void main(String args){
        // write your code here
        String input =  "or true false";
        BoolangLexer lexer = new BoolangLexer(CharStreams.fromString(input));
        BoolangParser parser = new BoolangParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.expr();
        BoolangVisitorReal visitor = new BoolangVisitorReal();
        boolean value = (boolean) visitor.visit(tree);
        System.out.println(input + " : " + value);
    }
}
