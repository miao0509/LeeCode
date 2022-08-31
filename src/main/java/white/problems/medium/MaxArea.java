package white.problems.medium;

public class MaxArea {
    /**
     * 暴力 N^2
     * @param height
     * @return
     */
    public static int maxArea1(int[] height) {
        int width = 0;
        int high = 0;
        int max = 0;
        int area = 0;
//        int [][] ans = new int[height.length][height.length];
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                width = j-i;
                high = Integer.min(height[i],height[j]);
                area= width * high;
                if (area>max) max = area;
            }
        }
        return max;
    }
    public static int maxArea2(int[] height) {
        int area = 0;
        int max = 0;
        for (int i = 0,j=height.length-1; i <=j ;) {
            area = (j-i)*Integer.min(height[i],height[j]);
            max = Integer.max(area,max);
            if (height[i]<=height[j]) i++;
            else j--;
        }

        return max;
    }
}
