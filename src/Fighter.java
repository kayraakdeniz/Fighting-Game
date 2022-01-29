public class Fighter {
    String name;
    int damage;
    int health;
    int weight;

    public Fighter(String name, int damage, int health, int weight) {
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;

    }

    public int hit(Fighter foe) {//foe==rakip, düşman
        System.out.println(this.name+" "+this.damage+" hasar verdi "+foe.name+"\'ye");
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health-this.damage;
    }

}

