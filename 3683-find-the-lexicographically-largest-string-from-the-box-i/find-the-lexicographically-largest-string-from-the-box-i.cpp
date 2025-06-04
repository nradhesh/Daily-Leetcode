#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    string answerString(string word, int numFriends) {

        int N = word.size();
        if(numFriends == 1) return word;
        char c = *max_element(word.begin(), word.end());

        string max_string = "";
        for(int pos=0; pos<N; pos++) {
            if(word[pos] == c) {
                int l_allowed = min((int)(N - pos), N - numFriends + 1);

                if(l_allowed <= 0) continue;
                string s = word.substr(pos, l_allowed);

                if(s > max_string) {
                    max_string = s;
                }
            }
        }
        return max_string;
    }
};