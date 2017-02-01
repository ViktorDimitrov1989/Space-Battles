package objectClasses;


import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.Random;


public class Asteroid {
    public double y;
    public double x;
    public double speed;

    public Asteroid(Image[] arr, double duration, GraphicsContext gc, double frame, double x, double y, double speed) {
        AnimatedImage object = new AnimatedImage();
        object.frames = arr;
        object.duration = duration;
        GraphicsContext gc1 = gc;
        double frame1 = frame;
        this.y = y;
        this.x = x;
        this.speed = speed;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void drawAsteroid(GraphicsContext gc, AnimatedImage asteroid, double frame, double x, double y) {
        //x = this.x * this.speed;
        gc.drawImage(asteroid.getFrame(frame), x, y);
    }

    public void updateAsteroid(Canvas canvas, Asteroid asteroid, int speed, Random rnd) {
        asteroid.x += speed;

        if (asteroid.x > 500) {
            asteroid.x = -50;
            asteroid.y = rnd.nextInt((int) canvas.getWidth());
        }
    }
}
