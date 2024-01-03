package codegym;

public class SheepCount {

    private static int sheepCount = 0;

    public SheepCount() {
        sheepCount++;
    }

    public static int getSheepCount(){
        
        return sheepCount;
    }
    
    public static void setSheepCount(int sheep){
        sheepCount = sheep;
    }
    public static void main(String[] args) {
        SheepCount.setSheepCount(15);
        System.out.println(SheepCount.getSheepCount());
        System.out.println(SheepCount.getSheepCount());
        

    }

}
