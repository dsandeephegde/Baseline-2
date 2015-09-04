package com.thoughtworks.baseline;

import java.util.Scanner;

public class View {

    String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
