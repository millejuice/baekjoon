#include <iostream>
#include <string>

using namespace std;

int main(){
    int n;
    int count = 0;
    bool isCheck;
    cin>>n;
    string str[n];
    for(int i=0;i<n;i++){
        cin>>str[i];
        for(int j=0;j<str[i].length();j++){
            isCheck = true;
            int k = j+1;
            while(str[i][j] == str[i][k]){
                k++;
            }
            while(k<str[i].length()){
                if(str[i][j] == str[i][k]){
                isCheck = false;
                break;
                }else{
                isCheck = true;
                k++;
                }
            }
            if(isCheck==false){
                break;
            }
        }
        if(isCheck){
            count++;
        }
    }
    cout<<count<<endl;
}