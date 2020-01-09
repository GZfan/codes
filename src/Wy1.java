import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @ClassName Wy1
 * @Description
 * @Author GZfan
 * @Date 2020/1/9
 */
public class Wy1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int M=in.nextInt();
        ArrayList<DP> list=new ArrayList<>(N);
        for(int i=0;i<N;i++){
            DP dp=new DP();
            dp.di=in.nextInt();
            dp.pi=in.nextInt();
            list.add(dp);
        }
        Collections.sort(list, Comparator.comparingInt(o -> o.di));
        int max=list.get(0).di;
        for (DP dp : list) {
           if(dp.pi>max){
               max=dp.pi;
           }else {
               dp.pi=max;
           }
        }
        int[] Ai=new int[M];
        for(int i=0;i<M;i++){
            Ai[i]=in.nextInt();
        }
        for (int item : Ai) {
            binarySearch(list,item,0,M-1);
        }
    }
    private static void binarySearch(ArrayList<DP> list,int ai,int left,int right){
        while(left<right){
            int mid=left+(right-left)/2;
            if(list.get(mid).di==ai){
                System.out.println(list.get(mid).pi);
                return;
            }
            if(list.get(mid).di>ai){
                right=mid;
            }else {
                left=mid+1;
            }
        }
        int res=0;
        if(list.get(left).di>ai && left-1>=0){
            res=list.get(left-1).pi;
        }else if(list.get(left).di<=ai){
            res=list.get(left).pi;
        }
        System.out.println(res);
    }
    static class DP{
        int di;
        int pi;
    }
}
