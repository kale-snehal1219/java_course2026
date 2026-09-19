package DailyCodes.Inheritance;

class Demo {
    int x = 10;
    static int y =20;
    Demo(){
        System.out.println("Demo conmstructor");
    }
    void fun(){
        System.out.println("in Demo fun");
    }
    static void gun(){
        System.out.println("in Demo gun");
    }
class Demochild extends Demo{
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.fun();
        System.out.println(obj.x);
        System.out.println(obj.y);
        gun();
    }
}
}
