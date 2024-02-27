#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    string s;
    cin>>s;
    vector<string> v(s.size());
    for(int i=0;i<s.size();i++){
        v[i]=s.substr(i,s.size());
    }
    sort(v.begin(),v.end());
    for(int i=0;i<s.size();i++){
        cout<<v[i]<<endl;
    }
}