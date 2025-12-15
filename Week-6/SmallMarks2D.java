public class SmallMarks2D{
    public static void main(String[] x){
        int[][] marks = {{80,75},{90,85}};
        System.out.println("Students   Nepali English Total");
        
        for(int i = 0; i < marks.length; i++){
            int total = 0;
            System.out.print("Student " + (i + 1) + "  ");
            for(int j = 0; j < marks[i].length; j++){
                System.out.print(marks[i][j] + "     ");
                total += marks[i][j];
            }
            System.out.println(total);
        }
    }
}