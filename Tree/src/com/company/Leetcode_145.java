package com.company;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public void helper (TreeNode root, List<Integer> res){
        if (root != null){
            helper(root.left, res);
            helper(root.right, res);
            res.add(root.val);
        }
    }
}

