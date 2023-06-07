public class Scoreboard {
    private int numEntries = 0;
    private GameEntry[] board; 
    
    public Scoreboard(int capacity){
        board = new GameEntry[capacity];
    }

    public void add(GameEntry e){
        if (numEntries < board.length || e.getScore() > board[numEntries-1].getScore()){
            if(numEntries < board.length ){
                numEntries++;
            }
            int i = numEntries-1;
            while(i>0 && e.getScore()>board[i-1].getScore()){
                board[i]=board[i-1];
                i--;
            }
            board[i]=e;
        }

    }

    public GameEntry remove(int i) throws IndexOutOfBoundsException{
        if(i<0 || i>numEntries-1){
            new IndexOutOfBoundsException("invalid index："+i);
        }
        GameEntry t=board[i];
        while(i<numEntries-1){
            board[i]=board[i+1];
            i++;
        }
        board[numEntries-1]=null;
        numEntries--;
        return t;
    }

    public int getNumboard(){
        return numEntries;
    }


    public void printBoard() {
        for (int i = 0; i < numEntries; i++) {
            System.out.println(board[i].toString());
        }
    }

}
