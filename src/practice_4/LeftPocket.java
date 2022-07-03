package practice_4;

public class LeftPocket extends MyPockets{

    LeftPocket (){

    }
    public static void hasRings (){
        System.out.println(" сейчас звонит");
    }

    @Override
    public String toString (){
        return getHasThings();
    }
}
