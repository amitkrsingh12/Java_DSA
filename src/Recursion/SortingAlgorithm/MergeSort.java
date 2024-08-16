package Recursion.SortingAlgorithm;

public class MergeSort
{
    public static void mergeSort(int[] arr)
    {
        if(arr.length<=1)
        {
            return;
        }
        int [] b = new int[arr.length/2];
        int [] c = new int[arr.length-b.length];
        for(int i=0;i<arr.length/2;i++)
        {
            b[i]=arr[i];
        }
        for(int i=arr.length/2;i<arr.length;i++)
        {
            c[i- arr.length/2] =arr[i];
        }
        mergeSort(b);
        mergeSort(c);
        merge(b,c,arr);
    }
    public static void merge(int [] s1,int[] s2,int[] d)
    {
        int i=0,j=0,k=0;
        while(i<s1.length && j<s2.length)
        {
            if(s1[i]<s2[j]) {
                d[k++] = s1[i++];
            }else
            {
                d[k++]=s2[j++];
            }
        }
        while(i<s1.length)
        {
            d[k++] =s1[i++];
        }
        while(j<s2.length)
        {
            d[k++]= s2[j++];
        }

    }
    public static void main(String args[])
    {
        int [] arr ={ 6,5,1,8,2,20,100,65,7 ,22};
        mergeSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println(arr.length);
    }
}
