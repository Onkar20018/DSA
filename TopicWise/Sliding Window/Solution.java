public class Solution {
    public static void main(String[] args) {
        int[] a = { 1, 4 };
        int[] b = { 2, 5 };
        System.out.println(minNumberOfHours(5, 3, a, b));
    }

    public static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int en = 0;
        for (int i = 0; i < energy.length; i++) {
            en = energy[i] + en;
        }
        System.out.println(en + "en");
        int training = 0;
        if (initialEnergy <= en) {
            training = en - initialEnergy + 1;
        }
        System.out.println(training + "TR");
        int max = 0;
        int max_i = 0;
        for (int i = 0; i < experience.length; i++) {
            if (max < experience[i]) {
                max = experience[i];
                max_i = i;
            }
        }
        System.out.println(max + "Max");

        int exp_r = 0;
        for (int i = 0; i < max_i; i++) {
            exp_r = exp_r + experience[i];
        }
        System.out.println(exp_r + "exp");
        if (exp_r + initialExperience <= max) {
            training = training + max - exp_r - initialExperience + 1;
        }
        return training;

    }
}