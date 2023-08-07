class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = solution2(n, m);
        answer[1] = n * m / solution2(n, m);

        return answer;
    }

    public int solution2(int n, int m) {
        while (m != 0) {
            int a = n % m;
            n = m;
            m = a;
        }
        return n;
    }
}