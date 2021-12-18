/*
Kayvaun Khoshkhou
CSC340.04 Duc Ta 
Assignment 3 Part A
Tic Tac Toe in C++
Due 10/13/2020 11:59 PM
*/

#include <iostream>
using namespace std;

bool isWon(char, char[][3]);
bool isDraw(char[][3]);
void displayBoard(char[][3]);
void makeAMove(char[][3], char);

int main() {
	//
	//	PLEASE DO NOT CHANGE function main
	//
	char board[3][3] = { { ' ', ' ', ' ' },{ ' ', ' ', ' ' },{ ' ', ' ', ' ' } };
	displayBoard(board);

	while (true){
		makeAMove(board, 'X');
		displayBoard(board);

		if (isWon('X', board)){
			cout << "X player won" << endl;
			exit(0);
		}
		else if (isDraw(board)){
			cout << "No winner" << endl;
			exit(0);
		}

		makeAMove(board, 'O');
		displayBoard(board);

		if (isWon('O', board)){
			cout << "O player won" << endl;
			exit(0);
		}
		else if (isDraw(board)){
			cout << "No winner" << endl;
			exit(0);
		}
	}
	return 0;
}

bool isWon(char x, char board[][3]){
	for (int i = 0; i < 3; i++) {
		if (board[i][0] == x && board[i][1] == x && board[i][2] == x)
			return true;
		if (board[0][i] == x && board[1][i] == x && board[2][i] == x)
			return true;
	}
	if (board[0][0] == x && board[1][1] == x && board[2][2] == x)
		return true;
	if (board[0][2] == x && board[1][1] == x && board[2][0] == x)
		return true;
	return false;
}

bool isDraw(char board[][3]){
	int count = 0;
	for (int i = 0; i < 3; i++){
		for (int x = 0; x < 3; x++) {
			if (board[i][x] == 'X' || board[i][x] == 'O')
				count++;
		}
	}
	if (count != 9)
		return false;
	if (!isWon('X', board) && !isWon('O', board))
		return true;
}

void displayBoard(char board[][3]){
	cout << "-------------\n";
	for (int i = 0; i < 3; i++) {
		cout << "|";
		for (int x = 0; x < 3; x++) {
			cout << board[i][x] << "|";
		}
		cout << endl;
		cout << "-------------\n";
	}
}

void makeAMove(char board[][3], char x){

	while (true){
		cout << "Enter a row(0,1,2) for player " << x << ":";
		int y;
		cin >> y;
		int z;
		cout << "Enter a column(0,1,2) for player " << x << ":";
		cin >> z;
		if (y < 0 || y > 2 || z < 0 || z > 2) {
			cout << "Invalid Move\n";
		}
		else {
			if (board[y][z] != 'X' && board[y][z] != 'O') {
				board[y][z] = x;
				break;
			}
			else {
				cout << "This cell is already filled. Please try a different cell\n";
			}
		}
	}
}