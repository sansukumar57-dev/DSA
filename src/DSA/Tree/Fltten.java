package DSA.Tree;

class Fltten {
      TreeNode prev = null;

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.right);

        flatten(root.left);

        root.right = prev;
        root.left = null;

        prev = root;
    }
}