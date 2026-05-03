package org.example;
public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>();

        System.out.println(box.isEmpty());

        box.put("Hello");
        System.out.println(box.get());
        System.out.println(box.isEmpty());

        box.clear();
        System.out.println(box.isEmpty());
    }
}
