#include <iostream>
using namespace std;

int main(){
    int n;
    cin>>n;

    int change[n];
    
    int quater = 25;
    int quarter_change[n];
    int quarter_remainder[n];

    int dime = 10;
    int dime_change[n];
    int dime_remainder[n];

    int nickel = 5;
    int nickel_change[n];
    int nickel_remainder[n];

    int penny = 1;
    int penny_change[n];


    for(int i=0;i<n;i++){
        cin>>change[i];
    }

    for(int i=0;i<n;i++){
        cout<<change[i]/25<<" "<<(change[i]%25)/10<<" "<<((change[i]%25)%10)/5<<" "<<((change[i]%25)%10)%5<<endl;
    }

    return 0;
}