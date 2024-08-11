#include<iostream>

using namespace std;

int Calc(int n){
    if(n<2){
        return n;
    } else {
        return Calc(n-1) + Calc(n-2);
    }
}

int main(){
    int n;
    cin>>n;

    int result = 0;
    for(int i = 0; i<=n; i++){
        result = Calc(i);
    }

    cout<<result;
}