#include <iostream>
using namespace std;

int main(){
    int n,k;
    cin>>n>>k;
    int count = 0;
    int result;

    for(int i = 1;i <= n; i++){
        if(n % i == 0){
            count ++;
        }
        if(count == k){
            result = i;
            break;
        }
    }
    if(count != k){
        cout<<0;
    } else {
        cout<<result;
    }
}