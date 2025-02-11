package DSA_practice.Basics.Functions;

public class PandC {
    public static void main(String[] args){
        System.out.println("Function of permutation and combination");
        int p=Perm(5,3);
        int c=Comb(5,3);
        System.out.println("Permutation"+p);
        System.out.println("Combination"+c);
    }

    public static int Perm(int n,int r){
        int p=1;
        for (int i=n;i>n-r;i--){
            p=p*i;
        }
        return p;
    }

    public static int Comb(int n,int r){
        int c=1;
        int rfact=1;
        for (int i=r;i>1;i--){
            rfact=rfact*i;
        }
        c=Perm(n,r)/rfact;
        return c;
    }

}
