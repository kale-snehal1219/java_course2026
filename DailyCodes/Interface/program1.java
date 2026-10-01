package DailyCodes.Interface;

interface program1 {
    void fun();
}
class child implements program1{
    public void fun(){
        System.out.println("in fun");
    }
}
class client{
    public static void main(String[] args) {
        child obj = new child();
        obj.fun();

    }
}
