#include <stdio.h>
#include <vector>
#include <iostream>
#include <string>
#include <set>
//#include <boost/assign/list_of.hpp>

using std::vector;
using namespace std;
//using namespace boost::assggn;




  class Solution {
  public:
      bool containsNearbyAlmostDuplicate(vector<int>& nums, int k, int t) {
          multiset<int> bst;
          for (int i = 0; i < nums.size(); i++) {
              if (bst.size() == k + 1) bst.erase(bst.find(nums[i - k - 1]));
              cout<<"num[i-k-1]"<<nums[i-k-1]<<endl;
              auto lb = bst.lower_bound(nums[i] - t);

             // cout<<"lower: "<<*bst.lower_bound(nums[i]-t)<<endl;
              
              cout<<"nums[i]: "<<nums[i]<<" t: "<<t<<" *lb: "<<*lb<<endl;
              

              //cout<<"*lb-nums[i]: "<<(*lb - nums[i])<<endl;
              //cout<<"t: "<<t<<endl;
              
              //cout<<"result: "<<((*lb - nums[i] )<= t)<<endl;
              //cout<<"first res: "<<(lb!=bst.end())<<endl;
              //cout<<"bst.end(): "<<*bst.end()<<endl;
              for (std::multiset<int>::const_iterator i(bst.begin()), end(bst.end());i != end;++i)
                std::cout << *i << " ";
               cout<<": bst "<<endl;
               cout<<endl;
              if (lb != bst.end() && ((*lb - nums[i] ) <= t)) return true;
              
              bst.insert(nums[i]);
         }
         return false;
     }
 };


int main()
{
  static const int arr[] = {1,5,3};

  vector<int> test(arr,arr+sizeof(arr)/sizeof(arr[0]));

  Solution m;
  cout<<m.containsNearbyAlmostDuplicate(test,1,2)<<endl;
} ; 