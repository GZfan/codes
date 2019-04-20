import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName Array26
 * @Description leetcode 350
 * @Author GZfan
 * @Date 19-4-20
 */
public class Array26 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length1 = nums1.length, length2 = nums2.length;
        int length=length1>length2?length2:length1;
        int[] answer=new int[length];
        int i = 0, j = 0,index=0;
        for (; i < length1 && j < length2; ) {
            if (nums1[i] == nums2[j]) {
                answer[index++]=nums1[i];
                i++;
                j++;
            } else if (nums1[i] > nums2[j])
                j++;
            else i++;
        }
        if(index==0)
            return null;
        return Arrays.copyOfRange(answer, 0, index);
    }
}
