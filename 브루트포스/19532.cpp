#include <iostream>
using namespace std;

int main(){
    int a,b,c,d,e,f;
    cin>>a>>b>>c>>d>>e>>f;
    if(a == 0){
        int y = c / b;
        int x = (f - e*y) / d;
        cout<<x<<" "<<y<<endl;
    }
    else{
    int y = (c*d - f*a) / (b*d - e*a);
    int x = (c - b*y) / a;
    cout<<x<<" "<<y<<endl;
    }
}