#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

bool cmp(pair<int,int> a, pair<int,int> b){
    if(a.second == b.second){
        return a.first<b.first;
    }
    return a.second<b.second;
}

int main(){
    int n = 0;
    cin>>n;
    cin.ignore();

    vector<pair<int,int> > v(n);
    for(int i = 0;i<n; i++){
        int x = 0;
        int y = 0;
        cin>>x>>y;
        v[i] = make_pair(x,y);
    }
    sort(v.begin(),v.end(),cmp);
    for(int i = 0;i<n;i++){
        cout<<v[i].first<<" "<<v[i].second<<"\n";
    }

}