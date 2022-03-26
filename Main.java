package com.netcracker;

public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(3, 2, 1, 2, 0);
        Container container = new Container(4, 1, 2, 2);
        System.out.println(ball.toString());
        System.out.println(container.toString());
        System.out.println("Нахождение мяча в контейнере:" + container.collides(ball));
        System.out.println("Мяч делает движение в контейнер");
        ball.move();
        System.out.println(ball.toString());
        System.out.println(container.toString());
        System.out.println("Нахождение мяча в контейнере:" + container.collides(ball));
        System.out.println("Мяч делает движение из контейнера вниз");
        ball.setXDelta(0);
        ball.setYDelta(1);
        ball.move();
        System.out.println(ball.toString());
        System.out.println(container.toString());
        System.out.println("Нахождение мяча в контейнере:" + container.collides(ball));
    }
}