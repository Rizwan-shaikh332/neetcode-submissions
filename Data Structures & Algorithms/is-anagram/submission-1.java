class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() == t.length()){
            Map<Character, Integer> mp1=new HashMap<>();
            Map<Character, Integer> mp2=new HashMap<>();
            for(char c:s.toCharArray()){
                mp1.put(c,mp1.getOrDefault(c,0)+1);
            }
            for(char c:t.toCharArray()){
                mp2.put(c,mp2.getOrDefault(c,0)+1);
            }
            if(mp1.equals(mp2)){
                return true;
            }
            return false; 
        }
        return false;
    }
}


// brute force
// if(s.length()==t.length()){
//             char a1[]= s.toCharArray();
//             char a2[]= t.toCharArray();
//             Arrays.sort(a1);
//             Arrays.sort(a2);
//             if(Arrays.equals(a1,a2)){
//                 return true;
//             }
//             return false;
//         }
//         return false;