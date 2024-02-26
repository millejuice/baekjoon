#include <iostream>
#include <deque>
#include <string>
using namespace std;

void commandNumber(string command, deque<int> &q){
    int temp;
    if(command.compare("push_front") == 0){
        cin>>temp;
        q.push_front(temp);
    } else if(command.compare("push_back") == 0){
        cin>>temp;
        q.push_back(temp);
    } else if(command.compare("pop_front") == 0){
        if(q.empty()){
            cout<<-1<<"\n";
        } else{
            cout<<q.front()<<"\n";
            q.pop_front();
        }
    } else if(command.compare("pop_back") == 0){
        if(q.empty()){
            cout<<-1<<"\n";
        } else{
            cout<<q.back()<<"\n";
            q.pop_back();
        }
    } else if(command.compare("size") == 0){
        cout<<q.size()<<"\n";
    } else if(command.compare("empty") == 0){
        if(q.empty()){
            cout<<1<<"\n";
        } else{
            cout<<0<<"\n";
        }
    } else if(command.compare("front") == 0){
        if(q.empty()){
            cout<<-1<<"\n";
        } else{
            cout<<q.front()<<"\n";
        }
    } else if(command.compare("back") == 0){
        if(q.empty()){
            cout<<-1<<"\n";
        } else{
            cout<<q.back()<<"\n";
        }
    
    }
}

int main(){
    int n;
    cin>>n;
    deque<int> q;
    while(n>0){
        string command;
        cin>>command;
        cin.ignore();
        commandNumber(command,q);
        n--;
    }
}