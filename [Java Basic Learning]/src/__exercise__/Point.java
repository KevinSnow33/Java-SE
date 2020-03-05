package __exercise__;

public class Point {
    int x,y;
    public int PUB = 10;

    final int z = 5;

    public Point(){
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void movePoint(int dx, int dy){
        x = dx;
        y = dy;
    }

    public void Print(){
        System.out.println("X:" + x + "Y:" + y);
    }




}
