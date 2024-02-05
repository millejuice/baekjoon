#include <iostream>
#include <stack>
using namespace std;

int main(){
    int n;
    cin>>n;
    int temp;
    int sum = 0;
    stack<int> s;
    for(int i = 0; i<n;i++){
        cin>>temp;
        if(temp == 0){
            s.pop();
        } else{
            s.push(temp);
        }
    }
    while(!s.empty()){
        sum += s.top();
        s.pop();
    }
    cout<<sum<<"\n";
}