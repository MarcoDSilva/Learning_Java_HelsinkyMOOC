//https://www.youtube.com/watch?v=SLuW-GBaJ8k

import java.util.Random;

public class NightSky {
    
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint = 0;
    
    public NightSky(double den) {
        this(den, 20, 10);
    }
    
    public NightSky(int width, int height) {
        this(0.1, width, height);
    }
    
    public NightSky(double den, int width, int height) {
        this.density = den;
        this.width = width;
        this.height = height;
    }
    
    public void printLine() {

        Random rnd = new Random();
        for (int i = 0; i < this.width; i++) {
            
            if (this.density > rnd.nextDouble()) {
                System.out.print("*");
                this.starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    
    public void print() {
        for(int i = 0; i < this.height; i++) {
            printLine();
        }
    }
    
    public int starsInLastPrint() {
        int copy = this.starsInLastPrint;
        this.starsInLastPrint = 0;
        return copy;
    }
}
