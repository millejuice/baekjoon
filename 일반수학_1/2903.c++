#include <iostream>

using namespace std;
int main(){
    int n;
    cin>>n;

    int dot=4;
    int line = 4;
    int square = 1;
    
    for(int i=0;i<n;i++){
    dot = dot + line + square;
    line = line * 2 + square*4;
    square = square*4;
    }

    cout<<dot<<endl;
}