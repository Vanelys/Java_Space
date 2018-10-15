package exectution;

//when different package, import is a must, when same package, simply use class(object) name
import oop.Constructs;
import oop.GetSet;
import oop.Inher2;

public class Main {
    //array for testing ArrayManip class
    private static int[] numsArr = {5, 28, 72, 5, 65};

    //counter for GetSet
    private static double count = 0;
    public static void main(String[] args) {

        //arrayManip
        int sumIt = ArrayManip.sumArray(numsArr);
        System.out.println(sumIt);

        //GetSet
        //can call a non static method or attribute by creating an instance object of the used class
        GetSet pala =  new GetSet();

        GetSet.setGravityInit(Math.pow(9.81, 2));
        pala.setWord("VanLove");
        GetSet.setAge(24);
        GetSet.setAccess(false);
        GetSet.setMiddleInitial('C');

        System.out.println("----------------------");

        //increment every second by putting the Thread to sleep for 1 second in between every iteration
//        for(int i = 0; i < 10; i++) {
//            try {
//                Thread.sleep(1000);
//                count += GetSet.getGravityInit();
//                System.out.println(count);
//            }
//            catch(InterruptedException e) {
//                System.out.println("Oops there was an interruption!\n"+e);
//            }
//        }
        System.out.println("----------------------");

        System.out.println(pala.getWord());
        System.out.println(GetSet.getAge());
        System.out.println(GetSet.getAccess());
        System.out.println(GetSet.getMiddleInitial());

        //Constructs
        Constructs getCons = new Constructs();
        Constructs setCons = new Constructs("Purple");
        //output is still tied to getter and setter within created class
        System.out.println(getCons.getColor());
        System.out.println(setCons.getColor());

        //Inher2 extends Inher
        //inheritance executes the constructor of both classes tied in inheritance
        Inher2 borrow = new Inher2();
        System.out.println(borrow);
    }
}
