#include <iostream>
using namespace std;

int main(){
    int n;
    int count = 1;
    cin>>n;
    int temp = n;
    int m=0;
    int creator=0;
    int rest=0;
    int final=0;
    while(temp>9){
        temp/=10;
        count++;
    }
    int arr[count];
    for(int i=0;i<n;i++){
        rest = i;
        int j=0;
        while(rest>0){
            arr[j]=rest%10;
            creator+=arr[j];
            rest/=10;
            j++;
        }
        m=creator+i;
        if(m == n){
            final = i;
            cout<<i<<endl;
            break;
        } else{
            rest=0;
            creator=0;
            m=0;
        }
    }
    if(final == 0){
        cout<<0<<endl;
    }
}