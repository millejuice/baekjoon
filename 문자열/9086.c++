#include <iostream>
#include <string>
using namespace std;

int main(){
    int t;
    cin>>t;
    string str[t];
    int length[t];
    for(int i=0;i<t;i++){
        cin>>str[i];
        length[i] = str[i].length();
    }
    for(int i=0;i<t;i++){
        cout<<str[i][0]<<str[i][length[i]-1]<<endl;
    }
}