class prog1 {
    int x = 10;
    static int y = 20;
    static{
        System.out.println("static1");
    }
    prog1(){
        System.out.println("prog1 constructor");
    }
    
}
class demo extends prog1{
    int x =10;
    static int y = 20;
    static{
        System.out.println("static 2");
    }
    demo(){
        System.out.println("in demo conctructor");
    }
}
class client{
    public static void main(String[] args) {
        System.out.println("start main");
        demo obj = new demo();
        System.out.println("end main");
    }
}
