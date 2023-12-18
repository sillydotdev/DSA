package Arrays;// ---------------Trapped Rain Water-----------------

public class TrapperRainWater {

    public static int trappedRainWater(int height[]){
        int n = height.length;

        //calculate leftMax
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculate rightMax

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //loop
        int trappedWater = 0;
        int width = 1;
        for(int i=0; i<n; i++){

            //calculating waterLevel
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //calculating trappeWater
            trappedWater +=  (waterLevel - height[i]) * width;
        }
        return trappedWater;
    } 


    public static void main(String args[]){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapper water between the given array of bars = "+trappedRainWater(height));
       
    }
    
}
