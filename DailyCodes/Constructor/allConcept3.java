package DailyCodes.Inheritance;

public class allConcept3 {
    int x = 10;
    static int y = 20;

    allConcept3() {
        // super();
        // this.x =10;
        // instance block
        System.out.println("allconcept block");

    }

    void fun() { // fun(allconcept this)
        System.out.println("in parent fun");

    }

    static void gun() {
        System.out.println("in parent gun");
    }

    static {
        System.out.println("in parent static block");
    }
    {
        System.out.println("in instance block");
    }

}

class conceptChild2 extends allConcept3 {
    conceptChild2() {
        System.out.println("in conceptchild constructor");
    }

    static {
        System.out.println("in child static block");
    }
}

class User1 {

    public static void main(String[] args) {
        allConcept3 obj = new conceptChild2();
        obj.fun();
        allConcept3.gun();
        System.out.println(obj.y);
        System.out.println(obj.x);

    }
}


