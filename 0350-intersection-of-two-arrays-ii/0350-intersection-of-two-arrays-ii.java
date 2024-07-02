class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1= nums1.length;
        int n2= nums2.length;
        int lar =Math.max(n1,n2);
        List<Integer> outlist = new ArrayList<>();
    
        
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    outlist.add(nums1[i]);
                    nums2[j]=-1;
                    break;
                    
                }
            }
        }
        
        return outlist.stream().mapToInt(Integer::intValue).toArray();
        
    }
}