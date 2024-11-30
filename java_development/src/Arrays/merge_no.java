package Arrays;

class merge_no
{
    public static void main(String[] args) {
        int arr1[] = {4,5,6,7};
        int arr2[] = {8,9,10,11};

        int arr[]  = new int[arr2.length+ arr1.length];
        int k  = 0;
        for(int i = 0; i < arr1.length; i++)
        {
            arr[k] = arr1[i];
            k++;
        }
        for(int i = 0; i < arr2.length; i++)
        {
            arr[k] = arr2[i];
            k++;
        }
        for(int i=0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}