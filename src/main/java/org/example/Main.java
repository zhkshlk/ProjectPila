package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Run run = new Run();
            run.run();
        }
        catch (IOException io) {
            io.printStackTrace();
        }

    }
}
