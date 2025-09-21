class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        
        backtrack(candidates, target, result, new ArrayList<>(), 0);
        return result;
    }

    private void backtrack(int[] candidates, int target, List<List<Integer>> result,
                            List<Integer> combinations, int start) {
        if(target == 0) {
            result.add(new ArrayList(combinations));
            return;
        }

        if(target < 0) {
            return;
        }

        for(int i = start; i < candidates.length; i++) {
            combinations.add(candidates[i]);
            backtrack(candidates, target - candidates[i], result, combinations, i);
            combinations.remove(combinations.size() - 1);
        }

    }
}