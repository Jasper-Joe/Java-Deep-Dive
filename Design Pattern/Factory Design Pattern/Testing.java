import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        EnemyShip enemyShip = null;
        EnemyShipFactory factory = new EnemyShipFactory();
        Scanner input = new Scanner(System.in);
        String option = "";
        System.out.println("What type of ship?");
        if(input.hasNextLine()) {
            String typeOfShip = input.nextLine();
            enemyShip = factory.makeEnemyShip(typeOfShip);
            System.out.println(enemyShip.name);
        }
    }
}
