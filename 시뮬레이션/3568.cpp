#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); 
    cout.tie(NULL);
    
    string input;
    getline(cin, input);

    // 기본 변수형 추출
    string base = "";
    int type_pos = 0;
    for (int i = 0; i < input.size(); i++) {
        if (input[i] == ' ') {
            type_pos = i;
            break;
        }
    }
    base = input.substr(0, type_pos);
    string org = input.substr(type_pos + 1);

    // 변수명과 변수형 나누기
    string name = "";
    string type = "";
    for (int i = 0; i < org.size(); ) {
        if (org[i] == ',' || org[i] == ';') {
            // 변수형 역순
            string r_type = "";
            for (int j = type.size() - 1; j >= 0; j--) {
                if (type[j] == '[')
                    r_type += ']';
                else if (type[j] == ']')
                    r_type += '[';
                else
                    r_type += type[j];
            }

            // 출력
            cout << base << r_type << " " << name << ";" << "\n";

            // 초기화
            name = "";
            type = "";

            // 종료 조건
            if (org[i] == ';')
                break;
            else
                i += 2;  // 콤마와 스페이스를 건너뛰기
        } else if ((org[i] >= 'a' && org[i] <= 'z') || (org[i] >= 'A' && org[i] <= 'Z')) {
            name += org[i];
            i++;
        } else {
            type += org[i];
            i++;
        }
    }

    return 0;
}
