#include <iostream>

using namespace std;

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int alpha[26] = {0};
  string str;
  string res = "";

  cin >> str;

  for (char c : str) {
    alpha[c - 'a']++;
  }

  for (int i : alpha) {
    res += to_string(i) + " ";
  }
  
  cout << res;
}