package guajardo_3_arrays;

import java.util.Scanner;

public class Guajardo_3_Arrays {

    static Scanner sc = new Scanner(System.in);

    public static Player player, player1;
    public static Enemy enemy1;
    public static EnemyA enemyA;
   
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    static int maxX = 20;
    static int maxY = 20;
   
    static int northWallX;
    static int northWallY;
   
    static int southWallX;
    static int southWallY;
   
    static int eastWallX;
    static int eastWallY;
   
    static int westWallX;
    static int westWallY;


    static int treY = (int) (Math.random() * maxY);
    static int treX = (int) (Math.random() * maxX);
    static int treaX = (int) (Math.random() * maxY);
    static int trebY = (int) (Math.random() * maxX);

    public static String[][] map = new String[maxX][maxY];
    static boolean[][] traps = new boolean[maxX][maxY];
    static boolean[][] treasureChest = new boolean[maxX][maxY];
    static boolean[][] treasureChest2 = new boolean[maxX][maxY];
    static boolean[][] northWalls = new boolean[maxX][maxY];
    static boolean[][] southWalls = new boolean[maxX][maxY];
    static boolean[][] eastWalls = new boolean[maxX][maxY];
    static boolean[][] westWalls = new boolean[maxX][maxY];
   
    static boolean[][] enemyZ = new boolean[maxX][maxY];

    public static boolean game = true;
    public static boolean enemy = true;
    public static boolean enemya = true;
    public static boolean Traps = true;
    static String shop;
   
   


               
    public static void main(String[] args) {
        System.out.println("In a grid of 20x20 the king stealing has been robbed. A pair of bandits have stolen");
        System.out.println("his precious dimons. You have to help him by leading the way and helping ");
        System.out.println("get them back. If you fail to do so he wont be able to exchage them for money and retire ");
        System.out.println("in an island. If you fail to do so and get caught he will be DEAD. Be carefull with the radiation zone. ");
        System.out.println("Before beginning this dangerous journy would you like to go to the black market to gear up.");
        System.out.println("to try to get some gear?");
        Scanner blackmarket = new Scanner(System.in);
        shop = blackmarket.nextLine().toLowerCase();
        if(shop.contains("yes")){
            blackMarket();
        }else if (shop.contains("no")){
            Run();
        }
    }
    static void blackMarket(){
        System.out.println("1. Would you like to buy extra armor?");
        System.out.println("2. No traps");
        System.out.println("3. Leave shop");
       
        Scanner armor = new Scanner(System.in);
        shop = armor.nextLine().toLowerCase();
        if(shop.contains("1")){
            System.out.println("1.)10% extra armor");
            System.out.println("2.)20% extra armor");
            System.out.println("3.)30% extra armor");
            System.out.println("4.)40% extra armor");
            System.out.println("5.)50% extra armor");
            Scanner choice = new Scanner(System.in);
            shop = choice.nextLine().toLowerCase();
                if(shop.contains("1")){
                    player.HP = 110;
                    player.money -= 5;
                    System.out.println("Would you like to return to the black market or start this journy?");
                    Scanner backForMore = new Scanner(System.in);
                    shop = backForMore.nextLine().toLowerCase();
                        if(shop.contains("yes")){
                            blackMarket();
                        }else if(shop.contains("no")){
                            Run();
                        }
                }else if(shop.contains("2")){
                    player.HP = 120;
                    player.money -= 10;
                    System.out.println("Would you like to return to the black market or start this journy?");
                    Scanner backForMore2 = new Scanner(System.in);
                    shop = backForMore2.nextLine().toLowerCase();
                        if(shop.contains("yes")){
                            blackMarket();
                        }else if(shop.contains("no")){
                            Run();
                        }
                }else if(shop.contains("3")){
                    player.HP = 130;
                    player.money -= 15;
                    System.out.println("Would you like to return to the black market or start this journy?");
                    Scanner backForMore2 = new Scanner(System.in);
                    shop = backForMore2.nextLine().toLowerCase();
                        if(shop.contains("yes")){
                            blackMarket();
                        }else if(shop.contains("no")){
                            Run();
                        }
                }else if(shop.contains("4")){
                    player.HP = 140;
                    player.money -= 20;
                    System.out.println("Would you like to return to the black market or start this journy?");
                    Scanner backForMore2 = new Scanner(System.in);
                    shop = backForMore2.nextLine().toLowerCase();
                        if(shop.contains("yes")){
                            blackMarket();
                        }else if(shop.contains("no")){
                            Run();
                        }
                }else if(shop.contains("5")){
                    player.HP = 150;
                    player.money -= 25;
                    System.out.println("Would you like to return to the black market or start this journy?");
                    Scanner backForMore2 = new Scanner(System.in);
                    shop = backForMore2.nextLine().toLowerCase();
                        if(shop.contains("yes")){
                            blackMarket();
                        }else if(shop.contains("no")){
                            Run();
                        }
                }
        }
       
           if (shop.contains("2")){
                    Traps = false;
                    player.money -= 40;  
                    System.out.println("Thank you for your purchase, would you like to enter the shop again?!?!");
                    Scanner backForMore2 = new Scanner(System.in);
                    shop = backForMore2.nextLine().toLowerCase();
                        if(shop.contains("yes")){
                            blackMarket();
                        }else if(shop.contains("no")){
                            Run();
                        }
           }

            if(shop.contains("3")){
                Run();
            }
       
    }
   

