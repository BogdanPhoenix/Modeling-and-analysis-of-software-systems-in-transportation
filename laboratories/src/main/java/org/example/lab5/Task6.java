package org.example.lab5;

public class Task6 {
    private Task6(){}

    public static int maxPathSum(TreeNode root) {
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;

        maxPath(root,max);

        return max[0];
    }

    private static int maxPath(TreeNode node, int[] max){
        if(node==null) {
            return 0;
        }
        int left = Math.max(0,maxPath(node.left, max));
        int right = Math.max(0,maxPath(node.right, max));

        max[0] = Math.max(max[0], left + right + node.val);

        return Math.max(left,right) + node.val;
    }
}
