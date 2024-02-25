#include <iostream>
#include <queue>
#include <vector>
#include <string>
#include <sstream>
using namespace std;

int main(){
    int n;
    cin>>n;
    cin.ignore();
    queue<string> q;
    while(n>0){
        string command;
        getline(cin,command);
        stringstream ss(command);
        string temps;
        ss>>temps;
        if(temps.compare("push")==0){
            string temp;
            ss>>temp;
            q.push(temp);
        } else if(temps.compare("pop")==0){
            if(q.empty()){
                cout<<-1<<"\n";
            } else{
                cout<<q.front()<<"\n";
                q.pop();
            }
        } else if(temps.compare("size")==0){
            cout<<q.size()<<"\n";
        } else if(temps.compare("empty")==0){
            if(q.empty()){
                cout<<1<<"\n";
            } else{
                cout<<0<<"\n";
            }
        } else if(temps.compare("front")==0){
            if(q.empty()){
                cout<<-1<<"\n";
            } else{
                cout<<q.front()<<"\n";
            }
        } else if(temps.compare("back")==0){
            if(q.empty()){
                cout<<-1<<"\n";
            } else{
                cout<<q.back()<<"\n";
            }
        }
        n--;
    }
}