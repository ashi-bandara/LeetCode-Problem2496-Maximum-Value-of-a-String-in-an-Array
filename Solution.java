class Solution {
    public int maximumValue(String[] strs) {
        int[] intArray = new int[strs.length];
        int maxValue = 0;

        for (int i = 0; i < strs.length; i++) {
            String temp = strs[i];

            if(temp.matches("^(?=.*[A-Z])(?=.*[0-9])[A-Z0-9]+$")){
                intArray[i] = strs[i].length();
            }
            else{
                try {
                    intArray[i] = Integer.valueOf(temp);
                } catch (NumberFormatException ignored) {

                }
                intArray[i] = Integer.valueOf(strs[i]);
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i]>maxValue){
                maxValue = intArray[i];
            }
        }

        return maxValue;
    }
}