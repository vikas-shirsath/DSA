//2491. Divide Players Into Teams of Equal Skill


class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        if(n%2 != 0) {
            return -1;
        }

        Arrays.sort(skill);
        
        long sum = (long) skill[0] + skill[n-1];
        long productSum = 0;

        for(int i=0; i<n/2; i++) {
            if(skill[i] + skill[n-1-i] != sum) {
                return -1;
            }

            productSum += (long) skill[i] * skill[n-1-i];
        }

        return productSum;
    }
}