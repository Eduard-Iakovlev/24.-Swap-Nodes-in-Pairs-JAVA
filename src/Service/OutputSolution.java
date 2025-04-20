package Service;

import model.ListNode;
import solution.Solution;

import java.util.List;

public class OutputSolution {
    private int test;
    private List<Integer> headData, expectedData;

    private void setTest(int test){
        this.test = test;
    }

    public void setHeadData(List<Integer> headData){
        this.headData = headData;
    }

    public void setExpectedData(List<Integer> expectedData){
        this.expectedData = expectedData;
    }

    public void setOutput(int test, List<Integer> headData, List<Integer> expectedData){
        setTest(test);
        setHeadData(headData);
        setExpectedData(expectedData);
    }

    public void printOutput(){
        Solution solution = new Solution();
        ListNode head = new ListNode();
        ListNode expected = new ListNode();
        head.creatwList(headData);
        expected.creatwList(expectedData);
        System.out.println("============ Тест №" + test + " ============");
        System.out.print("Входной список: ");
        if(headData.isEmpty()) System.out.println("[]");
        else head.printList();
        System.out.println("Ожидаемый результат: ");
        if(expectedData.isEmpty()) System.out.println("[]");
        else expected.printList();
        System.out.println("Полученный результат: ");
        head = solution.swapPairs(head);
        if(headData.isEmpty()) System.out.println("[]");
        else head.printList();
        System.out.println("============ Проверка ============");
        Check check = new Check();
        if(check.checkLists(head, expected)) System.out.println("Тест пройден");
        else System.out.println("Тест не пройден");
        System.out.println("==================================\n");

    }
}
