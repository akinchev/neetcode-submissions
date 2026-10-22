class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int res = 0;
        Arrays.sort(people);
        int L = 0;
        int R = people.length - 1;
        while (L <= R) {
            int remain = limit - people[R];
            R--;
            if (remain >= people[L]) {
                L++;
            }
            res++;
        }


        return res;
    }
}