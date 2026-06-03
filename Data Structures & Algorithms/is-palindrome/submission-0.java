class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        str=str.strip().toLowerCase();
        int start=0;
        int end=str.length()-1;
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
