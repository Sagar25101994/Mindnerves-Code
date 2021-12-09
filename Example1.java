package L1;

public class Example1 {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 8, 5, 12, 15, 6, 10, 7, 30, 25, 43, 46, 45, 21};
        part1(arr1);
        print(arr1);

        //int[] arr2 = {2, 4, 8, 5, 12, 15, 6, 10, 7, 30, 25, 43, 46, 45, 21};
       // part2(arr2);
       // print(arr2);
    }

    private static void print(int[] arr) {
        for(int no: arr){
        	
            System.out.print(no + " ");
        }
        System.out.println();
    }

    private static void part1(int[] arr) {
        int divisible5 = 0, notDivisible5 = 0;
        int n = arr.length;
        while(divisible5 < n && notDivisible5 < n && divisible5 <= notDivisible5){

            //Increment pointer till we find a no divisible by 5
            while(divisible5 < n && arr[divisible5] % 5 != 0){
                divisible5 += 1;
            }

            //Find next no, which is not divisible by 5. Move pointer till that number
            notDivisible5 = divisible5+1;

            while(notDivisible5 < n && arr[notDivisible5] % 5 == 0){
                notDivisible5 += 1;
            }

            //now move all the numbers one position ahead
            if(divisible5 < n && notDivisible5 < n && arr[divisible5]%5 == 0 && arr[notDivisible5]%5 != 0) {
                int temp = arr[notDivisible5];
                for(int i = notDivisible5; i >= divisible5+1; --i){
                    arr[i] = arr[i-1];
                }
                
                arr[divisible5] = temp;
            }

        }

    }

   private static void part2(int[] arr) {
        int n = arr.length;
        int divisible5 = 0, notDivisible5 = n-1;
        while(divisible5 < n && notDivisible5 >= 0 && divisible5 <= notDivisible5){
            while(divisible5 < n && arr[divisible5] %5 != 0) ++divisible5;

            while(notDivisible5 >= 0 && arr[notDivisible5]%5 == 0) --notDivisible5;

            if(divisible5 < n && notDivisible5 >= 0 && divisible5 < notDivisible5 && arr[divisible5]%5 == 0 && arr[notDivisible5]%5 != 0){
                int temp = arr[notDivisible5];
                arr[notDivisible5] = arr[divisible5];
                arr[divisible5] = temp;
            }
            ++divisible5;
            --notDivisible5;
        }

    }
}
