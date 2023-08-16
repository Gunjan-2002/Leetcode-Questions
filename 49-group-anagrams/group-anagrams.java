class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }

        HashMap<String,ArrayList<String>> h = new HashMap<>();

        for(String currString : strs){
            String temp = currString;
            char st[] = currString.toCharArray();
            Arrays.sort(st);
            String str = new String(st);

            if(!h.containsKey(str)){
                h.put(str,new ArrayList<>());
            }
            h.get(str).add(temp);
        }
        return new ArrayList<>(h.values());
    }
}