package com.company;

import com.company.hellogen.HelloLexer;
import com.company.hellogen.HelloParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HelloLexer lexer = new HelloLexer(CharStreams.fromString("Hallo John!"));
        HelloParser parser = new HelloParser(new CommonTokenStream(lexer));
        //r is the root rule so that's the name of the method
        ParseTree tree = parser.r();

    }
}
