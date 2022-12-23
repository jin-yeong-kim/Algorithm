package 코테22년12월.코테2022_12_23;

/*문제
임의의 tree를 구성하는 노드 중 하나의 Node 객체를 입력받아, 해당 노드를 시작으로 깊이 우선 탐색(DFS, Depth First Search)을 합니다. 이 때, 탐색되는 순서대로 노드의 값이 저장된 배열을 리턴해야 합니다.

입력
인자 1 : node
'value', 'children' 속성을 갖는 객체 (Solution.tree)
'node.value'는 String 타입
'node.children'은 Solution.tree을 요소로 갖는 ArrayList

출력
ArrayList<String> 타입을 리턴해야 합니다.

주의사항
생성자 함수(Node)와 메소드(addChild)는 변경하지 않아야 합니다.*/

import java.util.ArrayList;

public class TreeDFS {
    public static void main(String[] args) {
        TreeDFS.tree root = new TreeDFS.tree("1");
        TreeDFS.tree rootChild1 = root.addChildNode(new TreeDFS.tree("2"));
        TreeDFS.tree rootChild2 = root.addChildNode(new TreeDFS.tree("3"));
        TreeDFS.tree leaf1 = rootChild1.addChildNode(new TreeDFS.tree("4"));
        TreeDFS.tree leaf2 = rootChild1.addChildNode(new TreeDFS.tree("5"));
        ArrayList<String> output = dfs(root);
        System.out.println(output);
    }
    public static ArrayList<String> dfs(tree node) {
        // TODO:
        ArrayList<String> result = new ArrayList<>();
        result.add(node.getValue());

        if(node.getChildrenNode() != null) {
            for(int i = 0; i < node.children.size(); i++) {
                ArrayList<String> list = dfs(node.children.get(i));
                result.addAll(list);
            }
        }
        return result;
    }

    //아래 클래스의 내용은 수정하지 말아야 합니다.
    public static class tree {
        private String value;
        private ArrayList<tree> children;

        public tree(String data) {
            this.value = data;
            this.children = null;
        }

        public tree addChildNode(tree node) {
            if(children == null) children = new ArrayList<>();
            children.add(node);
            return children.get(children.size() - 1);
        }

        public String getValue() {      //현재 노드의 데이터를 반환
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }
}