    public static void Run() {

       
        setUp();
        //norhtWall 
          for (int w = 0; w < 100; w++) {
            int northWallX = 0;
            int northWallY = (int) Math.floor(Math.random() * maxY);
            northWalls[northWallY][northWallX] = true;
        } 
          for (int ww = 0; ww < 100; ww++) {
            int eastWallX = (int) Math.floor(Math.random() * maxX);
            int eastWallY = 19;
            eastWalls[eastWallY][eastWallX] = true;
        }
          for (int www = 0; www < 100; www++) {
            int southWallX = 18
                    ;
            int southWallY = (int) Math.floor(Math.random() * maxY);
            southWalls[southWallY][southWallX] = true;
        }
          for (int wwww = 0; wwww < 100; wwww++) {
            int westWallX = (int) Math.floor(Math.random() * maxX);
            int westWallY = 0;
            westWalls[westWallY][westWallX] = true;
        }
        while (game) {
            treasureChest();
            printArray();
            move();

        }
        while(Traps){
            traps();
            traps2();
        }
    }
    public static void Run2() {

        System.out.println("Next Level");
        setUp2();
                //norhtWall 
          for (int d = 0; d < 500; d++) {
            int northWallX = 1;
            int northWallY = (int) Math.floor(Math.random() * maxY);
            northWalls[northWallY][northWallX] = true;
        } 
          for (int a = 0; a < 100; a++) {
            int eastWallX = (int) Math.floor(Math.random() * maxX);
            int eastWallY = 19;
            eastWalls[eastWallY][eastWallX] = true;
        }
          for (int b = 0; b < 100; b++) {
            int southWallX = 19;
            int southWallY = (int) Math.floor(Math.random() * maxY);
            southWalls[southWallY][southWallX] = true;
        }
          for (int c = 0; c < 100; c++) {
            int westWallX = (int) Math.floor(Math.random() * maxX);
            int westWallY = 1;
            westWalls[westWallY][westWallX] = true;
        }
        while (game) {
            treasureChest();
            printArray();
            move();

        }
    }
    static void setUp() {
        player = new Player(4, 4);
        enemy1 = new Enemy((int) (Math.random() * maxX), (int) (Math.random() * maxX));
                  
        traps();

    }
   
