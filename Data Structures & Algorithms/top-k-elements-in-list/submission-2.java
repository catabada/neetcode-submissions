class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list =  new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            list.add(new AbstractMap.SimpleEntry<>(entry.getValue(), entry.getKey()));
        }
        list.sort(Map.Entry.comparingByKey());
        return list.size() > k ? list.stream().skip(list.size() - k).mapToInt(Map.Entry::getValue).toArray():
                list.stream().mapToInt(Map.Entry::getValue).toArray();
    }
}
