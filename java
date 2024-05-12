class Solution {
    float[] streamAvg(int[] arr, int n) {
         float[] averages = new float[n];
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            count++;
            averages[i] = (float) sum / count;
        }
        
        return averages;
    }
    }
Explanation:

We initialize an array averages to store the calculated averages.
We also initialize sum to 0 and count to 0.
We iterate through the stream of numbers.
At each step, we update sum by adding the current number to it, and update count by incrementing it.
We calculate the average by dividing sum by count, convert it to float to avoid integer division, and store it in the averages array.
Finally, we return the averages array containing the calculated averages at each point in the stream.

In Example 1, we have a stream of numbers {10, 20, 30, 40, 50}. The average at each point in the stream is calculated as follows:
10 / 1 = 10.00
(10 + 20) / 2 = 15.00
(10 + 20 + 30) / 3 = 20.00
(10 + 20 + 30 + 40) / 4 = 25.00
(10 + 20 + 30 + 40 + 50) / 5 = 30.00
