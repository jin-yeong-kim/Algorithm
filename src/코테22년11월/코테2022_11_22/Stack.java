package 코테22년11월.코테2022_11_22;

import java.util.ArrayList;


public class Stack {
    public static void main(String[] args) {
        String[] actions = new String[]{"B", "C", "-1", "D", "A", "-1", "1", "-1", "-1"};
        String start = "A";
        ArrayList<java.util.Stack> output = browserStack(actions, start);
    }
    public static ArrayList<java.util.Stack> browserStack(String[] actions, String start) {
        java.util.Stack<String> prevStack = new java.util.Stack<>();
        java.util.Stack<String> nextStack = new java.util.Stack<>();
        java.util.Stack<String> current = new java.util.Stack<>();
        ArrayList<java.util.Stack> result = new ArrayList<>();

        // TODO:
        // start의 리터럴을 current의 넣는다.
        // actions의 인덱스를 순회하면서 페이지, 뒤로가기, 앞으로가기를 확인하고 행동에 맞게 prevStack과 nextStack으로 알맞게 넣는다.
        // 모든 인덱스를 돌면 result에 값을 prev스택 -> current스택 -> next스택 순으로 값을 넣는다.
        current.push(start);
        for(String action : actions) {
            if(action == "-1" && !prevStack.empty()) { nextStack.push(current.pop()); current.push(prevStack.pop());}
            else if (action == "1" && !nextStack.empty()) { prevStack.push(current.pop()); current.push(nextStack.pop());}
            else if(action != "1" && action != "-1"){prevStack.push(current.pop()); current.push(action); nextStack.clear();}
        }
        result.add(prevStack);
        result.add(current);
        result.add(nextStack);
        return result;
    }
}
