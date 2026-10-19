class Solution {
    public int badSensor(int[] sensor1, int[] sensor2) {
        int i = 0;
        while (i < sensor1.length && sensor1[i] == sensor2[i]) {
            i++;
        }
        if (i >= sensor1.length) {
            return -1;
        }
        boolean canBe1 = true;
        boolean canBe2 = true;

        for (int k = i; k < sensor1.length - 1; k++) {
            if (sensor1[k] != sensor2[k + 1]) {
                canBe1 = false;
            } else if (sensor2[k] != sensor1[k + 1]) {
                canBe2 = false;
            }
        }

        if (canBe1 == canBe2) {
            return -1;
        }

        return canBe1 ? 1 : 2;
    }
}
