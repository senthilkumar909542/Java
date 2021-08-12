package Git.Sorting_And_Searching;


public class zoho_sort {

    public static void main(String[] args){
            int [] arr1 = {1,2,3,6,7 };
            int [] arr2 = { 2,3,4,6 };
            int m = arr1.length;
            int n = arr2.length;

            int i = 0, j = 0;
            while (i < m && j < n) {
                if (arr1[i] < arr2[j])
                    System.out.print(arr1[i++] + " ");
                else if (arr2[j] < arr1[i])
                    System.out.print(arr2[j++] + " ");
                else {
                    System.out.print(arr2[j++] + " ");
                    i++;
                }
            }

        
            while (i < m)
                System.out.print(arr1[i++] + " ");
            while (j < n)
                System.out.print(arr2[j++] + " ");


        }


    }