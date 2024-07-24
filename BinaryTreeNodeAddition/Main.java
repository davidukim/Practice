public class Main{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, null, null);
        TreeNode nodeOne = new TreeNode(7, null, null);
        TreeNode nodeTwo = new TreeNode(1, null, null);
        TreeNode nodeThree = new TreeNode(3, null, null);
        TreeNode nodeFour = new TreeNode(4, null, null);
        TreeNode nodeFive = new TreeNode(2, null, null);

        root.setLeftNode(nodeOne);
        root.setRightNode(nodeTwo);
        nodeTwo.setLeftNode(nodeThree);
        nodeThree.setLeftNode(nodeFour);
        nodeThree.setRightNode(nodeFive);

        System.out.println(root.addNodeValues(root));
    }
}