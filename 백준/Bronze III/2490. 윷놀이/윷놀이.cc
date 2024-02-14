#include <iostream>

using namespace std;

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);

  for (int i = 0; i < 3; i++) {
  int a, b, c, d;
  string names = "DCBAE";
  cin >> a >> b >> c >> d; 
  int idx = a + b + c + d; 
  cout << names[idx] << "\n";
  } 
}