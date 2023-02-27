public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {4,13,341,4,1413,445,423};
        int target=4;
        int ans=linearsearc2(arr,target);
        System.out.println(ans);
    }
    static int linearsearc(int[]arr,int t){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==t){
                return i;
            }

        }
        return -1;
    }
    static int linearsearc2(int[]arr,int t){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==t){
                return t;
            }

        }
        return -1;
    }
}
