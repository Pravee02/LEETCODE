class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n = rain.length;

        String[] answer = new String[n];

        int alice = 0;
        int bob = 0;

        for (int i = 0; i < n; i++) {

            boolean aliceNeeds = (i < n - 1 && rain[i] == 1 && rain[i + 1] == 1);
            boolean bobNeeds = (rain[i] == 1);

            if (aliceNeeds && bobNeeds) {

                if (alice <= bob) {
                    answer[i] = "Alice";
                    alice++;
                } else {
                    answer[i] = "Bob";
                    bob++;
                }

            } else if (aliceNeeds) {
                answer[i] = "Alice";
                alice++;

            } else if (bobNeeds) {
                answer[i] = "Bob";
                bob++;

            } else {
                answer[i] = "None";
            }
        }

        return answer;
    }
}