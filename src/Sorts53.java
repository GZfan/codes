/**
 * @ClassName Sorts53
 * @Description leetcode278
 * @Author GZfan
 * @Date 19-5-10
 */
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class Sorts53 extends VersionControl {
    private static int m;
    public int firstBadVersion(int n) {
        check(0,n);
        return m;
    }
    private static void check(int start,int end){
        VersionControl t=new Sorts53();
        if(start>=end) {
            if(t.isBadVersion(start)){
                m=start;
            }else{
                m=start+1;
            }
        }
        else{
            int mid=start+(end-start)/2;
            if(t.isBadVersion(mid)){
                check(start, mid-1);
            } else {
                check(mid+1, end);
            }
        }
    }
}
//强迫症不想看见错误提示随便加上去的
abstract class VersionControl{
    boolean isBadVersion(int n){return true;}
}