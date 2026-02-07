public class G31RangeSum{
    public static void main(String[] args) {
        int arr[]={2,4,1,3,5};
        int n=arr.length;
        int []prefix=new int[n];
        prefix[0]=arr[0];//first element is same i.e. 1st element is 2 and rest is 0 as of now
        for(int i=1; i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];//i=1 prefix of i i.e. 1 = prefix[0]+arr[1], prefix[1] = 2+4 = 6 aise hi chlta rahega 
            // array is [2,6,7,10,15]
        }
        int l=1, r=3; // define range
        int sum; //1 se 3 ka sum nikalna hai
        if(l==0){// l never equal to 1 and it vary condition to condition
            sum=prefix[r];//prefix of 3
        }
        else{
            sum=prefix[r]-prefix[l-1]; //l is not = 0, sum 0 se 3 tk prefix[3]-prefix[1-1]; 10 - 2 = 8
        }
        System.out.println(sum);
    }
}