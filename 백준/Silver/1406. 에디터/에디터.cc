#include <iostream>
#include <list>
using namespace std;

int main() {
	list<char> l;
	string str;
	int m, i = 0;
	char cmd;

	cin >> str >> m;
	int len = str.length();
	while (len--) l.push_back(str[i++]);
	
	auto cursor = l.end();
	while (m--) {
		cin >> cmd;
		switch (cmd) {
		case 'L':
			if (cursor == l.begin()) break;
			else {
				cursor--;
			}
			break;
		case 'D':
			if (cursor == l.end()) break;
			else {
				cursor++;
			}
			break;
		case 'B':
			if (cursor != l.begin()) {
				cursor--;
				cursor = l.erase(cursor);
				}
			break;
		case 'P':
			cin >> cmd;
			l.insert(cursor, cmd);
			break;
		}
	}
	for (auto iter : l) {
		cout << iter;
	}
	return 0;
}