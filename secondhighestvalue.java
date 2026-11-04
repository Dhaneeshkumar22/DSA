public class secondhighestvalue
{
    
    public static void main(String[] args)
    {
        int arr[] = { 10, 20, 30, 40, 50 };
        int n = arr.length;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element");
        }
        else {
            System.out.println("The second largest element is " + second);
        }
    }
}