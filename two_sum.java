class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Declare variables
        int indexOne = 0;
        int indexTwo = 1;
        int [] targetIndices = new int[2];

        // Nested loop - comparing one element to the next to add to see if it equals target 
        for(int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                // If the target is reached get the index and add 1 to it then break
                if (numbers[i] + numbers[j] == target) {
                    indexOne = i + 1;
                    indexTwo = j + 1;
                    break;
                }
            }
        }

        // Set the target indices 
        targetIndices[0] = indexOne;
        targetIndices[1] = indexTwo;

        // Return the indices
        return targetIndices;
    }
}