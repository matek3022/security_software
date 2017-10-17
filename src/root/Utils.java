package root;

import root.model.Tree;

import java.util.ArrayList;

//200 деревьев для статистики
public class Utils {
    public static int COUNT = 200; //200 деревьев для статистики
    public static int N = 50; //максимальное число вершин, счетчик остановки
    public static int m = 4; //максимальное число исходящих вершин
    public static int FREE_TREE_COUNT = 0; //число свободных вершин, сгенерированных при рандомном выпадении числа потомком = 0
    public static int LAST_LEVEL_STOP_TREE_COUNT = 0; //число принудительно свободных вершин
    public static int TREE_COUNT = 0; //всего число вершин
    public static int GARBAGE_TREE_COUNT = 0; //число отбракованных деревьев

    public static int random_0 = 0;
    public static int random_1 = 0;
    public static int random_2 = 0;
    public static int random_3 = 0;
    public static int random_4 = 0;

    public static int TREE_LEVEL = 0; //уровень дерева

    public static ArrayList<Tree> currTreePrinted = new ArrayList<>();
    public static ArrayList<Tree> currTreeCreated = new ArrayList<>();
    public static ArrayList<Tree> nextTreeCreated = new ArrayList<>();

    public static ArrayList<Tree> listTreeFree = new ArrayList<>();


    public static void incFreeTreeCount() {
        FREE_TREE_COUNT++;
    }

    public static void incLastLevelTreeCount() {
        LAST_LEVEL_STOP_TREE_COUNT++;
    }

    public static void incTreeCount() {
        TREE_COUNT++;
    }

    public static void incGarbageTreeCount() {
        GARBAGE_TREE_COUNT++;
    }

    public static void print(String str) {
        System.out.print(str);
    }
    public static void printLn(String str) {
        System.out.println(str);
    }
}
