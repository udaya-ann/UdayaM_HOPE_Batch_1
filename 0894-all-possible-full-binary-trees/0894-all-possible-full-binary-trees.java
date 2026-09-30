class Solution {
    public List<TreeNode> allPossibleFBT(int n) {

        List<TreeNode> result = new ArrayList<>();

        if (n % 2 == 0) {
            return result;
        }

        if (n == 1) {
            result.add(new TreeNode(0));
            return result;
        }

        for (int leftNodes = 1; leftNodes < n; leftNodes += 2) {

            int rightNodes = n - 1 - leftNodes;

            List<TreeNode> leftTrees = allPossibleFBT(leftNodes);
            List<TreeNode> rightTrees = allPossibleFBT(rightNodes);

            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {

                    TreeNode root = new TreeNode(0);

                    root.left = left;
                    root.right = right;

                    result.add(root);
                }
            }
        }

        return result;
    }
}