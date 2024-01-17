#include <iostream>
#include <stack>
#include <queue>
using namespace std;

int main(){
    int n;
    cin>>n;
    stack<int> s;
    queue<char> result;
    int arr[n];
    int j=1;

    for(int i = 0;i<n;i++){
        cin>>arr[i];
    }
    for(int i = 0;i < n; i++){
        if(s.empty()){
            while(j<=arr[i]){
            s.push(j);
            j++;
            result.push('+');
            }
            s.pop();
            result.push('-');
        } else{
        if(arr[i]<s.top()){
            if(j>arr[i]){
                while(result.empty() == false){
                    result.pop();
                }
                result.push(-1);
                break;
            }
            while(arr[i]<=s.top()){
                s.pop();
                result.push('-');
            }
        } else if(arr[i] == s.top()){
            s.pop();
            result.push('-');
        } else if(arr[i]>s.top()){
            if(j>arr[i]){
                while(result.empty() == false){
                    result.pop();
                }
                result.push(-1);
                break;
            }
            while(j<=arr[i]){
                s.push(j);
                j++;
                result.push('+');
            }
            s.pop();
            result.push('-');
             }
        }
    }

    while(!result.empty()){
        if(result.front() == -1){
            cout<<"NO";
            break;
        }
        cout<<result.front()<<"\n";
        result.pop();
        cout<<endl;
    }
}