#include <iostream>
using namespace std;

int main(){
    int in;
    int out;
    int total[10] = {0};
    int dif = 0;
    int remain = 0;
    int greatest = -1;
    for(int i = 0; i<10; i++){
        cin>>out>>in;
        dif = in - out;
        remain += dif;
        total[i] = remain;
        if(total[i]>greatest){
            greatest = total[i];
        }
    }
    cout<<greatest;
}