#include <iostream>
#include <stack>
using namespace std;

int main(){
    int n;
    cin>>n;
    stack <int> s;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    for(int i=0;i<n;i++){
        if(s.top() == arr[i]){
            cout<<"-"<<endl;
            s.pop();
            i--;
        } else{
            while((s.top() != arr[i]) ){
                cout<<"+"<<endl;
                s.push(i+1);
            }
        }
    }
}