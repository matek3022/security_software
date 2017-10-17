package root;

import root.model.Tree;

public class RootTreeClass {

    public static void main(String[] args) {
        System.out.println("N = " + Utils.N);
        System.out.println("m = " + Utils.m);
        System.out.println("Всего деревьев = " + Utils.COUNT);
        System.out.println(" ");
        System.out.println("ITER | СЛУЧ_ВИС | ПРИН_ВИС | ВСЕГО_ВЕРШ");
        System.out.println("-----|----------|----------|-----------");
        for (int i = 1; i <= Utils.COUNT; i++) {
            Tree printedTree = createTree(Utils.N);
            System.out.print(i);

//            Utils.print(String.valueOf(Utils.FREE_TREE_COUNT) + " ");
//            Utils.print(String.valueOf(Utils.LAST_LEVEL_STOP_TREE_COUNT) + " ");
//            Utils.print(String.valueOf(Utils.TREE_COUNT) + " ");
//            Utils.print(String.valueOf(((double) Utils.TREE_COUNT / (Utils.FREE_TREE_COUNT + Utils.LAST_LEVEL_STOP_TREE_COUNT))) + " ");
//            Utils.print(String.valueOf(Utils.TREE_LEVEL) + " ");
//            Utils.printLn("");
            if (i < 10) {
                if (Utils.FREE_TREE_COUNT < 10) {
                    System.out.print("    | " + Utils.FREE_TREE_COUNT + "        | ");
                    if (Utils.LAST_LEVEL_STOP_TREE_COUNT < 10) {
                        System.out.print(Utils.LAST_LEVEL_STOP_TREE_COUNT + "        | " + Utils.TREE_COUNT);
                    }
                    if (Utils.LAST_LEVEL_STOP_TREE_COUNT > 9 && Utils.LAST_LEVEL_STOP_TREE_COUNT < 100) {
                        System.out.print(Utils.LAST_LEVEL_STOP_TREE_COUNT + "       | " + Utils.TREE_COUNT);
                    }
                    if (Utils.LAST_LEVEL_STOP_TREE_COUNT > 99) {
                        System.out.print(Utils.LAST_LEVEL_STOP_TREE_COUNT + "      | " + Utils.TREE_COUNT);
                    }
                } else {
                    System.out.print("    | " + Utils.FREE_TREE_COUNT + "       | ");
                    if (Utils.LAST_LEVEL_STOP_TREE_COUNT < 10) {
                        System.out.print(Utils.LAST_LEVEL_STOP_TREE_COUNT + "        | " + Utils.TREE_COUNT);
                    }
                    if (Utils.LAST_LEVEL_STOP_TREE_COUNT > 9 && Utils.LAST_LEVEL_STOP_TREE_COUNT < 100) {
                        System.out.print(Utils.LAST_LEVEL_STOP_TREE_COUNT + "       | " + Utils.TREE_COUNT);
                    }
                    if (Utils.LAST_LEVEL_STOP_TREE_COUNT > 99) {
                        System.out.print(Utils.LAST_LEVEL_STOP_TREE_COUNT + "      | " + Utils.TREE_COUNT);
                    }
                }
            }
            if (i > 9 && i < 100) {
                if (Utils.FREE_TREE_COUNT < 10) {
                    System.out.print("   | " + Utils.FREE_TREE_COUNT + "        | ");
                    if (Utils.LAST_LEVEL_STOP_TREE_COUNT < 10) {
                        System.out.print(Utils.LAST_LEVEL_STOP_TREE_COUNT + "        | " + Utils.TREE_COUNT);
                    }
                    if (Utils.LAST_LEVEL_STOP_TREE_COUNT > 9 && Utils.LAST_LEVEL_STOP_TREE_COUNT < 100) {
                        System.out.print(Utils.LAST_LEVEL_STOP_TREE_COUNT + "       | " + Utils.TREE_COUNT);
                    }
                    if (Utils.LAST_LEVEL_STOP_TREE_COUNT > 99) {
                        System.out.print(Utils.LAST_LEVEL_STOP_TREE_COUNT + "      | " + Utils.TREE_COUNT);
                    }
                } else {
                    System.out.print("   | " + Utils.FREE_TREE_COUNT + "       | ");
                    if (Utils.LAST_LEVEL_STOP_TREE_COUNT < 10) {
                        System.out.print(Utils.LAST_LEVEL_STOP_TREE_COUNT + "        | " + Utils.TREE_COUNT);
                    }
                    if (Utils.LAST_LEVEL_STOP_TREE_COUNT > 9 && Utils.LAST_LEVEL_STOP_TREE_COUNT < 100) {
                        System.out.print(Utils.LAST_LEVEL_STOP_TREE_COUNT + "       | " + Utils.TREE_COUNT);
                    }
                    if (Utils.LAST_LEVEL_STOP_TREE_COUNT > 99) {
                        System.out.print(Utils.LAST_LEVEL_STOP_TREE_COUNT + "      | " + Utils.TREE_COUNT);
                    }
                }
            }
            if (i > 99) {
                if (Utils.FREE_TREE_COUNT < 10) {
                    System.out.print("  | " + Utils.FREE_TREE_COUNT + "        | ");
                    if (Utils.LAST_LEVEL_STOP_TREE_COUNT < 10) {
                        System.out.print(Utils.LAST_LEVEL_STOP_TREE_COUNT + "        | " + Utils.TREE_COUNT);
                    }
                    if (Utils.LAST_LEVEL_STOP_TREE_COUNT > 9 && Utils.LAST_LEVEL_STOP_TREE_COUNT < 100) {
                        System.out.print(Utils.LAST_LEVEL_STOP_TREE_COUNT + "       | " + Utils.TREE_COUNT);
                    }
                    if (Utils.LAST_LEVEL_STOP_TREE_COUNT > 99) {
                        System.out.print(Utils.LAST_LEVEL_STOP_TREE_COUNT + "      | " + Utils.TREE_COUNT);
                    }
                } else {
                    System.out.print("  | " + Utils.FREE_TREE_COUNT + "       | ");
                    if (Utils.LAST_LEVEL_STOP_TREE_COUNT < 10) {
                        System.out.print(Utils.LAST_LEVEL_STOP_TREE_COUNT + "        | " + Utils.TREE_COUNT);
                    }
                    if (Utils.LAST_LEVEL_STOP_TREE_COUNT > 9 && Utils.LAST_LEVEL_STOP_TREE_COUNT < 100) {
                        System.out.print(Utils.LAST_LEVEL_STOP_TREE_COUNT + "       | " + Utils.TREE_COUNT);
                    }
                    if (Utils.LAST_LEVEL_STOP_TREE_COUNT > 99) {
                        System.out.print(Utils.LAST_LEVEL_STOP_TREE_COUNT + "      | " + Utils.TREE_COUNT);
                    }
                }
            }
            System.out.println("    ALPHA = " + String.format("%.10f", ((double) Utils.TREE_COUNT / (Utils.FREE_TREE_COUNT + Utils.LAST_LEVEL_STOP_TREE_COUNT))) + "                        ВЫСОТА = " + (Utils.TREE_LEVEL - 1));
            System.out.print("-----|----------|----------|-----------");
            Utils.printLn(((double) Utils.TREE_COUNT / (Utils.FREE_TREE_COUNT + Utils.LAST_LEVEL_STOP_TREE_COUNT)) < 1.5 ? "Ошибка альфа!!!" : "");

            Utils.FREE_TREE_COUNT = 0;
            Utils.LAST_LEVEL_STOP_TREE_COUNT = 0;
            Utils.TREE_COUNT = 0;
            if (i == Utils.COUNT) printedTree.printAllTree();
        }

        System.out.println(" ");
        System.out.println("для последнего дерева: ");
        System.out.println("0 выпало раз = " + Utils.random_0);
        System.out.println("1 выпало раз = " + Utils.random_1);
        System.out.println("2 выпало раз = " + Utils.random_2);
        System.out.println("3 выпало раз = " + Utils.random_3);
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("Число отбракованных деревьев (свобоные узлы < 10) = " + Utils.GARBAGE_TREE_COUNT);
        System.out.println(" ");
    }

    private static Tree createTree(int stopValue) {
        Tree res = new Tree(null, stopValue);
        if (Utils.FREE_TREE_COUNT < 10 && stopValue > 50) {
            Utils.incGarbageTreeCount();
            Utils.FREE_TREE_COUNT = 0;
            Utils.LAST_LEVEL_STOP_TREE_COUNT = 0;
            Utils.TREE_COUNT = 0;
            res = createTree(stopValue);
        }
        /**
         * Условие несоответствия мат ожид.
         */
        if ((Utils.random_1 + 2 * Utils.random_2 + 3 * Utils.random_3) / (double)(Utils.random_0 + Utils.random_1 + Utils.random_2 + Utils.random_3) < 1.25
                || (Utils.random_1 + 2 * Utils.random_2 + 3 * Utils.random_3) / (Utils.random_0 + Utils.random_1 + Utils.random_2 + Utils.random_3) > 1.75) {
            Utils.printLn("Ошибка мат ожидания");
            Utils.incGarbageTreeCount();
            Utils.FREE_TREE_COUNT = 0;
            Utils.LAST_LEVEL_STOP_TREE_COUNT = 0;
            Utils.TREE_COUNT = 0;

            res = createTree(stopValue);
        }
        return res;
    }
}
