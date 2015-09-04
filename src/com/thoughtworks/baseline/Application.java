package com.thoughtworks.baseline;

public class Application {

    public static void main() {
        Application application = new Application();
        application.start();
    }

    private void start() {
        View view = new View();
        while (view.input().equals("")) {
            String input = view.input();
            Parser parser = new Parser(input);
            Item item = parser.parse();
        }
    }
}