public class InspectionRoutine {

    /**
     * Compute the number of times an artifact is inspected given a command sequence
     *
     * @param numArtifacts the number of artifacts in the museum, {@code numArtifacts > 0}
     * @param commands the commands for one iteration of inspections, {@code commands.length > 0}
     * @param repetitions the number of times the commands are to be repeated, {@code repetitions > 0}
     * @return the number of times each artifact is inspected
     *         (the entry at index i represents the number of times artifact i is inspected)
     */
    public static int[] inspectionCount(int numArtifacts, int[] commands, int repetitions) {
        int[] numInspections = new int[numArtifacts];
        numInspections[0] = 1;

        int position = 0;
        for (int repeat = 0; repeat < repetitions; repeat++) {
            for (int step = 0; step < commands.length; step++) {

                if (commands[step] > 0) {

                    for (int movement = 0; movement < commands[step]; movement++) {
                        if (position == (numArtifacts - 1)) {
                            position = 0;
                        }
                        else {
                            ++position;
                        }

                        ++numInspections[position];
                    }
                }
                else if (commands[step] < 0) {

                    for (int movement = 0; movement > commands[step]; movement--) {
                        if (position == 0) {
                            position = numArtifacts - 1;
                        }
                        else {
                            --position;
                        }

                        ++numInspections[position];
                    }
                }
            }
        }
        return numInspections;
    }
}
