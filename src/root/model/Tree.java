package root.model;

import root.Utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

//18Б вариант
public class Tree {
    private Tree parentTree;
    private List<Tree> childrenTrees;
    private Random random = new Random();
    private int parentId = 0;
    private int currentId = 0;

    public Tree(Tree tree) {
        if (tree != null) parentId = tree.getCurrentId();
        Utils.incTreeCount();
        currentId = Utils.TREE_COUNT;
        parentTree = tree;
        childrenTrees = new LinkedList<>();
        int randomInt = random.nextInt(Utils.m);
        for (int i = 0; i < randomInt; i++) {
            if (Utils.FREE_TREE_COUNT < Utils.N) {
                childrenTrees.add(new Tree(this));
            } else {
                childrenTrees.add(new Tree(this, false));
            }
        }
        if (randomInt == 0) {
            Utils.incFreeTreeCount();
        }
    }

    public Tree(){

    }

    private void addChildrenTrees(List<Tree> list, Tree parentTree) {
        int randomInt = random.nextInt(Utils.m);
        for (int i = 0; i < randomInt; i++) {
            if (Utils.FREE_TREE_COUNT < Utils.N) {
                Tree tree1 = new Tree();
                tree1.setParentTree(parentTree);
                Utils.incTreeCount();
                tree1.setCurrentId(Utils.TREE_COUNT);
                tree1.setParentId(parentTree.currentId);
                childrenTrees.add(tree1);
            } else {
                childrenTrees.add(new Tree(parentTree, false));
            }
        }
    }

    public Tree(Tree tree, int stopValue) {
        if (tree != null) parentId = tree.getCurrentId();
        Utils.listTreeFree.clear();
        Utils.random_0 = 0;
        Utils.random_1 = 0;
        Utils.random_2 = 0;
        Utils.random_3 = 0;
        Utils.random_4 = 0;
        Utils.incTreeCount();
        Utils.TREE_LEVEL = 1;
        currentId = Utils.TREE_COUNT;
        parentTree = tree;
        Utils.currTreeCreated.add(this);
        for (int j = 0; ; j++) {
            for (int k = 0; k < Utils.currTreeCreated.size(); k++) {
                int randomInt = random.nextInt(Utils.m);
                LinkedList<Tree> childrenTrees = new LinkedList<>();
                switch (randomInt) {
                    case 0:
                        Utils.random_0++;
                        break;
                    case 1:
                        Utils.random_1++;
                        break;
                    case 2:
                        Utils.random_2++;
                        break;
                    case 3:
                        Utils.random_3++;
                        break;
                }
                for (int i = 0; i < randomInt; i++) {
                    Tree oneTree = new Tree();
                    oneTree.parentTree = Utils.currTreeCreated.get(k);
                    oneTree.setParentId(Utils.currTreeCreated.get(k).currentId);
                    Utils.incTreeCount();
                    oneTree.currentId = Utils.TREE_COUNT;
                    childrenTrees.add(oneTree);
                    if (Utils.TREE_COUNT < stopValue)
                    Utils.nextTreeCreated.add(oneTree);
                    else {
                        Utils.incLastLevelTreeCount();
                        Utils.listTreeFree.add(oneTree);
                    }
                }
                if (randomInt == 0 && Utils.TREE_COUNT < stopValue) {
                    Utils.incFreeTreeCount();
                    Utils.listTreeFree.add(Utils.currTreeCreated.get(k));
                }
                Utils.currTreeCreated.get(k).setChildrenTrees(childrenTrees);
            }
            Utils.currTreeCreated.clear();
            Utils.currTreeCreated.addAll(Utils.nextTreeCreated);
            Utils.nextTreeCreated.clear();
            Utils.TREE_LEVEL = j + 2;
            if (Utils.currTreeCreated.size() == 0) break;
        }
    }



    @Override
    public String toString() {
        return "(" + currentId + ", " + parentId + ")";
    }

    public void printAllTree() {
        Utils.printLn("Висячие вершины:");
        for (int k = 0; k < Utils.listTreeFree.size(); k++) {
            Utils.print(Utils.listTreeFree.get(k).toString());
        }
        Utils.printLn("");
        Utils.printLn("\n");
        if (parentId == 0) {
            Utils.printLn("Корневой уровень:");
            System.out.print(this.toString());
        }
        List<Tree> currStepTrees = new ArrayList<>();
        currStepTrees.add(this);
        for (int j = 1; ; j++) {
            if (currStepTrees.size() == 0) return;
            Utils.printLn("\n");
            Utils.printLn(j + " уровень");
            for (int i = 0; i < currStepTrees.size(); i++) {
                if (currStepTrees.get(i).getChildrenTrees() != null) {
                    if (currStepTrees.get(i).getChildrenTrees().size() != 0){
                        Utils.currTreePrinted.addAll(currStepTrees.get(i).getChildrenTrees());
                    }
                }
            }
            for (int i = 0; i < Utils.currTreePrinted.size(); i++) {
                Utils.print(Utils.currTreePrinted.get(i).toString());
            }
            currStepTrees.clear();
            currStepTrees.addAll(Utils.currTreePrinted);
            Utils.currTreePrinted.clear();
        }
    }

    private Tree(Tree parentTree, boolean b) { //для Б проверки
        Utils.incLastLevelTreeCount();
        Utils.incTreeCount();
        parentId = parentTree.getCurrentId();
        currentId = Utils.TREE_COUNT;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getCurrentId() {
        return currentId;
    }

    public void setCurrentId(int currentId) {
        this.currentId = currentId;
    }

    public Tree getParentTree() {
        return parentTree;
    }

    public void setParentTree(Tree parentTree) {
        this.parentTree = parentTree;
    }

    public List<Tree> getChildrenTrees() {
        return childrenTrees;
    }

    public void setChildrenTrees(List<Tree> childrenTrees) {
        this.childrenTrees = childrenTrees;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}

//альфа детерм дерева всегда должно быть меньше альфа случайного дерева (проверка, это условие выполняется всегда)
//гистограмма мат ожидания рандомного числа предков