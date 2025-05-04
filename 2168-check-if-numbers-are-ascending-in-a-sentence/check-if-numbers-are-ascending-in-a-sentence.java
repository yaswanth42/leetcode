class Solution {
    public boolean areNumbersAscending(String s) {
        String[] tokens=s.split(" ");
        int prev=-1;
        for (String token : tokens) {
            if (Character.isDigit(token.charAt(0))) {
                int current=Integer.parseInt(token);
                if (current<=prev) {
                    return false;
                }
                prev=current;
            }
        }
        return true;
    }
}
