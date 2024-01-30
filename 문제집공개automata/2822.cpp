#include <iostream>
#include <algorithm>
#include <cmath>
#include <vector>
using namespace std;

bool cmp(pair<int,int> &a, pair<int,int> &b){
    return a.first > b.first;
}

bool cmp_second(pair<int,int> &a, pair<int,int> &b){
    return a.second < b.second;
}

int main()
{
    // first는 점수, second는 인덱스
    vector<pair<int,int> > v(8);
    int sum = 0;
    for(int i=0;i<8;i++){
        cin>>v[i].first;
        v[i].second = i + 1;
    }
    sort(v.begin(),v.end(),cmp);
    for(int i=0;i<5;i++){
            sum += v[i].first;
    }
    cout<<sum<<"\n";
    sort(v.begin(),v.begin()+5,cmp_second);
    for(int i=0;i<5;i++){
        cout<<v[i].second<<" ";
    }
}