        static void setUp2() {
        player = new Player((int) (Math.random() * maxX), (int) (Math.random() * maxX));
        enemy1 = new Enemy((int) (Math.random() * maxX), (int) (Math.random() * maxX));
        enemyA = new EnemyA((int) (Math.random() * maxX), (int) (Math.random() * maxX));
        traps2();
    }

    public static void printArray() {

        map[player.y][player.x] = player.symbol;
        map[enemy1.y][enemy1.x] = enemy1.symbol;
        map[enemyA.y][enemyA.x] = enemyA.symbol;
        map[eastWallY][eastWallX] = PURPLE + " ☢" + RESET;
        map[westWallY][westWallX] = PURPLE + " ☢" + RESET;
        map[northWallY][northWallX] = PURPLE + " ☢" + RESET;
        map[southWallY][southWallX] = PURPLE + " ☢" + RESET;

        for (int i = 0; i <= map[0].length - 1; i++) {
            for (int j = 0; j <= map[1].length - 1; j++) {
                map[player.y][player.x] = player.symbol;
                map[i][19] = " 8";
                if (j < map[1].length - 1) {
                    if (traps[i][j]) {
                        map[i][j] = GREEN + " #" + RESET;
                    }
                    if (northWalls[i][j]) {
                        map[i][j] = PURPLE + " ☢" + RESET;
                    }
                    if (southWalls[i][j]) {
                        map[i][j] = PURPLE + " ☢" + RESET;
                    }
                    if (westWalls[i][j]) {
                        map[i][j] = PURPLE + " ☢" + RESET;
                    }
                    if (eastWalls[i][j]) {
                        map[i][j] = PURPLE + " ☢" + RESET;
                    }
                    if (treasureChest[i][j]) {
                        map[i][j] = YELLOW + " T" + RESET;
                    }
                    if (enemyZ[i][j]) {
                        map[i][j] = enemy1.symbol;
                    }
                    if (enemyZ[i][j]) {
                        map[i][j] = enemyA.symbol;
                    }
                    if (map[i][j] != player.symbol && map[i][j] != GREEN +" #" + RESET && map[i][j] != YELLOW +" T" + RESET && map[i][j] != enemy1.symbol && map[i][j] != enemyA.symbol
                            && map[i][j] != PURPLE + " ☢" + RESET  ) {
                        System.out.print("  ");
                       
                    } else {
                        System.out.print(map[i][j]);
                        if (i == player.y && player.x == j) {
                        }
                    }
                } else if (map[i][j] != "  ") {
                    System.out.println("  ");
                } else {
                    System.out.println(map[i][j]);
                }

            }
        }
    }

    static void move() {
        map[player.y][player.x] = "  ";
        System.out.println("Input:");
        System.out.println("Health : " + player.HP);
       
        int direction = sc.nextInt();
        //north
        if (direction == 8) {
            player.y--;
            enemyZ();
            walls();

        }
        //south
        if (direction == 2) {
            player.y++;
            enemyZ();
            walls();

        }
        //east
        if (direction == 6) {
            player.x++;
            enemyZ();
            walls();
        }
        //west
        if (direction == 4) {
            player.x--;
            enemyZ();
            walls();

            player.x--;
        }
        //northEast
        if (direction == 9) {
            player.y--;
            player.x++;
            enemyZ();
            walls();
            player.y--;
            player.x++;
            //northWest
        }
        if (direction == 7) {
            player.y--;
            player.x--;
            enemyZ();
            walls();
            player.y--;
            player.x--;
            //southWest   
        }
        if (direction == 1) {
            player.y++;
            player.x--;
            enemyZ();
            walls();
            player.y++;
            player.x--;
            //southEast   
        }
        if (direction == 3) {
            player.y++;
            player.x++;
            enemyZ();
            walls();
            player.y++;
            player.x++;
        }

        if (traps[player.y][player.x]) {
            player.HP -= 10;
            live();
        }


        if (enemy1.x == player.x && enemy1.y == player.y) {
            player.HP -= 15;
            live();
        }
        if (enemyA.x == player.x && enemyA.y == player.y) {
            player.HP -= 15;
            live();
                }

           
       
    }

