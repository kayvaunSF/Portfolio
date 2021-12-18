// Kayvaun Khoshkhou
// Desmund Chun CS14
// Assignment 1 Basic Input and Output
// Store Receipt from Shodd Dee

#include <iostream>
using namespace std;

int main()
{
    double one, two, three, four, five, total, shipping, tax;
    string customer;

    cout.precision(2);
    cout << "SHODD DEE MANUFACTURING" << endl;
    cout << "Enter customer number: ";
    cin  >> customer;
    if(customer[0] == '-')
    {
        cout << "No negative customer numbers" << endl;
        return 0;
    }

    cout << "Whizbangs      $ 5.00 each\n";
    cout << "Gizmos         $10.15 each\n";
    cout << "Widgets        $ 5.99 each\n";
    cout << "Wabbits        $ 7.75 each\n";
    cout << "Elmers         $ 9.50 each\n";

    cout << "How many Whizbangs?: ";
    cin  >> one;
            if(one < 0)
            {
                cout << "Please enter a valid number.";
                return 0;
            }

    cout << "How many Gizmos?: ";
    cin  >> two;
            if(two < 0)
            {
                cout << "Please enter a valid number.";
                return 0;
            }

    cout << "How many Widgets?: ";
    cin  >> three;
            if(three < 0)
            {
                cout << "Please enter a valid number.";
                return 0;
            }

    cout << "How many Wabbits?: ";
    cin  >> four;
            if(four < 0)
            {
                cout << "Please enter a valid number.";
                return 0;
            }

    cout << "How many Elmers?: ";
    cin  >> five;
            if(five < 0)
            {
                cout << "Please enter a valid number.";
                return 0;
            }

    cout << endl;
    cout << "Customer ID #" << customer << endl;

    cout << one << " Whizbangs @ $5.00        $" << fixed << 5.00 * one << endl;
    total = one * 5.00;
    cout << "Total so far: " << fixed << total << endl << endl;

    cout << two << " Gizmos @$10.15       $" << fixed << 10.15 * two << endl;
    total = total + (two * 10.15);
    cout << "Total so far: " << fixed << total << endl << endl;

    cout << three << " Widgets @$ 5.99        $" << fixed
    << 5.99 * three << endl;
    total = total + (three * 5.99);
    cout << "Total so far: " << fixed << total << endl << endl;

    cout << four << " Wabbits @$ 7.75       $" << fixed << 7.75 * four << endl;
    total = total + (four * 7.75);
    cout << "Total so far: " << fixed << total << endl << endl;

    cout << five << " Elmers @$ 9.50        $" << fixed << 9.50 * five << endl;
    total = total + (five * 9.50);
    cout << "Total so far: $" << fixed << total << endl << endl;

    tax = total * 0.095;
    shipping = total * 0.1;
    cout << "Sales tax: $" << tax << endl;
    cout << "Shipping and Handling cost: $" << shipping << endl;
    total = total + tax + shipping;
    cout << endl;
    cout << "=================================================================="
    << endl;
    cout << "Final total after Sales Tax and Shipping and handling: $" << total
    << endl;
    cout << "=================================================================="
    << endl << endl;

    cout << "Have a Shodd Dee'rrific day!" << endl;
    return 0;
}
