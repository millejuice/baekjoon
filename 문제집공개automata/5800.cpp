#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int biggest_gap(int a,int b){
    int gap = b - a;
    return gap;
}

int main(){
    int n;
    int gap = -1;
    cin>>n;
    int arr[n][3];
    for(int j = 1; j<=n;j++){
        int k;
        cin>>k;
        vector<int> v;
        for(int i = 0; i<k;i++){
            int temp;
            cin>>temp;
            v.push_back(temp);
        }
        sort(v.begin(),v.end());
        for(int r = 0; r<k-1;r++){
            int temp_gap = biggest_gap(v[r],v[r+1]);
            if(temp_gap>gap){
                gap = temp_gap;
            }
        }
        arr[j-1][0] = v[k-1];
        arr[j-1][1] = v[0];
        arr[j-1][2] = gap;
        gap = -1;
    }
    for(int j = 0; j<n;j++){
        cout<<"Class "<<j + 1<<"\n";
        cout<<"Max "<<arr[j][0]<<","<<" Min "<<arr[j][1]<<", "<<"Largest gap "<<arr[j][2]<<"\n";
    }
}