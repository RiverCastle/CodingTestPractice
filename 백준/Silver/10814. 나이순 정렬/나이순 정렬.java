
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(br.readLine());
        Member[] members = new Member[numberN];
        for (int i = 0 ; i < numberN; i++) {
            String[] inputs = br.readLine().split(" ");
            members[i] = new Member(Integer.parseInt(inputs[0]), inputs[1], i);
        }

        // 정렬하기
        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                if (o1.age == o2.age)
                    return o1.order - o2.order;
                else
                    return o1.age - o2.age;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberN; i++) {
            sb.append(members[i].age).append(" ").append(members[i].name).append("\n");
        }
        System.out.println(sb);

    }
    static class Member {
        int age;
        String name;
        int order;

        public Member(int age, String name, int order) {
            this.age = age;
            this.name = name;
            this.order = order;
        }
    }
}
