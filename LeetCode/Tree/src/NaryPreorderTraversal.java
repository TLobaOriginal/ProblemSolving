import java.util.ArrayList;
import java.util.List;

public class NaryPreorderTraversal {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        visit(root, res);
        return res;
    }

    public void visit(Node node, List<Integer> res){
        if(node == null) return;
        res.add(node.val);
        for(Node child: node.children){
            visit(child, res);
        }
    }
}
