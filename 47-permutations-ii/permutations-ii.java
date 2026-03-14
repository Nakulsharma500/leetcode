// class Solution {
//     public List<List<Integer>> permuteUnique(int[] nums) {
        
//      List<List<Integer>> ans=new ArrayList<>();
//       List<Integer> a= new ArrayList<>();
//       boolean[] check =new boolean[nums.length];

//         permutation(nums, check, a, ans);
//         return ans;   
//     }


//     private void permutation(int[] nums, boolean[] check , List<Integer> a, List<List<Integer>> ans){

//      int n=nums.length;
//      if(a.size()== n){
//      List<Integer> copy= new ArrayList<>();
//       ans.add(new ArrayList<>(a));
//       return;

//      }
//      for(int i=0; i<n; i++){
                     
//           if(check[i]) continue;

//           if(i>0 && nums[i]==nums[i-1] && !check[i-1])
//           continue;

//            check[i] = true;
//             a.add(nums[i]);

//             permutation(nums, check, a, ans);

//             a.remove(a.size()-1);
//             check[i]=false;

     

//     }

// }

// }




import java.util.*;

class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {

            Arrays.sort(nums);   // important

                    List<List<Integer>> ans = new ArrayList<>();
                            boolean[] check = new boolean[nums.length];

                                    permutation(nums, check, new ArrayList<>(), ans);

                                            return ans;
                                                }

                                                    private void permutation(int[] nums, boolean[] check,
                                                                                 List<Integer> a, List<List<Integer>> ans) {

                                                                                         if(a.size() == nums.length){
                                                                                                     ans.add(new ArrayList<>(a));
                                                                                                                 return;
                                                                                                                         }

                                                                                                                                 for(int i=0;i<nums.length;i++){

                                                                                                                                             if(check[i]) continue;

                                                                                                                                                         if(i>0 && nums[i]==nums[i-1] && !check[i-1])
                                                                                                                                                                         continue;

                                                                                                                                                                                     check[i] = true;
                                                                                                                                                                                                 a.add(nums[i]);

                                                                                                                                                                                                             permutation(nums, check, a, ans);

                                                                                                                                                                                                                         a.remove(a.size()-1);
                                                                                                                                                                                                                                     check[i] = false;
                                                                                                                                                                                                                                             }
                                                                                                                                                                                                                                                 }
                                                                                                                                                                                                                                                 }
