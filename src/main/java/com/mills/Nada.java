package com.mills;

public class Nada
{

    private final String message = "Hello World.";

    public Nada() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
