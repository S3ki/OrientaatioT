package Orientaatio3;

public class AgeDistributionGenerator {
    // Alkuasetelman ikäjakauma (esimerkiksi)
    private static final int[][] initialAgeDistribution = {
            {16, 20}, {34, 21}, {52, 22}, {68, 23}, {82, 24},
            {89, 25}, {94, 26}, {96, 28}, {98, 30}, {100, 35}
    };

    // Metodi generoida ikäjakauma
    public static int[] generateAgeDistribution(int totalSamples) {
        int[] ageDistribution = new int[initialAgeDistribution[initialAgeDistribution.length - 1][1] + 1];
        int sampleCount = 0;

        while (sampleCount < totalSamples) {
            int randomIndex = (int) (Math.random() * 100) + 1; // satunnaisluku välillä 1-100

            for (int[] range : initialAgeDistribution) {
                if (randomIndex <= range[0]) {
                    ageDistribution[range[1]]++;
                    sampleCount++;
                    break;
                }
            }
        }

        return ageDistribution;
    }

    public static void main(String[] args) {
        int totalSamples = 1000;


        int[] ageDistribution = generateAgeDistribution(totalSamples);


        System.out.println("Ikäjakauma:");
        for (int i = 0; i < ageDistribution.length; i++) {
            System.out.println("Ikä " + i + ": " + ageDistribution[i]);
        }
    }
}
