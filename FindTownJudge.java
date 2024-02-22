import java.util.Scanner;
class FindTownJudge{
    public int findJudge(int n, int[][] trust) {
        int[] trusting = new int[n + 1];
        int[] trusted = new int[n + 1];
        for (int i = 0; i < trust.length; i++) {
            trusting[trust[i][0]]++;
            trusted[trust[i][1]]++;
        }
        int ans = -1;
        for (int i = 1; i <= n; i++) {
            if (trusting[i] == 0 && trusted[i] == n - 1)
                ans = i;
        }
        return ans;
    }
    public static void main(String[] args) {
        FindTownJudge ftj=new FindTownJudge();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the no of people in town:");
        n=sc.nextInt();
        int trust[][]=new int[n-1][2];
        System.out.println("Enter the values into array:");
        for(int i=0;i<trust.length;i++){
            for(int j=0;j<2;j++){
                trust[i][j]=sc.nextInt();
            }
        }
        int x=ftj.findJudge(n, trust);
        System.out.println("The town judge is "+x);
    }
}
