public class TreeNode{
    private int value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int value, TreeNode left, TreeNode right){
        this.setValue(value);
        this.setLeftNode(left);
        this.setRightNode(right);
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int newValue){
        this.value = newValue;
    }

    public TreeNode getLeftNode(){
        return this.left;
    }

    public void setLeftNode(TreeNode node){
        this.left = node;
    }

    public TreeNode getRightNode(){
        return this.right;
    }

    public void setRightNode(TreeNode node){
        this.right = node;
    }

    public int addNodeValues(TreeNode node){
        if (node == null){
            return 0;
        }
        return node.getValue() + addNodeValues(node.getLeftNode()) + addNodeValues(node.getRightNode());
    }
}