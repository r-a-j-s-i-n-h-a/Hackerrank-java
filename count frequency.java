public class CountFrequency {
    public static void main(String[] args) {
        int arr[] = {1,3,5,2,9,2,3,9,12,9,4,5,3,22,3};
        int newarr[] = new int [arr.length];
        int visit=-1;
        for (int i = 0; i <arr.length ; i++) {
            int count =1;
            for(int j =i+1 ; j<arr.length ; j++){
                if(arr[i]==arr[j]){
                    count = count +1;
                    newarr[j]=visit;
                }
            }
            if(newarr[i]!=visit) {
                newarr[i]=count;
            }
        }
        for(int j =0 ; j<arr.length ; j++){
            if(newarr[j]!=visit){
                System.out.println("The frequency of "+arr[j]+" is "+newarr[j]);
            }
        }
    }

}
