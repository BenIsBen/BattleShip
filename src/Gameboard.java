import java.util.Random;
public class Gameboard {
    String[][] board = new String[10][10];
    public Gameboard(){
        for(int i = 0; i < 10; i++){
            String[] row = new String[10];
            for(int j = 0; j < 10; j++){
                row[j] = "🌊";
            }
            board[i] = row;
        }
    }

    public void randomShips(){
        Random rando = new Random();
        String o;
        for(int i = 0; i < 10; i++) {
            int lat = rando.nextInt(10);
            int log = rando.nextInt(10);
            if(rando.nextInt(2)== 1){
                o = "ho";
            }else{
                o = "vert";
            }
            makeShip(lat, log, i, o);
        }
    }

    private void makeShip(int x, int y, int z, String o){
        int which = 0;
        switch(z){
            case 1:
            case 2:
            case 3:
            case 4:
                which = 2;
                break;
            case 5:
            case 6:
            case 7:
                which = 3;
                break;
            case 8:
            case 9:
                which = 4;
                break;
            case 10:
                which = 5;
                break;

        }
        if(o.equals("ho")) {
            for (int i = 0; i < which; i++) {
                this.board[x][y] = "🛥️";
            }
        }else{
            for(int i = 0; i<which; i++){
                this.board[x][y] = "🛥️";
            }
        }
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }
}



