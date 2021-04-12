

public class Algo {
    public static void main(String[] args) {
        // array
        int nums[] = new int[10];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        nums[6] = 7;
        nums[7] = 8;
        nums[8] = 9;
        nums[9] = 11;
        //looping forward through our array
        for(int i = 0; i < nums.length; i++){
            //System.out.println(nums[i]);
        }
        //loping backward through our array
        for(int i = nums.length -1; i < 10; i--){
            //System.out.println(nums[i]);
        }
        //while loop
        int x = 1;
        while(x <= 5){
            System.out.println(x);
            x++;
        }
    }
}
