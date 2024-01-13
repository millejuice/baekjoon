#include <iostream>
using namespace std;

int main(){
    int denominator = 1;
    int numerator = 1;
    int n;
    cin>>n;

    int cross = 1;
    while(cross<n){
        n-=cross;
        cross++;
    }
    if(cross % 2 == 0){
        denominator = cross;
        while(n>1){
            numerator++;
            denominator--;
            n--;
        }
        cout<<numerator<<"/"<<denominator;
    } else if(cross % 2 != 0){
        numerator = cross;
        while (n>1)
        {
            denominator++;
            numerator--;
            n--;
        }
        cout<<numerator<<"/"<<denominator; 
    }
}