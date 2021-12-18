//
// payment.cpp
//
// Kayvaun Khoshkhou
// 2/12/18
// To keep track of the remaining balance on a loan
// This program tells me the remaining balance I owe after each of the first
// three monthly payments.

#include <iostream>
#include <cmath>
#include <iomanip>

using namespace std;
int main()

{
    double k, pmt, i, n, balk, rate, y, x;
    cout << "Enter payment amount: ";
    cin >> pmt;
    cout << "Enter interest rate (9% as 0.09): ";
    cin >> rate;
    i = rate / 12.0;
    cout << "Enter number of payments: ";
    cin >> n;
    k = 1;

    y = pow( 1 + i, k - n);
    k++;
    x = (1-y)/i;
    balk = pmt * x;
    cout << "Payment #1 leaves a balance of: $" << balk << endl;

    y = pow( 1 + i, k - n);
    k++;
    x = (1-y)/i;
    balk = pmt * x;
    cout << "Payment #2 leaves a balance of: $" << balk << endl;

    y = pow( 1 + i, k - n);
    k++;
    x = (1-y)/i;
    balk = pmt * x;
    cout << "Payment #3 leaves a balance of: $" << balk;
    return 0;
}
