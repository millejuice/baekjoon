#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <utility>
using namespace std;

int main(){
    std::ios_base::sync_with_stdio(false);
    int n;
    cin>>n;
    cin.ignore();
    // 비교하기 쉽게 pair< pair<year,month>, pair<day,name>>> 순서로 pair 생성
    vector<pair<pair<int,int>,pair<int,string>>> stu(n);

    for(int i=0;i<n;i++){
        cin >> stu[i].second.second >> stu[i].second.first >> stu[i].first.second >> stu[i].first.first;
    }
    // pair의 first를 가지곡 비교
    sort(stu.begin(),stu.end());
    cout<<stu[n-1].second.second<<"\n"<<stu[0].second.second<<endl;
}