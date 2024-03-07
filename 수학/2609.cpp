#include <iostream>
#include <algorithm>
using namespace std;


int gcd(int a, int b){
    while(b != 0){
        int temp = a%b;
        a = b;
        b = temp;
    }
    return a;
}

int lcm(int a, int b,int c){
    return a * b / c;
}

int main(){
    int a,b;
    cin>>a>>b;
    if(a<b){
        int temp = b;
        int b = a;
        int a = temp;
    }
    int result_gcd = gcd(a,b);
    cout<<result_gcd<<"\n";
    int result_lcm = lcm(a,b,result_gcd);
    cout<<result_lcm<<"\n";
}