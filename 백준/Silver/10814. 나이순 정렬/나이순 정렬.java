import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            //나이와 이름 저장
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }


        //나이순으로 오름차순 정렬
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        //새로운 문자열에 붙이기
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < N; i++) {
            //나이랑 이름 붙이기
            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append("\n");
        }
        //결과값 출력
        System.out.println(sb);
    }
}