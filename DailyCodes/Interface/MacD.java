package DailyCodes.Interface;

public interface MacD {
    void burger();
    default public void fries(){
        System.out.println("Same taste");
    }
    void price();    
}
class IndiaMacD implements MacD{
    public void burger(){
        System.out.println("Maharaja Mac");
    }
    public void price(){
        System.out.println("350 Rs");
    }
}
class chinaMacD  implements MacD{
    public void burger(){
        System.out.println("chwing chwang mac");
    }
    
}
