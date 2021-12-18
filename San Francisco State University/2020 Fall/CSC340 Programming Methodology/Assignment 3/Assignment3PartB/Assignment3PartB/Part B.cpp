/*
Kayvaun Khoshkhou
CSC340.04 Duc Ta
Assignment 3 Part B
Tic Tac Toe in C++
Due 10/13/2020 11:59 PM
*/

#include <iostream>
#include <string>
#include <vector>

using namespace std;

bool isValid(string cardNumber);
int sumOfDoubleEvenPlace(string cardNumber);
int getDigit(int number);
int sumOfOddPlace(string cardNumber);

int main() {
	string cardNumber;

	vector<string> cardnumbers = {
	 "371449635398431", "4444444444444448", "4444424444444440", "4110144110144115",
	"4114360123456785", "4061724061724061", "5500005555555559", "5115915115915118",
	"5555555555555557", "6011016011016011", "372449635398431", "4444544444444448",
	"4444434444444440", "4110145110144115", "4124360123456785", "4062724061724061",
	"5501005555555559", "5125915115915118", "5556555555555557", "6011116011016011",
	 "372449635397431", "4444544444444448", "4444434444544440", "4110145110184115",
	"4124360123457785", "4062724061724061", "5541005555555559", "5125115115915118",
	"5556551555555557", "6011316011016011"
	}

	cout << "Enter card number: ";
	cin >> cardNumber;

	if (isValid(cardNumber))
		cout << cardNumber << " is a valid credit card number" << endl;
	else
		cout << cardNumber << " is not a valid credit card number" << endl;
}

bool isValid(string cardNumber) {
	int sum1 = sumOfDoubleEvenPlace(cardNumber);
	int sum2 = sumOfOddPlace(cardNumber);
	int sumF = sum1 + sum2;
	if (sumF % 10 == 0)
		return true;
	else
		return false;
}
int sumOfDoubleEvenPlace(string cardNumber) {
	int sum = 0;
	int length = cardNumber.size();
	for (int i = length - 2; i >= 0; i -= 2)
	{
		int digit = cardNumber[i] - '0';
		sum = sum + getDigit(2 * digit);
	}
	return sum;
}
int getDigit(int number) {
	if (number < 10)
		return number;
	else
	{
		int N1 = number / 10;
		int N2 = number % 10;
		return N1 + N2;
	}
}
int sumOfOddPlace(string cardNumber) {
	int sum = 0;
	int length = cardNumber.length();

	for (int i = length - 1; i >= 0; i -= 2)
	{
		int digit = cardNumber[i] - '0';
		sum = sum + digit;
	}
	return sum;
}