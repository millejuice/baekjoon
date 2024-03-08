#include <iostream>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t>0){
        int n;
        int count = 0;
        cin>>n;

        int temp_n = n;

        while(temp_n>0){
            temp_n = temp_n /2;
            count ++;
        }
        int location[count];

        for(int i = 0; i<count;i++){
            if(n%2 == 1){
                cout<<i<<" ";
            }
            n = n / 2;
        }

        t--;
        cout<<"\n";
    }
}