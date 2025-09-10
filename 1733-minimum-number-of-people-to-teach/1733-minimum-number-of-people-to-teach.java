class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        // Step 1: Store languages for each user in a set
        Map<Integer, Set<Integer>> userLang = new HashMap<>();
        for (int i = 0; i < languages.length; i++) {
            userLang.put(i + 1, new HashSet<>());
            for (int lang : languages[i]) {
                userLang.get(i + 1).add(lang);
            }
        }

        // Step 2: Identify problematic friendships
        Set<Integer> usersToTeach = new HashSet<>();
        for (int[] f : friendships) {
            int u = f[0], v = f[1];
            Set<Integer> langsU = userLang.get(u);
            Set<Integer> langsV = userLang.get(v);

            // If no common language, mark both users
            boolean common = false;
            for (int lang : langsU) {
                if (langsV.contains(lang)) {
                    common = true;
                    break;
                }
            }
            if (!common) {
                usersToTeach.add(u);
                usersToTeach.add(v);
            }
        }

        // Step 3: Count how many users in usersToTeach know each language
        int[] langCount = new int[n + 1]; // 1-indexed
        for (int u : usersToTeach) {
            for (int lang : userLang.get(u)) {
                langCount[lang]++;
            }
        }

        // Step 4: Find the language with max users already knowing it
        int maxKnown = 0;
        for (int i = 1; i <= n; i++) {
            maxKnown = Math.max(maxKnown, langCount[i]);
        }

        // Step 5: Answer = total users needing teaching - maxKnown
        return usersToTeach.size() - maxKnown;

    }
}