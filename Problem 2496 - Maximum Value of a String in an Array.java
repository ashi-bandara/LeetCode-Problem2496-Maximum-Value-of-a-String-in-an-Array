class Solution {
    public int maximumValue(String[] strs) {
        int[] intArray = new int[strs.length];
        int maxValue = 0;

        for (int i = 0; i < strs.length; i++) {
            String temp = strs[i];

            if(temp.matches("\\d+")){
                try {
                    intArray[i] = Integer.parseInt(temp);
                } catch (NumberFormatException ignored) {
                    continue;
                }
            }
            else{
                intArray[i] = strs[i].length();
            }
            if(intArray[i]>maxValue){
                maxValue = intArray[i];
            }
        }

        return maxValue;
    }
}