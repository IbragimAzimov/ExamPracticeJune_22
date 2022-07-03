package practice_4;

public class Main4 {

    public static void main(String[] args) {

        RightPocket rightPocket = new RightPocket();
        rightPocket.setHasThings("Деньги");
        LeftPocket leftPocket = new LeftPocket();
        leftPocket.setHasThings("Телефон");

        System.out.println("В правом кармане есть " + rightPocket.getHasThings().toString());
        System.out.println("В левом кармане есть " + leftPocket.getHasThings().toString());
        System.out.print(leftPocket.getHasThings().toString()); LeftPocket.hasRings();

    }
}
