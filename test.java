public class test {
    public static void main(String[] args) {
        String name="0123456789";
        Scoreboard e= new Scoreboard(10);
        for(int i=0;i<10;i++){
            GameEntry a=new GameEntry(name, i);
            e.add(a);
            
        }
        //GameEntry extra=new GameEntry("ei", 10);
        //e.add(extra);
        //
        System.out.println(e.getNumboard());
        System.out.println(e.remove(5).toString());
        System.out.println(e.getNumboard());
    }
    
}
