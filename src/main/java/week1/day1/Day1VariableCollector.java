package week1.day1;

/**
 * Created by Letricia on 7/11/16.
 */
public class Day1VariableCollector {

    private String z = "newbie";
    private int yellow = 15;
    private boolean  w = false;
    private long b = 789;
    private char c = 't';
    private char [] ts = {'a', 'b', 'c'};

    String getZ(){
        return z;}
    void setZ(String newZ){
        z = newZ;

    }

    public int getYellow() {
        return yellow;
    }

    public void setYellow(int yellow) {
        this.yellow = yellow;
    }

    public boolean isW() {
        return w;
    }

    public void setW(boolean w) {
        this.w = w;
    }

    public long getB() {
        return b;
    }

    public void setB(long b) {
        this.b = b;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public char[] getTs() {
        return ts;
    }

    public void setTs(char[] ts) {
        this.ts = ts;
    }
}
