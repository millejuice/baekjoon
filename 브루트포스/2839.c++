#include <iostream>
using namespace std;

int main(){
    int n;
    cin>>n;
    int numOfFive = n/5;
    int numOfThree = 0;
    int rest = 0;
    for(numOfFive; numOfFive>=0;numOfFive--){
        rest = n - (numOfFive*5);
        if(rest%3 == 0){
            numOfThree = rest/3;
            break;
        }
    }
    int count = numOfFive + numOfThree;
    if(count == 0){
        cout<<-1<<endl;
    } else{
        cout<<count<<endl;
    }
}