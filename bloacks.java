import java.util.*;
class hack1{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        PriorityQueue<Integer> a=new  PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> b=new  PriorityQueue<>();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int as=s.nextInt();
            a.add(as);
        }
        for(int i=0;i<n;i++){
            int as=s.nextInt();
            b.add(as);
        }
        long ans=0L;
        int MOD=1000000007;
        for(int i=0;i<n;i++){
            int o=a.poll();
            while(o-->0){
                ans=((ans*2)+1)%MOD;
            }
            int p=b.poll();
            while(p-->0){
                ans=((ans*2)+0)%MOD;
            }
        }
        System.out.println(ans);

        
    }
}
