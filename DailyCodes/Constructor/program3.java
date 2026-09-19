package DailyCodes.Constructor;

public class program3 {
    int x = 10;
    int y = 20;
    program3(){
        System.out.println("in contructor");
    }
    void fun(){
        System.out.println(x);
        System.out.println(y);

    }
    static void gun(){
        program3 obj = new program3();
        System.out.println(obj.x);
        System.out.println(obj.y);

    }
    public static void main(String[] args) {
        program3 obj = new program3();
        System.out.println(obj.x);
        System.out.println(obj.y);
        obj.fun();
        obj.gun();
    }
}
