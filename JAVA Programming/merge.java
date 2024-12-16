public class merge {
    public static void main(String[] args) {
        int arr1[]={1,3,5,7,9};
        int arr2[]={2,4,6,8,10};
        int i=0,j=0,n=0;
        int arr[]=new int[10];
        while(i<5 && j<5)
        {
            if(arr1[i]<arr2[j])
            {
                arr[n]=arr[i];
                i++;
                n++;
            }
            else if(arr2[j]<arr1[i])
            {
                arr[n]=arr[j];
                j++;
                n++;
            }
            System.out.print(arr[n-1]);

        }

    }
}
