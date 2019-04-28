import java.util.ArrayDeque;
import java.util.Queue;

public class BFS {
    public static class TreeNode {
        String val;
        TreeNode left;
        TreeNode right;
        TreeNode(String x) { val = x; }
        TreeNode(String x, TreeNode left, TreeNode right){
            val = x;
            this.left = left;
            this.right = right;
        }
    }

    public static void preOrder(TreeNode root) {
        if(root == null){
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void bfs(TreeNode root) {
        ArrayDeque<TreeNode> queue =new ArrayDeque<TreeNode>();
        if(root == null){
            return;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();
            System.out.println(node.val);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
    }

    public static void dfs(TreeNode root) {
        ArrayDeque<TreeNode> stack =new ArrayDeque<TreeNode>();
        if(root == null){
            return;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            System.out.println(node.val);
            if(node.right != null){
                stack.push(node.right);
            }
            if(node.left != null){
                stack.push(node.left);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode i = new TreeNode("I");
        TreeNode h = new TreeNode("H");
        TreeNode g = new TreeNode("G");
        TreeNode e = new TreeNode("E");
        TreeNode f = new TreeNode("F", h, i);
        TreeNode d = new TreeNode("D", null, g);
        TreeNode c = new TreeNode("C", f, null);
        TreeNode b = new TreeNode("B", d, e);
        TreeNode root = new TreeNode("A", b, c);
        preOrder(root);
        System.out.println("======BFS=======");
        bfs(root);
        System.out.println("======DFS=======");
        dfs(root);
    }
}
