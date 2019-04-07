public class BubleSortJava {


    // Hence the time complexity of Bubble Sort is O(n2).
    //The main advantage of Bubble Sort is the simplicity of the algorithm.
    //The space complexity for Bubble Sort is O(1), because only a single additional memory space is required i.e. for temp variable.

    public static int[] BubbleSort(int[] ar)
    {
        if (ar.length<=1) return ar;

        boolean flag = true;
        int temp =0;
        int s = ar.length;
        int iter = 1;
        int changes =0;
        int lookups = 0;

        while (flag)
        {
            flag = false;
            for (int i = 0; i < s-1; i++)
            {
                if (ar[i] > ar[i +1])
                {
                    temp = ar[i];
                    ar[i] = ar[i+1];
                    ar[i+1] = temp;
                    flag = true;
                    changes++;
                }
                lookups++;
            }
            iter++;
        }
        System.out.println("Simple Bubble Sort");
        System.out.println(iter + " Всего произведено действий: ");
        System.out.println("Перестановок: " + changes);
        System.out.println("LookUps: " + lookups);
     return ar;
    }

    public static int[] BubbleSortOptimazed(int[] ar)
    {
        if (ar.length<=1) return ar;

        boolean flag = true;
        int temp =0;
        int s = ar.length;
        int iter = 1;
        int changes =0;
        int lookups = 0;


        while (flag)
        {
            flag = false;
            for (int i = 0; i < s-1; i++)
            {
                if (ar[i] > ar[i +1])
                {
                    temp = ar[i];
                    ar[i] = ar[i+1];
                    ar[i+1] = temp;
                    flag = true;

                    changes++;
                }
                lookups++;
            }
            iter++;
            s--;
        }
        System.out.println("Bubble Sort with an optimization");
        System.out.println(iter + " Всего произведено действий: ");
        System.out.println("Перестановок: " + changes);
        System.out.println("LookUps: " + lookups);

        return ar;
    }




    public static void main(String[] args) {
        int[] ar = {3,3,52,2,1,56,67,45,35432,67,78};
        int[] ar2 = {3,3,52,2,1,56,67,45,35432,67,78};
        BubbleSort(ar);

        for (int i =0; i < ar.length; i++) System.out.print(ar[i] + " ");


        System.out.println();
        System.out.println();
        BubbleSortOptimazed(ar2);
        for (int i =0; i < ar2.length; i++) System.out.print(ar2[i] + " ");


    }
}
