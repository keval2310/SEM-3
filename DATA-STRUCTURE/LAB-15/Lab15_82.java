import java.util.Scanner;

public class Lab15_82{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes");
        int n = sc.nextInt();

        int[] pre = new int[n];
        int[] post = new int[n];

        System.out.println("Enter Preorder Traversal");
        for (int i = 0; i < n; i++) {
            pre[i] = sc.nextInt();
        }

        System.out.println("Enter Postorder Traversal");
        for (int i = 0; i < n; i++) {
            post[i] = sc.nextInt();
        }

        ConstructBTree cb = new ConstructBTree();
        TreeNode root = cb.constructFromPrePost(pre, post);

        BSTTree btree = new BSTTree();
        btree.preOrder(root);

        sc.close();
    }
}

class ConstructBTree {
    int preIndex;
    int posIndex;

    public ConstructBTree() {
        preIndex = 0;
        posIndex = 0;
    }

    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        TreeNode root = new TreeNode(pre[preIndex++]);

        if (root.data != post[posIndex])
            root.left = constructFromPrePost(pre, post);

        if (root.data != post[posIndex])
            root.right = constructFromPrePost(pre, post);

        posIndex++;

        return root;
    }
}