/**
 * @ClassName Leetcode134
 * @Description
 * @Author GZfan
 * @Date 2020/1/3
 */
public class Leetcode134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for(int i=0;i<gas.length;i++){
            if(gas[i]<cost[i]){
                continue;
            }
            int j=(i+1)%gas.length;
            int total=gas[i]-cost[i];
            while(j!=i){
                total+=gas[j]-cost[j];
                if(total<0){
                    break;
                }
                j=(j+1)%gas.length;
            }
            if(j==i){
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};
        Leetcode134 t=new Leetcode134();
        t.canCompleteCircuit(gas,cost);
    }
}
