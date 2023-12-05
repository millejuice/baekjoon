#include <iostream>
#include <stack>

using namespace std;
int main(){
    int n,b;
    cin>>n>>b;
    int rest = 0;
    stack<char> s;
    while(n > 0){
        rest = n % b;
        if(rest >= 0 && rest <=9){
            char c = (char)(rest + '0');
            s.push(c);
    }
    else{
        char c = (char)(rest - 10 + 'A');
        s.push(c);
    }
    n = n / b;
    }
    while(!s.empty()){
        cout<<s.top();
        s.pop();
    }
}