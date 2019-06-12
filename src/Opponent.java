import java.util.Random;
public class Opponent {
    Random rando = new Random();
    String name;
    int[] x = new int[1000];
    int[] y = new int[1000];
    int which = 0;
    public Opponent(String name){
        this.name = name;
    }
    public void guessRandom(){
        int randx = rando.nextInt();
        int randy = rando.nextInt();
        for(int i = 0; i < 1000; i++){
            if(randx != x[i] && randy != y[i]){
                x[which] = randx;
                y[which] = randy;
            }
        }
        which++;
    }
    public static String[][] HasRandom(int x, int y, String[][] z){
        String what = z[x][y];
        if (what.equals("🛥️")) {
            System.out.println("Opponent has hit your ship");
                z[x][y] = "🎯";
            } else {
                System.out.println("Opponent has missed!");
                z[x][y] = "☹";
            }
        return z;
    }

    public int[] getX() {
        return x;
    }

    public int[] getY() {
        return y;
    }

    public int getWhich() {
        return which;
    }
}
