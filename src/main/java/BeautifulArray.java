import java.util.ArrayList;

public class BeautifulArray {
    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> numb = new ArrayList<>();
        numb.add(1);
        while (numb.size() < n) {
            ArrayList<Integer> numbNew = new ArrayList <>();
            for (int i : numb) { //добавление нечетных элементов в массив
                int a = i * 2 - 1;
                if (a <= n) {
                    numbNew.add(a);
                }
            }

            for (int i : numb) { //добавление четных элементов в массив
                int a = i * 2;
                if (a <= n) {
                    numbNew.add(a);
                }
                numb = numbNew;
            }
        }
        return numb;
    }


    public static void main(String[] args) {
        System.out.println(beautifulArray(5));
        System.out.println("Лена лучший препод!!!!!");
    }
}