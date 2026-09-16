class Solution {
    class Node {
        Node[] child = new Node[2];
    }

    public int findMaximumXOR(int[] nums) {
        Node root = new Node();

        for (int num : nums) {
            Node current = root;

            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;

                if (current.child[bit] == null) {
                    current.child[bit] = new Node();
                }

                current = current.child[bit];
            }
        }

        int answer = 0;

        for (int num : nums) {
            Node current = root;
            int xor = 0;

            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                int opposite = 1 - bit;

                if (current.child[opposite] != null) {
                    xor = xor | (1 << i);
                    current = current.child[opposite];
                } else {
                    current = current.child[bit];
                }
            }

            answer = Math.max(answer, xor);
        }

        return answer;
    }
}