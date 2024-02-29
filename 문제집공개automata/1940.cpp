#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int n,m;
    cin>>n>>m;
    int arr[n];
    int count = 0;
    for(int i=0; i<n; i++){
        int temp = 0;
        cin>>temp;
        arr[i]=temp;
    }
    sort(arr,arr + n);

    int start = 0;
    for(int j=start;j<n;j++){
        for(int i = n-1;i>j;i--){
            if(arr[j]+arr[i] == m){
                count++;
                start++;
            } else if(arr[j] + arr[i] != m){
                continue;
            }
        }
    }
    cout<<count<<"\n";
}