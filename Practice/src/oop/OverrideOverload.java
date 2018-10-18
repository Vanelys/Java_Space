package oop;

//overriding allows the rewriting of a method with same access modifiers(can't increase strictness of access modifier), and can yield different output dependant on what is using. Example if it's a speak method for different animals, where every animal makes a different sound.
public class OverrideOverload {
    //function that will be overridden
    public void MakeSound() {
        System.out.println("Ladidadi");
    }


    //over loading a function allows the rewriting of a function with same name and parameters, but the return      type and the parameter types can change, to allow different types to use the same function

    //function that will be overloaded
    public int max(int a, int b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public double max(double a, double b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }
}
