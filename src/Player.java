public class Player {
    public Player(){
    }
    public String[][] guessedSpot(int x, int y, String[][] z){
        String what = z[x][y];
        if(what.equals("☹") || what.equals("🎯")){
             System.out.println("You've already targeted that space try a different one");
        }else {
            if (what.equals("🛥️")) {
                System.out.println("You got a hit! Good job");
                z[x][y] = "🎯";
            } else {
                System.out.println("Miss!");
                z[x][y] = "☹";
            }
        }
        return z;
    }
}
