package test.java.java_class.Lambadas;

public class CheckIfHopper implements CheckTrait
{
    public boolean test(Animal a){
    return a.canHop();
}
}