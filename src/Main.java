import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        //variable to hold the height of the tree
        int height = rand.nextInt(0, 5);

        //build the tree
        TreeNode tree = Tree.perfectBinaryTree(height);

        //print tree
        Tree.printInOrder(tree);
    }
}