    public static void traps() {
        if (traps[treX][treY] == true) {
            treX = (int) Math.floor(Math.random() * maxX);
            treY = (int) Math.floor(Math.random() * maxY);
        }
               for (int t = 0; t < 20; t++) {
            int trapx = (int) Math.floor(Math.random() * maxX);
            int trapy = (int) Math.floor(Math.random() * maxY);
            traps[trapx][trapy] = true;
        }
       

    }
   
        public static void traps2() {
        if (traps[treX][treY] == true) {
            treX = (int) Math.floor(Math.random() * maxX);
            treY = (int) Math.floor(Math.random() * maxY);
        }
        for (int t = 0; t < 50; t++) {
            int trapx = (int) Math.floor(Math.random() * maxX);
            int trapy = (int) Math.floor(Math.random() * maxY);
            traps[trapx][trapy] = true;
        }

    }
        public static void walls(){
          if (northWalls[player.y][player.x]) {
              System.out.println("You reached the radiation zone you have just died.");
              game = false;
        } 
         if (southWalls[player.y][player.x]) {
            System.out.println("You reached the radiation zone you have just died.");
              game = false;
             
        }
         if (westWalls[player.y][player.x]) {
             System.out.println("You reached the radiation zone you have just died.");
              game = false;
             
        }
         if (eastWalls[player.y][player.x]) {
             System.out.println("You reached the radiation zone you have just died.");
              game = false;
             
        }
    }
       

    public static void treasureChest() {

        treasureChest[treY][treX] = true;
        if (treasureChest[player.y][player.x]) {
            //game = false;
            Run2();
        }
    }
        public static void treasureChest2() {

        treasureChest2[trebY][treaX] = true;
        if (treasureChest2[player.y][player.x]) {
            game = false;
           
            System.out.println("__   __           __        ___       \n" +
              "\\ \\ / /__  _   _  \\ \\      / (_)_ __  \n" +
              " \\ V / _ \\| | | |  \\ \\ /\\ / /| | '_ \\ \n" +
                "  | | (_) | |_| |   \\ V  V / | | | | |\n" +
              "  |_|\\___/ \\__,_|    \\_/\\_/  |_|_| |_|");
           
        }
    }
       
        public static void live(){
            if (player.HP <= 0){
                System.out.println(" __   __            _                   \n"
                    + " \\ \\ / /__  _   _  | |    ___  ___  ___ \n"
                    + "  \\ V / _ \\| | | | | |   / _ \\/ __|/ _ \\\n"
                    + "   | | (_)  ||_| | | |__| (_) \\__ \\  __/\n"
                    + "   |_|\\___/ \\__,_| |_____\\___/|___/\\___|");
                game = false;
        }
               
        }
       
    public static void enemyZ() {
        if (enemy == true) {
            if (enemy1.x > player.x) {
                map[enemy1.y][enemy1.x] = " .";
                enemy1.x--;
            }
            if (enemy1.x < player.x) {
                map[enemy1.y][enemy1.x] = " .";
                enemy1.x++;
            }
            if (enemy1.y < player.y) {
                map[enemy1.y][enemy1.x] = " .";
                enemy1.y++;
            }
            if (enemy1.y > player.y) {
                map[enemy1.y][enemy1.x] = " .";
                enemy1.y--;
            }
        }
                if (enemya == true) {
            if (enemyA.x > player.x) {
                map[enemyA.y][enemyA.x] = " .";
                enemyA.x--;
            }
            if (enemyA.x < player.x) {
                map[enemyA.y][enemyA.x] = " .";
                enemyA.x++;
            }
            if (enemyA.y < player.y) {
                map[enemyA.y][enemyA.x] = " .";
                enemyA.y++;
            }
            if (enemyA.y > player.y) {
                map[enemyA.y][enemyA.x] = " .";
                enemyA.y--;
            }
        }



    }


   
}