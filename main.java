import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for(int t = 0;t<tc;t++) {
            Queue<int[]> q = new LinkedList<>();
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[10];

            for(int i = 0;i<n;i++) {
                int e = sc.nextInt();
                arr[e]++;
                q.offer(new int[] {i,e});
            }

            int cnt = 0;
            int idx = 9;
            while(!q.isEmpty()) {

                while(true) {
                    if(arr[idx] != 0 || idx == 1)
                        break;
                    idx--;
                }
                int[] out = q.poll();
                //중요도가 맞으면
                if(out[1] == idx) {
                    cnt++;
                    if(out[0] == m) {
                        break;
                    }
                    arr[idx]--;
                }
                else {
                    q.offer(out);
                }
            }

            System.out.println(cnt);
            System.out.println(idx);
        }

    }



}