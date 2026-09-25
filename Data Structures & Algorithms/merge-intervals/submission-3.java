class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> combined = new ArrayList<>();
        int[] current = new int[2];
        current[0] = intervals[0][0];
        current[1] = intervals[0][1];
        combined.add(current);

        for (int[] next : intervals) {
            int currentEnd = current[1];
            int nextStart = next[0];
            int nextEnd = next[1];
            if (currentEnd >= nextStart) {
                current[1] = Math.max(currentEnd, nextEnd);
            } else {
                current = next;
                combined.add(current);
            }
        }
        return combined.toArray(new int[combined.size()][]);
    }
}
