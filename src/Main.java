import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Fighter f1=new Fighter("Diaz",8,120,90);
        Fighter f2=new Fighter("McGregor",15,105,80);
        Match match=new Match(f1,f2,80,100);
        match.run();
    }
}
