class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        String[] sorts = new String[strs.length];
        for (int i = 0; i < sorts.length; i++) {
            String sorted = Stream.of(strs[i].split(""))
                    .sorted()
                    .collect(Collectors.joining());
            if (map.containsKey(sorted)) {
                map.get(sorted).add(strs[i]);
            } else {
                map.put(sorted, new ArrayList<>(List.of(strs[i])));
            }
        }

        return map.values().stream().toList();
    }
}
