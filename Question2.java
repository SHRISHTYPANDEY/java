public class Question2 {
    public static void main(String[] args) {
        int [] a = {0,1,0,2,2,1,1,0};
        int zerocount =0;
        int onecount =0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
               zerocount++;
            }else{
                onecount++;
            }
        }
            for(int i=0;i<a.length;i++){
               if(i<zerocount){
                a[i]=0;
               } else if(i<=onecount){
                a[i]=1;
               } else{
                a[i]=2;
               }
            }
            
            for(int i:a){
                System.out.print(i+" ");
            }
        }
    }
