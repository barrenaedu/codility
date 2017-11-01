package codility.lessons;

public class GenomicRangeQuery {

    /*
A, C, G, T
1, 2, 3, 4

Example 1
---------
CAGTC

P[0]=0  Q[0]=0  s[]=C            > 2    i=0     0,0
P[1]=0  Q[1]=1  s[]=CA           > 1    i=1     1,1
P[2]=0  Q[2]=2  s[]=CAG          > 1    i=2     2,2
P[3]=0  Q[3]=3  s[]=CAGT         > 1    i=3     3,3
P[4]=0  Q[4]=4  s[]=CAGTC        > 1    i=4     4,4

P[0]=1  Q[0]=1  s[]=A            > 1    i=1     0,0
P[1]=1  Q[1]=2  s[]=AG           > 1    i=2     1,1
P[2]=1  Q[2]=3  s[]=AGT          > 1    i=3     2,2
P[3]=1  Q[3]=4  s[]=AGTC         > 1    i=4     3,3

P[0]=2  Q[0]=2  s[]=G            > 3    i=2     0,0
P[1]=2  Q[1]=3  s[]=GT           > 3    i=3     1,1
P[2]=2  Q[2]=4  s[]=GTC          > 2    i=4     2,2

P[0]=3  Q[0]=3  s[]=T            > 4    i=3     0,0
P[1]=3  Q[1]=4  s[]=TC           > 2    i=4     1,1

P[0]=4  Q[0]=4  s[]=C            > 2    i=4     0,0

A: {0, 0, 1, 1, 1, 1}
B: {0, 1, 1, 1, 1, 2}
C: {0, 0, 0, 1, 1, 1}
T: {0, 0, 0, 0, 1, 1}

Example 2
---------
CAGCCTA

P[0]=2  Q[0]=4  s[]=GCC          > 2
P[1]=5  Q[1]=5  s[]=T            > 4
P[2]=0  Q[2]=6  s[]=CAGCCTA      > 1
*/

    public int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        int A[] = new int[S.length()+1];
        int C[] = new int[S.length()+1];
        int G[] = new int[S.length()+1];
        for (int i = 0; i < S.length(); i++) {
            A[i+1] = A[i] + (S.charAt(i) == 'A' ? 1 : 0);
            C[i+1] = C[i] + (S.charAt(i) == 'C' ? 1 : 0);
            G[i+1] = G[i] + (S.charAt(i) == 'G' ? 1 : 0);
        }
        for (int i = 0; i < P.length; i++) {
            int a = A[Q[i] + 1] - A[P[i]];
            int c = C[Q[i] + 1] - C[P[i]];
            int g = G[Q[i] + 1] - G[P[i]];
            result[i] = a>0 ? 1 : c>0 ? 2 : g>0 ? 3 : 4;
        }
        return result;
    }

}
