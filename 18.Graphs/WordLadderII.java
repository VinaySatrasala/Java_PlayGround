import java.util.*;

public class WordLadderII {

    public List<List<String>> findLadders(String start, String end, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        List<List<String>> res = new ArrayList<>();

        if (!dict.contains(end)) return res;

        Deque<List<String>> queue = new ArrayDeque<>();
        queue.add(Arrays.asList(start));

        Set<String> visited = new HashSet<>();
        boolean found = false;

        while (!queue.isEmpty() && !found) {
            int size = queue.size();
            Set<String> localVisited = new HashSet<>();

            for (int i = 0; i < size; i++) {
                List<String> path = queue.poll();
                String lastWord = path.get(path.size() - 1);

                for (int j = 0; j < lastWord.length(); j++) {
                    char[] wordArr = lastWord.toCharArray();

                    for (char c = 'a'; c <= 'z'; c++) {
                        wordArr[j] = c;
                        String nextWord = new String(wordArr);

                        if (dict.contains(nextWord) && !path.contains(nextWord)) {
                            List<String> newPath = new ArrayList<>(path);
                            newPath.add(nextWord);

                            if (nextWord.equals(end)) {
                                res.add(newPath);
                                found = true;
                            } else {
                                queue.add(newPath);
                            }

                            localVisited.add(nextWord);
                        }
                    }
                }
            }

            dict.removeAll(localVisited); // prune only after current level
        }

        return res;
    }

    public static void main(String[] args) {
        WordLadderII wl = new WordLadderII();
        String start = "hit";
        String end = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        List<List<String>> result = wl.findLadders(start, end, wordList);
        System.out.println(result);
    }
}
