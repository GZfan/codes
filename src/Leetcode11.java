/**
 * @ClassName Leetcode4
 * @Description
 * @Author GZfan
 * @Date 2019/10/10
 */
public class Leetcode11 {
    public int maxArea(int[] height) {
        int front = 0, tail = height.length - 1;
        int maxArea = 0;
        while (front < tail) {
            int area = (height[front] > height[tail] ? height[tail] : height[front]) * (tail - front);
            if (area > maxArea) {
                maxArea = area;
            }
            if (height[front] > height[tail]) {
                int temp = height[tail--];
                while (tail > front && height[tail] <= temp) {
                    tail--;
                }
            } else {
                int temp = height[front];
                while (tail > front && height[front] <= temp) {
                    front++;
                }
            }
        }
        return maxArea;
    }
}
