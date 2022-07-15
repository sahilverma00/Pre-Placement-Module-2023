class Solution {
     
public void moveZeroes(int []  nums){
    int len =nums.length;
    int count=0;
    
    for (int i=0;i<len;i++){
        if(nums[i]!=0){
            nums[count++]=nums[i];
        }
    }
while(count<len){
    nums[count++]=0;
}
}
}