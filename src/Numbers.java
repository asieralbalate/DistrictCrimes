import java.util.*;

public class Numbers {
    public static final int LOWER = 5;
    public static final int UPPER = 200;
    public static void main(String[] args) {
        Map <Integer, List<Integer>> map = getMap(LOWER,UPPER);
        int keyNum;
        while(true){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a number: ");
            try{
                keyNum = in.nextInt();
                if (keyNum == -1){
                    break;
                }
                if (keyNum < LOWER || keyNum > UPPER){
                    throw new InputMismatchException();
                }
                System.out.println(map.get(keyNum));
            }catch (InputMismatchException ie){
                System.out.println("Please enter a number between 5 and 200");
            }
        }
    }

    public static Map<Integer, List<Integer>> getMap (int lowerLimit, int upperLimit){
        Map <Integer, List<Integer>> map = new HashMap<>();
        for (int key = lowerLimit; key <= upperLimit; key++){
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= key; i++){
                if (key % i == 0){
                    list.add(i);
                }
            }
            map.put(key, list);
        }
        return map;
    }
}
