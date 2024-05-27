public class Main {
    static void zigZag(int cols){
        for (int r=1; r<=3;r++){
            for (int c=1; c<=cols; c++){
                if ((r+c)%4==0 || (r==2 && c%4==0)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Normal heart");
        for (int r=0; r<6; r++){
            for (int c=0; c<7; c++){
                if (r==0 && c%3!=0 ||
                r==1 && c%3==0 ||
                r-c==2 || r+c==8){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println("Reverse Heart");
        for (int r=0; r<6; r++){
            for (int c=0; c<7; c++){
                if (r==5 && c%3!=0 ||
                        r==4 && c%3==0 ||
                        c-r==3 || r+c==3){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        zigZag(13);
    }
}
