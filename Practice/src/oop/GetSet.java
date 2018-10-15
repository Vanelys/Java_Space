package oop;

public class GetSet {

    //this can be seen as encapsulation, hiding data from classes that don't need to see it,
    //then setting and outputting via instance objects of the constructor
    private static double gravityInit;
    private String word;
    private static int age;
    private static boolean access;
    private static char middleInitial;

    //gravity
    public static void setGravityInit(double num)
    {
        gravityInit = num;
    }
    public static double getGravityInit() {
        return gravityInit;
    }

    //word
    public void setWord(String s) {
        word = s;
    }
    public String getWord() {
        return word;
    }

    //age
    public static void setAge(int num) {
        age = num;
    }
    public static int getAge() {
        return age;
    }

    //access
    public static void setAccess(boolean b) {
        access = b;
    }
    public static boolean getAccess() {
        return access;
    }

    //middleInitial
    public static void setMiddleInitial(char c) {
        middleInitial = c;
    }
    public static char getMiddleInitial() { return middleInitial; }
}
