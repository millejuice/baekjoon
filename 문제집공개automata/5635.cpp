#include <iostream>
#include <string>
#include <cmath>
#include <vector>
using namespace std;

int main(){
    int n;
    cin>>n;
    cin.ignore(); //getline이 cin과 같이 쓰일 때 버퍼에 남아있는 \n을 무시하기 위해 사용
    vector<string> stu(n);
    vector<string> name(n);
    vector<int> year(n),month(n),day(n);
    int max=-1,min=3000;
    int max_num,min_num;
    
    int max_month,min_month;
    int max_day,min_day;
    for(int i = 0;i<n;i++){
        getline(cin,stu[i]);
       int cnt = 0;
       int previous_blank = 0;
       for(int j=0;j<stu[i].length()-1;j++){
        if(stu[i][j] == ' '){
            if(cnt == 0){
                 name[i] = stu[i].substr(previous_blank,j);
                 previous_blank = j;
                cnt++;
            } else if(cnt == 1){
                day[i] = stoi(stu[i].substr(previous_blank,j));
                previous_blank = j;
                cnt++;
            } else if(cnt == 2){
                month[i] = stoi(stu[i].substr(previous_blank,j));
                previous_blank = j;
                cnt++;
            }
                year[i] = stoi(stu[i].substr(previous_blank,j));
        }
       }
       if(year[i]>max){
           max = year[i];
           max_month = month[i];
           max_day = day[i];
           max_num = i;
       }
       if(year[i]==max){
            if(month[i]>max_month){
                max_month = month[i];
                max_num = i;
            }
            if(month[i]==max_month){
                if(day[i]>max_day){
                    max_day = day[i];
                    max_num = i;
                }
            }
       }
       if(year[i]<min){
           min = year[i];
           min_month = month[i];
           min_num = i;
       }
       if(year[i] == min){
        if(min_month>month[i]){
            min_month = month[i];
            min_num = i;
        }
        if(min_month == month[i]){
            if(day[i]>min_day){
                min_day = day[i];
                min_num = i;
            }
        }   
       }
    }
    cout<<name[max_num]<<endl;
    cout<<name[min_num]<<endl;
}