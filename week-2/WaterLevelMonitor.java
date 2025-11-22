class WaterLevelMonitor{
    public static void main(String[] x){
        int waterLevel = 950;
        System.out.println("Current water level is " + waterLevel + "litres");
        String Message = (waterLevel >= 1000) ? "WARNING: Water level has reached 1000L or more!" : "Status: Normal";
        System.out.println(Message);
        int waterLevel1 = 1000;
        System.out.println("Current water level is " + waterLevel1 + "litres");
        String Message1 = (waterLevel1 >= 1000) ? "WARNING: Water level has reached 1000L or more!" : "Status: Normal";
        System.out.println(Message1);
        int waterLevel2 = 1200;
        System.out.println("Current water level is " + waterLevel2 + "litres");
        String Message2 = (waterLevel2 >= 1000) ? "WARNING: Water level has reached 1000L or more!" : "Status: Normal";
        System.out.println(Message2);
    }
}