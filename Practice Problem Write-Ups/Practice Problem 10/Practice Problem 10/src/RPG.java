//Tiffany Behr
//CS-1180L-06
//Erik Buck...
//11-08-21

public class RPG {//this is how i heal after infinity war...
    public static void main(String[] args) throws Exception { 
        Player p1 = new Player("Wanda", 100, 20); //inserts character stats (String name, int health, int maxDamage)
        Player p2 = new Player("Thanos", 100, 10);

        System.out.println(p1 + "\t" + p2); //displays health before battle

        while (p1.getHealth() > 0 && p2.getHealth() > 0) { //exits 'battle' once one is dead XP
            p1.hit(p2);//attack!
            p2.hit(p1);
            System.out.println(p1 + "\t" + p2);
        }
    }
}
