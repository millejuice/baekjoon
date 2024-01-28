#include <iostream>
using namespace std;

int main(){
    int n,m;
    cin>>n>>m;
    int num = n - 7 + m - 7; //count들의 갯수
    int count[num];
    string board[n];
    for(int i=0;i<n;i++){
            cin>>board[i];        
    }
   for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        if((board[i][j]) ==  board[i+1][j] || (board[i][j] == board[i][j+1]))
        {
            cout<<n<< " "<<m<<endl;
            count[0]++;
        }
    }
   }
    cout<<count[0];
   

}