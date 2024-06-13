public class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int max = 0;
        for (int seat : seats) {
            if (max < seat) {
                max = seat;
            }
        }

        for (int student : students) {
            if (max < student) {
                max = student;
            }
        }

        int[] diff = new int[max + 1];
        for (int seat : seats) {
            diff[seat]++;
        }

        for (int student : students) {
            diff[student]--;
        }

        int result = 0;
        int unmatch = 0;
        for (int d : diff) {
            result += Math.abs(unmatch);
            unmatch += d;
        }

        return result;
    }
}
