package com.company;

import com.company.gen.BoolangLexer;
import com.company.gen.BoolangParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BoolangLexer lexer = new BoolangLexer(CharStreams.fromString("(false or true) and true"));
        BoolangParser parser = new BoolangParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.expr();
        BoolangVisitorReal visitor = new BoolangVisitorReal();
        boolean value = (boolean) visitor.visit(tree);
        System.out.println("And the final return value is: " + value);


//        HelloLexer lexer = new HelloLexer(CharStreams.fromString("Hallo John!"));
//        HelloParser parser = new HelloParser(new CommonTokenStream(lexer));
//        //r is the root rule so that's the name of the method
//        ParseTree tree = parser.r();

    }
}
