public class English_Ruler {
    public static void drawRuler(int ninches,int majorLength){
        drawLine(majorLength,0);
        for (int i = 1; i <= ninches; i++) {
            drawInterval(majorLength-1);
            drawLine(majorLength,i);
        }
        }

    public static void drawInterval(int centralLength){
        if(centralLength>=1){
            drawInterval(centralLength-1);
            drawLine(centralLength);
            drawInterval(centralLength-1);
        }
    }

    public static void drawLine(int tickLength,int tickLabel){
        for(int j=0;j<tickLength;j++){
            System.out.print('-');
        }
        if(tickLabel>=0){
            System.out.print(' '+tickLabel);
        }
        System.out.println();
    }

    public static void drawLine(int tickLength){
        drawLine(tickLength,-1);
    }

    public static void main(String[] args) {
        drawRuler(5, 5);
    }

}
