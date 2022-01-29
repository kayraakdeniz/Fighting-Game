import java.sql.SQLOutput;
import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (isCheck()) {
            while (true) {
                Random rand = new Random();
                if (rand.nextInt(2) == 0) {//f1 önce vuruyor
                    System.out.println("****ROUND****");
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.f1.name + " sağlığı: " + this.f1.health);
                    System.out.println(this.f2.name + " sağlığı: " + this.f2.health);
                } else {//f2 önce vuruyor
                    System.out.println("****ROUND****");
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.f1.name + " sağlığı: " + this.f1.health);
                    System.out.println(this.f2.name + " sağlığı: " + this.f2.health);
                }
            }
        } else
            System.out.println("Sporcuların sikletleri uymuyor!");
    }

    public boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (this.f1.health <= 0) {
            System.out.println(this.f2.name + " kazandı!");
            return true;
        } else if (this.f2.health <= 0) {
            System.out.println(this.f1.name + " kazandı!");
            return true;
        }
        return false;
    }
}
