package com.company;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public void helper(TreeNode root, List<Integer> res){
        if (root != null){
            res.add(root.val);
            helper(root.left, res);
            helper(root.right, res);
        }
    }

}

