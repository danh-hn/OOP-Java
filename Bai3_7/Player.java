package Bai3_7;
public class Player {
    private float x;
    private float y;
    private float z = 0.0f;

    public Player(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void move(float xDisp, float yDisp) {
        x += xDisp;
        y += yDisp;
    }

    public void jump(float zDisp) {
        z += zDisp;
    }
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }
    public Boolean near(Ball ball) {
        if (ball.getX() < 8){
            return true;
        }
        if (ball.getY() < 8) {
            return true;
        }
        else {
            return false;
        }
    }
}