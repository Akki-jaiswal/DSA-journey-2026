package Arrays.Medium;

public class MajorityElement {
    public static void main(String[] args) {
        int count = 0;
        int ele = 0;
        int[] arr = {2,2,1,1,1,2,2};

        int n = arr.length;
        // First Step
        for(int i=0; i<n; i++){
            if(count==0){
                count=1;
                ele = arr[i];
            }
            else if(ele == arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        // Second Step
        int count1 = 0;
        for(int i=0; i<n; i++){
            if(arr[i]==ele){
                count1++;
            }
        }
        //Return element
        if(count1>(n/2)){
            System.out.println(ele);
        }
        else{
            System.out.println("-1");
        }

    }
}
