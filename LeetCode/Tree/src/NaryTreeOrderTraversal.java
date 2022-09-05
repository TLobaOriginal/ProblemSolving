import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class NaryTreeOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        if(root == null){
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        HashMap<Node, Integer> hashMap = new HashMap<>();
        Queue<Node> queue = new LinkedBlockingQueue<>();
        ArrayList<Node> nodeOrder = new ArrayList<>();

        queue.add(root);
        hashMap.put(root, 0);
        nodeOrder.add(root);
        while(!queue.isEmpty()){
            Node curr = queue.remove();
            List<Node> children = curr.children;

            for(Node child: children){
                hashMap.put(child, hashMap.get(curr) + 1);
                queue.add(child);
                nodeOrder.add(child);
            }
        }

        for(Node node: nodeOrder){
           int level = hashMap.get(node);
           while(result.size() < level + 1){
               result.add(new ArrayList<>());
           }

           result.get(level).add(node.val);
        }

        return result;
    }
}
