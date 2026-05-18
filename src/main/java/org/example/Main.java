package org.example;

public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>();

        box.put("A");
        box.put("B");

        System.out.println(box.get());
        System.out.println(box.get());

        System.out.println(box.isEmpty());
    }
}
