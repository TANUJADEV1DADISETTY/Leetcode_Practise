class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // ArrayList<Integer> ans = new ArrayList<>();
        // for(int i = 0; i < capacity.length; i++) {
        //     if(capacity[i] >= itemSize) {
        //         map.put(capacity[i], i);
        //         ans.add(capacity[i]);
        //     }
        // }
        // Collections.sort(ans);
        // if(ans.size() == 0) {
        //     return -1;
        // }
        // int item = ans.get(0);
        // for(int i = 0; i < map.size(); i++) {
        //     if(map.containsKey(item)) {
        //         return map.get(item);
        //     }
        // }
        // return -1;


        int index = -1;
        int ele = Integer.MAX_VALUE;;
        for(int i = 0; i < capacity.length; i++) {
            if(capacity[i] >= itemSize) {
                if(capacity[i] < ele) {
                    index = i;
                    ele = capacity[i];
                }
            }
        }
        return index;
    }
}