/**
 * @ClassName Trees50
 * @Description leetcode 108
 * @Author GZfan
 * @Date 19-5-10
 */
public class Trees50 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return makeTrees(nums,0,nums.length-1);
    }
    private static TreeNode makeTrees(int[] nums,int front,int end){
        if(front > end)
            return null;
        int mid=(end-front)/2+front;
        TreeNode root = new TreeNode(nums[mid]);
        root.left=makeTrees(nums,front, mid-1);
        root.right=makeTrees(nums,mid+1, end);
        return root;
    }
}
