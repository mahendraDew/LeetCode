class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        List<String> list = new ArrayList<>();
       
        for(int i = 0; i<=s.length()-10; i++){
            String seq = s.substring(i, i+10);
            if(!seen.add(seq)){
                if(!list.contains(seq)){
                    list.add(seq);
                }
            }
        }

        return list;
    }
}