#include <iostream>
#include <vector>
using namespace std;

int main(){
    int n = 0,k = 0;
    int a = 0;
    int count = 0;
    cin>>n>>k;
    cin.ignore();
    vector<int> v;

    for(int i = 0; i<n;i++){
        int temp = 0;
        cin>>temp;
        v.push_back(temp);
    }
    while(v[a]<=k && a<n){ //a가 n보다 커질 때 처리 안해주면 OutOfBoundsError 나옴
        a++;
    }
    for(int i = a-1;i>=0;i--){
        while(k>0 && k>=v[i]){
            k-=v[i];
            count++;
        }
    }
    cout<<count;
}