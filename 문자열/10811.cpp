#include <iostream>
using namespace std;

int main(){
    int n,m;
    int order[2];
    cin>>n>>m;
    int arr[n];
    for(int i=1;i<=n;i++){
        arr[i-1]=i;
    }
    for(int i=0;i<m;i++){
        cin>>order[0]>>order[1];
        int a = order[0] - 1;
        int b = order[1] - 1;
        for(int j = a; j < b; j++){
            int temp =arr[j];
            arr[j]=arr[b-a-1];
            arr[b-a-1]=temp;
        }
        for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<"====================\n";
    }
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}