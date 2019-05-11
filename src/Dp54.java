
/**
 * @ClassName Dp54
 * @Description leetcode 70
 * @Author GZfan
 * @Date 19-5-11
 */
public class Dp54 {
    public int climbStairs(int n) {
        int[] way=new int[n+1];
        if(n==1)
            return 1;
        else if(n==2)
            return 2;
        way[1]=1;
        way[2]=2;
        for (int i =3 ; i <= n; i++) {
            way[i]=way[i-1]+way[i-2];
        }
        return way[n];
    }
}
