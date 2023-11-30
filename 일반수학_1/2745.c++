#include <iostream>

using namespace std;
int main(){
    ios_base::sync_with_stdio(false);
    string n;
    int b=0;
    int sum = 0;

    cin>>n>>b;

    for(int i=0;i<n.length();i++){
        if(n[i] >= 'A' && n[i] <= 'Z'){
            sum = (n[i] - 'A' + 10) + sum*b;
        }
        else{
            sum = (n[i] - '0') + sum* b;
        }
    }
    cout<<sum<<endl;
}