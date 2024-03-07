#include <iostream>
#include <vector>
#include <random>
#include <string>
using namespace std;

string drawBall(vector<int>& box, int& total_white) {
    random_device rd;
    mt19937 gen(rd());
    uniform_int_distribution<> distrib(0, box.size() - 1);
    int drawIndex = distrib(gen);
    int draw = box[drawIndex];
    if(draw == 1){
        total_white++;
    }
    return draw == 0 ? "black" : "white";
}

int main() {
    vector<vector<int> > boxes(4, vector<int>{0, 1});

    int blackBallNum;
    int total_white = 0;
    for(int i = 1; i <= 4; i++){
        cout << i << "번 박스에 넣을 검은 공의 갯수: ";
        cin >> blackBallNum;

        // 입력받은 검은 공의 수만큼 해당 박스에 검은 공(0)을 추가합니다.
        if (blackBallNum >= 0 && blackBallNum <= 3) {
            for(int j = 0; j < blackBallNum; j++) {
                boxes[i - 1].push_back(0);
            }
        } else {
            cout << "잘못된 입력입니다. 프로그램을 종료합니다.\n";
            return 1;
        }
    }
    
    // 각 박스에서 공을 하나씩 뽑아서 그 색깔을 출력합니다.
    for (int i = 0; i < 4; ++i) {
        cout << i + 1 << "번 박스에서 뽑은 공의 색깔은: " << drawBall(boxes[i],total_white) << "입니다.\n";
    }
    cout << "총 흰 공의 갯수는: " << total_white << "입니다.\n";
    return 0;
}
