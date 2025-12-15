public class MiniSeating{
    public static void main(String[] x){
        String [][] seats = new String[2][3]; 
        // first row values inserted
        seats[0][0] = "Yodin";
        seats[0][1] = "Biraj";
        seats[0][2] = "Subhu";
        // showing seats
        System.out.println("Seating chart:");
        for(int i = 0; i < seats.length; i++){
            for(int j = 0; j < seats[i].length; j++){
                if (seats[i][j] == null){
                    System.out.print("[empty] ");
                }else{
                    System.out.print("[" + seats[i][j] + "] ");
                }
            }
            System.out.println();
        }
    }
}