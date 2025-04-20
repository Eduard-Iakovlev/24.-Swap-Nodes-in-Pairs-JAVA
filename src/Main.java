import Service.OutputSolution;

import java.util.Arrays;
import java.util.List;

;
public class Main {
    public static void main(String[] args) {
        int test = 0;
        List<Integer> headData, expectedData;

        OutputSolution testSolution = new OutputSolution();

        test++;
        headData = Arrays.asList(1,2,3,4);
        expectedData = Arrays.asList(2,1,4,3);
        testSolution.setOutput(test, headData, expectedData);
        testSolution.printOutput();

        test++;
        headData = Arrays.asList();
        expectedData = Arrays.asList();
        testSolution.setOutput(test, headData, expectedData);
        testSolution.printOutput();

        test++;
        headData = Arrays.asList(1);
        expectedData = Arrays.asList(1);
        testSolution.setOutput(test, headData, expectedData);
        testSolution.printOutput();

        test++;
        headData = Arrays.asList(1,2,3);
        expectedData = Arrays.asList(2,1,3);
        testSolution.setOutput(test, headData, expectedData);
        testSolution.printOutput();
    }
}
