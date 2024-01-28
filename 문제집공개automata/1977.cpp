#include <iostream>
#include <cmath>
using namespace std;

int main(){
    int min,max;
    cin>>min>>max;
    int minpow = 10000,sum = 0;
    for(int i = min;i<=max;i++){
        float tempminpow = pow(i,0.5);
        int floorminpow = floor(tempminpow);
        if(tempminpow == floorminpow){
            sum += floorminpow*floorminpow;
            if(minpow>floorminpow*floorminpow){
                minpow = floorminpow*floorminpow;
            }
        }
    }
    if(sum == 0){
        cout<<-1<<endl;
    } else {
        cout<<sum<<endl;
        cout<<minpow<<endl;
    }
}